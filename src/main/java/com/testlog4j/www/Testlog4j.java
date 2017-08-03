package com.testlog4j.www;

import org.apache.log4j.Logger;

public class Testlog4j {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(Testlog4j.class);

	public static void main(String[] args) {
	
		logger.debug("main(String[]) - start");
		
		System.out.println("hhah1");
		logger.debug("main(String[]) - end");
		
	}
}
