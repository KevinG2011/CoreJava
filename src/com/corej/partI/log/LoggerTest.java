package com.corej.partI.log;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerTest {
	private static final Logger myLogger = Logger.getLogger("com.corej.myapp");
	static {
		myLogger.setLevel(Level.INFO);
		myLogger.setUseParentHandlers(false);
		
		ConsoleHandler handler;
		try {
			handler = new ConsoleHandler();
			handler.setLevel(Level.FINE);
			myLogger.addHandler(handler);
		} catch (SecurityException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args)  throws Exception {
//		IOException exception = new IOException("...");
//		myLogger.throwing("com.corej.mylib.Reader", "read", exception);
//		throw exception;
		
	}

}
