package com.samfatu.onetoonechat;

import com.samfatu.onetoonechat.configuration.DatabasePopulator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class OneToOneChatApplication {

	private final DatabasePopulator databasePopulator;

	public OneToOneChatApplication(DatabasePopulator databasePopulator) {
		this.databasePopulator = databasePopulator;
	}

	public static void main(String[] args) {
		SpringApplication.run(OneToOneChatApplication.class, args);
	}

	@PostConstruct
	public void populateDatabase() {
		databasePopulator.populate();
	}
}
