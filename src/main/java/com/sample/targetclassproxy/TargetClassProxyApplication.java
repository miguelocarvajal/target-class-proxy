package com.sample.targetclassproxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = TargetClassProxyApplication.class)
@EntityScan(basePackageClasses = TargetClassProxyApplication.class)
public class TargetClassProxyApplication {
	public static void main(String[] args) {
		SpringApplication.run(TargetClassProxyApplication.class, args);
	}

	//This is here just to ensure that the Repository is processed by the CustomSecurityMetadataSource
	@Bean
	public Domain test(MyRepository myRepo) {
	    return new Domain();
	}
}
