package com.nortal.commander;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.util.List;

public class Uptime implements Command {
	
	
	
	@Override
	public void execute(List<String> arguments, Environment environment) {
		RuntimeMXBean rb = ManagementFactory.getRuntimeMXBean();
		long uptime = rb.getUptime();


		long second = (uptime / 1000) % 60;
		long minute = (uptime / (1000 * 60)) % 60;
		long hour = (uptime / (1000 * 60 * 60)) % 24;
		
		String time = String.format("%02d:%02d:%02d", hour, minute, second);


		System.out.println(time);
		
	}
	
}
