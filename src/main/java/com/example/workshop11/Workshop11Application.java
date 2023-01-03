package com.example.workshop11;

import java.util.Collections;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Workshop11Application {
	private static final Logger logger = LoggerFactory.getLogger(Workshop11Application.class);
	public static String portNumber=null;
	public static final String DEFAULT_PORT="8080";
	public static void main(String[] args) {
		//logger.info("Args: "+args);
		for(String argVal : args){
			logger.debug("argVal: "+argVal);
			if(argVal.contains("--port=")){
				portNumber=argVal.substring(argVal.length()-4,argVal.length());
				logger.debug("portNumber: "+portNumber);
			}
		}
		if(portNumber==null){
			portNumber=System.getenv("APP_PORT");
			logger.debug("Sys Env portNumber: "+portNumber);
		}
		if(portNumber==null){
			portNumber=DEFAULT_PORT;
		}
		SpringApplication app = new SpringApplication(Workshop11Application.class);
		app.setDefaultProperties(Collections.singletonMap("server.port", portNumber));
		app.run(args);
		//SpringApplication.run(Workshop11Application.class, args);
	}

}
