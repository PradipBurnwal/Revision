package com.doa.util;

import java.util.List;

import com.doa.accessor.IAccessor;

public class CacheManager {
	private Cache cache;
	private List<IAccessor> accessors;
	public CacheManager(Cache cache, List<IAccessor> accessors) {
		this.cache = cache;
		this.accessors = accessors;
		initialize();
	}
	private void initialize() {
		for(IAccessor accessor : accessors){
			cache.put(accessor.getKey(), accessor.getData());
		}
	}
	
	
}
