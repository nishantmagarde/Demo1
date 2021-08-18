package com.gcp.recruitRight.Impls;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import com.gcp.recruitRight.Dao.User;
public class RowMapperImplementation implements RowMapper<User>{

	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User user=new User();
		user.setId(rs.getInt(1));
		user.setName(rs.getString(2));
		user.setCity(rs.getString(3));
		user.setStatus(rs.getString(4));
		return user;
	}
}
