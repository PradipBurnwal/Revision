package com.usingAbstractClass.resource;

import java.io.IOException;
import java.io.InputStream;

import javax.ws.rs.Path;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.usingAbstractClass.dto.Account;
import com.usingAbstractClass.exception.FreechargeFailure;

@Path("/b2b-freecharge")
public class B2BFreechargeWallet extends FreeChargeWallet{

	@Override
	protected byte[] buildRegistrationResponse(Account account) {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<register-response>").append("<account-no>")
		.append(account.getAccountNo()).append("</account-no>").append("</register-response>");
		
		return buffer.toString().getBytes();
	}

	@Override
	protected Account buildAccount(InputStream in) {
		DocumentBuilderFactory factory = null;
		DocumentBuilder builder = null;
		Document doc = null;
		Account account = null;
		Node rootNode = null;
		NodeList children = null;
		Node child = null;
		String name = null;
		String value = null;
		
		try {
			factory = DocumentBuilderFactory.newInstance();
			builder = factory.newDocumentBuilder();
			doc = builder.parse(in);
			account = new Account();
			
			rootNode = doc.getFirstChild();
			children = rootNode.getChildNodes();
			for(int i=0;i<children.getLength();i++){
				child = children.item(i);
				if(child.getNodeType()==Node.ELEMENT_NODE){
					name=child.getNodeName();
					value = child.getFirstChild().getTextContent();
					
					if(name.equals("mobile")){
						account.setMobile(value);
					}else if(name.equals("account-holder-name")) {
						account.setAccountHolderName(value);
					}
				}
			}
		} catch (ParserConfigurationException | SAXException | IOException e) {
			throw new FreechargeFailure("unable to register",e);
		} 
		return account;
	}
	

}
