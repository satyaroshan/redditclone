package com.reddit.redditclone;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.reddit.redditclone.domain.Comment;
import com.reddit.redditclone.domain.Link;
import com.reddit.redditclone.repository.CommentRepository;
import com.reddit.redditclone.repository.LinkRepository;

@SpringBootApplication
@EnableJpaAuditing
@EnableAutoConfiguration
public class RedditcloneApplication {
	
	private static final Logger log=LoggerFactory.getLogger(RedditcloneApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(RedditcloneApplication.class, args);
		System.out.println("Welcome to SpringBoot Project!");
	}
	
	@Bean
	CommandLineRunner runner(LinkRepository linkRepository, CommentRepository commentRepository) {
	    return args -> {
	        Link link = new Link("Getting Started with Spring Boot 2","https://therealdanvega.com/spring-boot-2");
	        link.setCreatedBy("satya");
	        linkRepository.save( link );
	        System.out.println("satya is a good boy");
	        Comment comment = new Comment("This Spring Boot 2 Link is awesome",link);
	        commentRepository.save(comment);
	        link.addComment(comment);
	        System.out.println("Works Fine");
	        Link firstlink=linkRepository.findByTitle("Getting Started with Spring Boot 2");
	        System.out.println(firstlink.getTitle());
	        
	        
	    };
	}
	
//	@Bean
//	@Profile("dev")
//	CommandLineRunner runner()
//	{
//		return args->{
//			System.out.println(user.getWelMssg());
//		};
//	}
//	
//	
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
