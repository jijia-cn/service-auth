package com.david.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.ResourceServerTokenServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
	
	@Autowired
	ResourceServerTokenServices resourceServerTokenServices;
	
	@GetMapping("/sayHello")
    private String sayHello(@RequestParam String accessToken){
		OAuth2Authentication oAuth2Authentication = resourceServerTokenServices.loadAuthentication(accessToken);
        System.out.println(oAuth2Authentication);
        System.out.println(oAuth2Authentication.getUserAuthentication().getName());
		System.out.println("Hello World");
        return "Hello World";
    }
}
