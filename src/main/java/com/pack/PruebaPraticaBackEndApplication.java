package com.pack;

import java.util.concurrent.Executor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@SpringBootApplication
public class PruebaPraticaBackEndApplication {

	public static void main(String[] args) {
		SpringApplication.run(PruebaPraticaBackEndApplication.class, args);
	}
	
	 @Bean
	  public Executor taskExecutor() {
	    ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
	    executor.setCorePoolSize(10);
	    executor.setMaxPoolSize(30);
	    executor.setQueueCapacity(200);
	    executor.setThreadNamePrefix("PruebaPraticaBackEndApplication-");
	    executor.initialize();
	    return executor;
	  }

}
