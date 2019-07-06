package com.david.test.auth;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

@Configuration
@EnableResourceServer
public class ResourceServerConfiguration extends ResourceServerConfigurerAdapter{

	@Override
	public void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/login").permitAll()
		.antMatchers("/oauth/**").permitAll()
		.antMatchers("/**").authenticated()
        .anyRequest().authenticated();
		
//		http.addFilterBefore(new CustomAuthenticationProcessingFilter(), 
//				UsernamePasswordAuthenticationFilter.class);
	}

}
