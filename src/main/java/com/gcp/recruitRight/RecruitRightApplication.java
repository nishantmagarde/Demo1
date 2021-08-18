package com.gcp.recruitRight;


import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.repository.CrudRepository;
import org.springframework.jdbc.core.JdbcTemplate;

import com.gcp.recruitRight.Dao.Context;
import com.gcp.recruitRight.Dao.User;
import com.gcp.recruitRight.Impls.Test;


@SpringBootApplication
public class RecruitRightApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(RecruitRightApplication.class, args);
		new Context(context);
		System.out.println("1. Insert\n 2. Update\n 3. Select\n 4. Delete");
		Scanner sc=new Scanner(System.in);
		Test test = new Test();
		int n=sc.nextInt();
		User u;
		switch(n)
		{
		case 1:
			u=new User(1,"Nishant","Hyd","Hello");
			//u=new User(2,"Teja","Hyd","Hello");
			test.insert(u);
			break;
		case 2:
			u=new User();
			u.setName("Nishant");
			test.update(u);
			break;
		case 4:
			u=new User();
			u.setId(2);
			test.delete(u);
			break;
		case 3:
			test.select();
			break;
		}
		

	}

}
