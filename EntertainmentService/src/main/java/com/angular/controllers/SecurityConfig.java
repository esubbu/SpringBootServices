package com.angular.controllers;

import org.springframework.context.annotation.Configuration;


//@Configuration
public class SecurityConfig /*extends WebSecurityConfigurerAdapter*/{
	
	/*@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception{
		
		auth.inMemoryAuthentication().withUser("subbu").password("{noop}pass").roles("USER")
		.and().withUser("admin1").password("{noop}admin").roles("USER","ADMIN");
	}
	
	 @Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.httpBasic().and().authorizeRequests().antMatchers("/welcome").hasRole("USER")
		.antMatchers("/**").hasRole("ADMIN")
		.anyRequest().fullyAuthenticated();
		
	}*/

}
