package com.gcp.recruitRight.dbUtil;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.gcp.recruitRight.JdbcConfig;

public class DBUtil {
	ApplicationContext context=null;
	public ApplicationContext jdbcContext() {
		if(context!=null){
	ApplicationContext context1 = new AnnotationConfigApplicationContext(JdbcConfig.class);
	}
		return context;
	}
}
