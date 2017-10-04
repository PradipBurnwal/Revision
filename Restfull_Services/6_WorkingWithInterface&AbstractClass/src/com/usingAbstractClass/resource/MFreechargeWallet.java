package com.usingAbstractClass.resource;

import java.io.IOException;
import java.io.InputStream;

import javax.ws.rs.Path;

import com.usingAbstractClass.dto.Account;
import com.usingAbstractClass.exception.FreechargeFailure;

@Path("/m-freecharge")
public class MFreechargeWallet extends FreeChargeWallet{

	@Override
	protected byte[] buildRegistrationResponse(Account account) {
		return account.getAccountNo().getBytes();
	}

	@Override
	protected Account buildAccount(InputStream in) {
		//To read Data and store in a buffer
		StringBuffer buffer = null;
		int c =0;
		//break the string into store in a string-array
		String[] field = null;
		//To modify the Account class Attribute
		Account account = null;
		
		buffer = new StringBuffer();
		try {
			while ((c= in.read())!=-1) {
				buffer.append((char)c);
			}
			in.close();
		} catch (IOException e) {
			throw new FreechargeFailure("unable to register",e);
		}
		field = buffer.toString().split(",");
		account = new Account();
		account.setMobile(field[0]);
		account.setAccountHolderName(field[1]);
		
		return account;
	}

}
