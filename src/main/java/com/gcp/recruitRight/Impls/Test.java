package com.gcp.recruitRight.Impls;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.gcp.recruitRight.JdbcConfig;
import com.gcp.recruitRight.Dao.Context;
import com.gcp.recruitRight.Dao.User;
import com.gcp.recruitRight.dbUtil.DBUtil;



public class Test {
	DBUtil dbutil=new DBUtil();
	static ApplicationContext c=Context.getContext();
	public void insert(User u)
	{
		JdbcTemplate template =c.getBean("jdbcTemplate",JdbcTemplate.class);
		String query="insert into user(id,name,city,status) values(?,?,?,?)";
		int insert = template.update(query,u.getId(),u.getName(),u.getCity(),u.getStatus());
		System.out.println("inserted row : "+insert);
	}
	
	public void update(User u)
	{
		JdbcTemplate template =c.getBean("jdbcTemplate",JdbcTemplate.class);
		String query="update user SET city=? where name = ?";
		int update = template.update(query,"Pune",u.getName());
		System.out.println("updated row : "+update);
	}
	public void delete(User u)
	{
//		ApplicationContext context1 = dbutil.jdbcContext();
		JdbcTemplate template =c.getBean("jdbcTemplate",JdbcTemplate.class);
		String query="delete from user where id = ?";
		int update = template.update(query,u.getId());
		System.out.println("deleted row : "+update);
	}
	public void select()
	{
		//ApplicationContext context1 = dbutil.jdbcContext();
		JdbcTemplate template =c.getBean("jdbcTemplate",JdbcTemplate.class);
		String query="select * from user";
		List<User> user=template.query(query, new RowMapperImplementation());
		for(User u : user) {
			System.out.println(u);
		}
	}
//	public void select()
//	{
//		User user=new User();
////		ApplicationContext context1 = dbutil.jdbcContext();
//		JdbcTemplate template =c.getBean("jdbcTemplate",JdbcTemplate.class);
//		String query = "Select * from user where userId=?";
//		User user1 = template.queryForObject(query, new RowMapperImplementation(),user.getId());
//	}
	}


