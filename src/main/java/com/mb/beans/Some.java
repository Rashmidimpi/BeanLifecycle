package com.mb.beans;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Some {
	@PostConstruct
	public void init() {
		System.out.println("init()");
		
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("destroy()");
		
	}

}
