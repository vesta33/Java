package com.nortal.commander;

import java.util.List;


public class Echo implements Command {
    @Override
    public void execute(List<String> arguments, Environment environment) {
    	for(String arg : arguments){
    		if(arg.startsWith("$")){
    			String key = arg.substring(1);
    			String value = environment.getMap().get(key);
    			System.out.println(value);
    		} else {
    			System.out.print(arg + " ");
    		}
    	}
    	System.out.println("");
    }
}