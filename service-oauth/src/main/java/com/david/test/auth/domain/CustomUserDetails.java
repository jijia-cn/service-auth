package com.david.test.auth.domain;

import java.util.Arrays;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;

public class CustomUserDetails extends User {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private CustomUser user;

	public CustomUserDetails(CustomUser user) {
		super(user.getUsername(), user.getPassword(), true, true, true, true, Arrays.asList(new GrantedAuthority[]{
			new SimpleGrantedAuthority("ROLE_USER")
		}));
		this.user = user;
	}

	public CustomUser getUser() {
		return user;
	}

	public void setUser(CustomUser user) {
		this.user = user;
	}
}
