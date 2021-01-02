package com.app.main;

import org.apache.log4j.Logger;

import com.app.service.HelloLogService;

public class HelloLog4j {
	
	private static Logger log = Logger.getLogger(HelloLog4j.class);
	
	public static void main(String[] args) {
		
		log.trace("Hello from TRACE");
		log.trace("Hello from DEBUG");
		log.trace("Hello from INFO");
		log.trace("Hello from WARN");
		log.trace("Hello from ERROR");
		log.trace("Hello from FATAL");
		
		HelloLogService service = new HelloLogService();
		service.helloLog();
		
	}

}
