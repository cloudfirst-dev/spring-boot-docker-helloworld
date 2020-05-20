package dev.cloudfirst.spring.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping(value="/", method=RequestMethod.GET)
  public String helloWorld() {
    return "Hello World!!!";
  }
	
	@RequestMapping(value="/test", method=RequestMethod.GET)
  public String helloWorld() {
    return "Test World!!!";
  }
}
