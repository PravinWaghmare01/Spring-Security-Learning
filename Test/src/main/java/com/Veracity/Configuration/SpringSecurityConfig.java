package com.Veracity.Configuration;
import static org.springframework.security.config.Customizer.withDefaults;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
public class SpringSecurityConfig {
	
	
	@Bean
	SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) {
		http.authorizeHttpRequests((requests) -> requests
				.requestMatchers(HttpMethod.GET, "/api/admin","/api/user").authenticated()
				.requestMatchers(HttpMethod.GET, "/api/welcome").permitAll()// To expose all method publicly then we are using permitAll() method
				.anyRequest().authenticated()
				);
		http.formLogin(withDefaults());
		http.httpBasic(withDefaults());
		return http.build();

}
	

}