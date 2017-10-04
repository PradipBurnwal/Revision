package com.usingAbstractClass.resource;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.UUID;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.StreamingOutput;

import com.usingAbstractClass.dto.Account;

abstract public class FreeChargeWallet {
	@POST
	@Consumes({MediaType.TEXT_PLAIN,MediaType.APPLICATION_XML})
	@Produces({MediaType.TEXT_PLAIN,MediaType.APPLICATION_XML})
	public StreamingOutput register(InputStream in){
		Account account = null;
		//How to read data data and store in account attribute
		account = buildAccount(in);
		//generate account no randomlly
		account.setAccountNo(UUID.randomUUID().toString());
		//apply logic to build output
		final byte[] responseData = buildRegistrationResponse(account);
		//write the output in OutputStream using StreamingOutput
		return new StreamingOutput() {
			
			@Override
			public void write(OutputStream os) throws IOException, WebApplicationException {
				os.write(responseData);
				os.close();
			}
		};
		
	}

	abstract protected byte[] buildRegistrationResponse(Account account);

	abstract protected Account buildAccount(InputStream in);
	
}
