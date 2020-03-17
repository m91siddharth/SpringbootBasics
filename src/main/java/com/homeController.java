package com;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class homeController {

	    @RequestMapping("/")
	    public String index() {
	        return  "Hello World";
	    }
}
