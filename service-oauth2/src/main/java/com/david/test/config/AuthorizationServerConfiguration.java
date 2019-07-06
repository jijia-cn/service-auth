package com.david.test.config;

import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;

public class AuthorizationServerConfiguration extends AuthorizationServerConfigurerAdapter{

	@Override
	public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
		// TODO Auto-generated method stub
		clients.inMemory() // 使用in-memory存储
        .withClient("client") // client_id
        .secret("secret") // client_secret
        .authorizedGrantTypes("authorization_code") // 该client允许的授权类型
        .scopes("app"); // 允许的授权范围
	}

}
