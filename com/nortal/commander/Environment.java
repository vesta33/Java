package com.nortal.commander;

import java.util.HashMap;
import java.util.Map;

public class Environment {
	private Map<String, String> map = new HashMap<String, String>();

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	  
	public void addElementToMap (String key, String value) {
		this.map.put(key, value);
	}
	
}
