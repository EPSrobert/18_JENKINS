package com.goodee.ex18.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.goodee.ex18.service.FreeBoardService;
import com.goodee.ex18.service.FreeBoardServiceImpl;

@Configuration
public class ServiceConfig {

	@Bean
	public FreeBoardService freeBoardService() {
		return new FreeBoardServiceImpl();
	}
}

