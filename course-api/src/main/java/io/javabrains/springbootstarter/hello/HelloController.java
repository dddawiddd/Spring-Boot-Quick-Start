package io.javabrains.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  //make request	
public class HelloController {
 
	@RequestMapping("/hello")  //tells spring framework when will be request for URL /hello this method will be executed (maps only to get method by default)
	public String sayHi() {
		return "Hi";
 }
}
