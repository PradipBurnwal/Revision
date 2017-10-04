package com.usingAbstractClass.exception;

public class FreechargeFailure extends RuntimeException {

	public FreechargeFailure(String message, Throwable cause) {
		super(message, cause);
	}

	public FreechargeFailure(String message) {
		super(message);
	}
	
}
