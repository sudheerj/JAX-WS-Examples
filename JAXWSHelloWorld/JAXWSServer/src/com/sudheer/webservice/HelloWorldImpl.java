package com.sudheer.webservice;
import javax.jws.WebService;

@WebService(endpointInterface="com.sudheer.webservice.HelloWorld")
public class HelloWorldImpl implements HelloWorld{

 public String helloWorld(String name) {
  return "Hello world from user: "+name;
 }

}
