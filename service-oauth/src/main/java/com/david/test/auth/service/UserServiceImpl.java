package com.david.test.auth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.david.test.auth.domain.CustomUser;
import com.david.test.auth.domain.CustomUserDetails;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	PasswordEncoder passwordEncoder;

	@Override
	public UserDetails loadUserByUsername(String arg0) throws UsernameNotFoundException {
		/*模拟数据库操作*/
        CustomUser user = new CustomUser();
        user.setUsername("10086");
        user.setPassword(passwordEncoder.encode("123456"));
        return new CustomUserDetails(user);
	}

}
