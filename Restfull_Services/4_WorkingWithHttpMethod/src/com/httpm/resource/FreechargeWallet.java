package com.httpm.resource;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.StreamingOutput;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.httpm.dto.Account;
import com.httpm.dto.AddCash;

@Path("/freecharge")
public class FreechargeWallet {
	private Map<String, Account> accountMap;

	public FreechargeWallet() {
		accountMap = new ConcurrentHashMap<String, Account>();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.TEXT_PLAIN)
	
	public StreamingOutput register(InputStream in) throws ParserConfigurationException, SAXException, IOException{
		Account account = null;
		RegisterStreamingOutputHandler outputHandle = null;
		
		account = buildAccount(in);
		//generate AccountNo
		account.setAccountNo(UUID.randomUUID().toString());
		accountMap.put(account.getMobile(), account);
		outputHandle = new RegisterStreamingOutputHandler(account.getMobile(),account.getAccountNo());
		return outputHandle;
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public StreamingOutput addCash(InputStream in) throws Exception{
		AddCash addCash = null;
		Account account = null;
		AddCashStreamOutputHandler addCashOutputHandler = null;
		
		addCash = buildAddCash(in);
		account = accountMap.get(addCash.getMobile());
		if(account==null){
			throw new Exception("Account not available");
		}
		account.setBalnce(account.getBalnce()+addCash.getAccount());
		addCashOutputHandler = new AddCashStreamOutputHandler(account.getMobile(),account.getBalnce());
		return addCashOutputHandler;
	}
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public float getWalletBalance(@QueryParam("mobile")String mobile) throws Exception{
		Account account = null;
		account = accountMap.get(mobile);
		if(account==null){
			throw new Exception("account not available");
		}
		return account.getBalnce();
	}
	
	@DELETE
	@Produces(MediaType.TEXT_PLAIN)
	public String deActivateAccount(@QueryParam("mobile")String mobile) throws Exception{
		if(accountMap.containsKey(mobile)){
			accountMap.remove(mobile);
			return "Account Deactivated";
		}
		throw new Exception("Account Not Available");
	}

	private Account buildAccount(InputStream in) throws ParserConfigurationException, SAXException, IOException {
		DocumentBuilderFactory factory = null;
		DocumentBuilder builder = null;
		Document accountDoc = null;
		Node registerNode = null;
		NodeList children = null;
		Account account = null;
		Node child = null;
		String name = null;
		String value = null;
		
		factory = DocumentBuilderFactory.newInstance();
		builder = factory.newDocumentBuilder();
		accountDoc = builder.parse(in);
		registerNode = accountDoc.getFirstChild();
		
		children = registerNode.getChildNodes();
		if(children!=null && children.getLength()>0){
			account = new Account();
			
			for(int i=0;i<children.getLength();i++){
				child =children.item(i);
				if(child.getNodeType()==Node.ELEMENT_NODE){
					name = child.getNodeName();
					value = child.getFirstChild().getTextContent();
					
					if(name.equals("mobile")){
						account.setMobile(value);
					}else if (name.equals("member-name")) {
						account.setMemberName(value);
					}else if (name.equals("email-address")) {
						account.setEmailAddress(value);
					}else if (name.equals("password")) {
						account.setPassword(value);
					}else if (name.equals("balance")) {
						account.setBalnce(Float.parseFloat(value));
					}
				}
			}
		}
		
		return account;
	}
	private final class RegisterStreamingOutputHandler implements StreamingOutput{
		  private String mobile;
		  private String accountNo;
		public RegisterStreamingOutputHandler(String mobile, String accountNo) {
			this.mobile = mobile;
			this.accountNo = accountNo;
		}
		@Override
		public void write(OutputStream os) throws IOException, WebApplicationException {
			StringBuffer buffer = null;
			buffer = new StringBuffer();
			buffer.append("<account-info>").append("<mobile>").append(mobile)
			.append("</mobile>").append("<account-no>").append(accountNo)
			.append("</account-no>").append("</account-info>");
			os.write(buffer.toString().getBytes());
			os.close();
		}
		
	}
	private final class AddCashStreamOutputHandler implements StreamingOutput{
		private String mobile;
		private float balance;
		
		public AddCashStreamOutputHandler(String mobile, float balance) {
			super();
			this.mobile = mobile;
			this.balance = balance;
		}

		@Override
		public void write(OutputStream outputStream) throws IOException, WebApplicationException {
			StringBuffer buffer = new StringBuffer();
			buffer.append("<add-cash-receipt>").append("<mobile>").append
			(mobile).append("</mobile").append("<balance").append(balance)
			.append("</balance").append("</add-cash-receipt>");
		}
		
	}
	private AddCash buildAddCash(InputStream in) throws ParserConfigurationException, SAXException, IOException {
		DocumentBuilderFactory factory = null;
		DocumentBuilder builder = null;
		Document addCashDoc = null;
		Node rootNode = null;
		NodeList children = null;
		AddCash addCash = null;
		Node child = null;
		String name = null;
		String value = null;
		
		factory = DocumentBuilderFactory.newInstance();
		builder = factory.newDocumentBuilder();
		addCashDoc = builder.parse(in);
		
		rootNode = addCashDoc.getFirstChild();
		children = rootNode.getChildNodes();
		addCash = new AddCash();
		for(int i=0; i<children.getLength();i++){
			child = children.item(i);
			if(child.getNodeType()==Node.ELEMENT_NODE){
				name = child.getNodeName();
				value = child.getFirstChild().getTextContent();
				
				if(name.equals("mobile")){
					addCash.setMobile(value);
				}else if (name.equals("amount")) {
					addCash.setAccount(Float.parseFloat(value));
				}else if (name.equals("card-no")) {
					addCash.setCardNo(value);
				}else if (name.equals("cvv")) {
					addCash.setCvv(Integer.parseInt(value));
				}else if (name.equals("expiry")) {
					addCash.setExpiry(value);
				}
			}
		}
		
		return addCash;
	}
}
