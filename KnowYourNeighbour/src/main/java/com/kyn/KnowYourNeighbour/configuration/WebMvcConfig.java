package com.kyn.KnowYourNeighbour.configuration;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//Cross Origins Mapping
@Configuration
public class WebMvcConfig implements WebMvcConfigurer{

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**")
		.allowedOriginPatterns("*")//use allowedOriginPatterns instead of allowedOrigin
		.allowedMethods("GET","POST")// Allowed Method for Register, Login, View and Search
		.allowedHeaders("*")
		.allowCredentials(true);//Allow for Credentials(Roles)
	}

}