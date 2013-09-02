package com.sudheer.webservice.client;

import com.sudheer.webservice.HelloWorld;
import com.sudheer.webservice.HelloWorldImplService;


public class JAXWSClient {

	public static void main(String[] args){
				HelloWorldImplService helloWorldService = new HelloWorldImplService();
				HelloWorld helloWorld = helloWorldService.getHelloWorldImplPort();
				System.out.println(helloWorld.helloWorld("Sudheer"));
	}
}

