package com.doa.accessor;

public abstract class AbstractAccessor implements IAccessor {
	protected String key;

	public AbstractAccessor(String key) {
		this.key = key;
	}

	@Override
	public String getKey() {
		return key;
	}
	
	
}
