//package com.cts.demo.config;
//import org.springframework.beans.factory.annotation.Autowired;
//
//
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//
//
//
//
//	@Configuration
//	@EnableWebSecurity
//	public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
//		
//		@Autowired
//		ServiceConfig serviceConfig;
//		
//		@Override
//		protected void configure(AuthenticationManagerBuilder auth) throws Exception
//		{
//			System.out.println(serviceConfig.getUsername()+":"+serviceConfig.getPassword());
//			auth.inMemoryAuthentication()
//			.withUser(serviceConfig.getUsername()).password("{noop}"+serviceConfig.getPassword()).authorities("ROLE_ADMIN");
//		}
//		
//		@Override
//		protected void configure(HttpSecurity http) throws Exception
//		{
//			http
//			.cors().and()
//			.csrf().disable()
//			.authorizeRequests()
//			.anyRequest().authenticated()
//			.and().httpBasic();
//		}
//		 
//		}
//
