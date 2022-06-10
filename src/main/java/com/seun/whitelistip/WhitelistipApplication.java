package com.seun.whitelistip;

import com.seun.whitelistip.model.IpDataStore;
import com.seun.whitelistip.service.IpDataStoreService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class WhitelistipApplication{

	public static void main(String[] args) {
		SpringApplication.run(WhitelistipApplication.class, args);
	}

}
