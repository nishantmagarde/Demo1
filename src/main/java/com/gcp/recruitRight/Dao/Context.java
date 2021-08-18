package com.gcp.recruitRight.Dao;

import org.springframework.context.ApplicationContext;

public class Context {
	private static ApplicationContext context;

	public static ApplicationContext getContext() {
		return context;
	}

	public void setContext(ApplicationContext context) {
		this.context = context;
	}

	public Context(ApplicationContext context) {
		super();
		this.context = context;
	}
	public Context() {
		
	}
	
}
