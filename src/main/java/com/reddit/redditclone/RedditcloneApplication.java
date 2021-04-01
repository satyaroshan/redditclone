package com.reddit.redditclone;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
@EnableConfigurationProperties(UserdefinedProperties.class)
public class RedditcloneApplication {

	@Autowired 
	private UserdefinedProperties user;
	
	private static final Logger log=LoggerFactory.getLogger(RedditcloneApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(RedditcloneApplication.class, args);
		System.out.println("Welcome to SpringBoot Project!");
	}
	
	@Bean
	@Profile("dev")
	CommandLineRunner runner()
	{
		return args->{
			System.out.println(user.getWelMssg());
		};
	}
	
	
	@Bean
	CommandLineRunner runner1()
	{
		return args->{
			log.debug("Debug");
			log.info("Info");
			log.error("error");
			log.warn("Warning");
		};
	}
	
	

}
