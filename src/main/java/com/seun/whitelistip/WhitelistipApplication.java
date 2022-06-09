package com.seun.whitelistip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class WhitelistipApplication {

	public static void main(String[] args) {
		SpringApplication.run(WhitelistipApplication.class, args);
	}

	public Set<String> whitelist = new HashSet<>();
}
