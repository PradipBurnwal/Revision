package com.httpm.application;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.httpm.resource.FreechargeWallet;

@ApplicationPath("/rest")
public class FreechargeWalletApplication extends Application {
	private Set<Object> singleton;
	
	public FreechargeWalletApplication() {
		singleton = new HashSet<Object>();
		singleton.add(new FreechargeWallet());
	}

	@Override
	public Set<Object> getSingletons() {
		return singleton;
	}
	
}
