package com.itcindia.exceptionTest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.itcindia.dto.Account;
import com.itcindia.exception.AccountLockedException;
import com.itcindia.service.BankingService;

public class BankingServiceTest {
	private BankingService bankingService;
	private Account activeAccount;
	
	public BankingServiceTest() {
		//no code
	}
	
	@Before
	public void init(){
		bankingService = new BankingService();
		activeAccount = new Account("ac1001", "Sandeep", "active");
	}
	
	@Test
	public void testActiveAccount(){
		Account actualAccount = null;
		
		actualAccount = bankingService.getAccountDetails("ac1001");
		Assert.assertEquals(activeAccount, actualAccount);
	}
	
	@Test(expected=AccountLockedException.class)
	public void testLockedAccount(){
		bankingService.getAccountDetails("ac001");
	}
	
	@After
	public void cleanUp(){
		bankingService = null;
	}
}