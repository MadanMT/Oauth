package com.tutorial.oauth2;

import com.tutorial.oauth2.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@SpringBootApplication
@EnableAuthorizationServer
public class Oauth2Application {

	public static void main(String[] args) {
//			BCryptPasswordEncoder bcryptPasswordEncoder = new BCryptPasswordEncoder();
//			String pwd = bcryptPasswordEncoder.encode("password");
//			System.out.println(pwd);
		SpringApplication.run(Oauth2Application.class, args);
	}

//	@Autowired
//	public void authenticationManager(AuthenticationManagerBuilder builder, UserRepository repository) throws Exception{
//		builder.userDetailsService(new UserDetailsService() {
//			@Override
//			public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//				System.out.println("======================"+username);
//				System.out.println("======================"+username);
//				return new CustomUserDetails(repository.findByuserName(username));
//			}
//		});
//	}
}
