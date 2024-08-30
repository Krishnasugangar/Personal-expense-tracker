package com.expenseTracker.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.expenseTracker.model.User;
import com.expenseTracker.util.DBConnection;


public class UserDAO {
public User getUserByUsername(String username) {
	User user = null;

	String query = "select * from users where username=?";

	try{Connection con = DBConnection.getConnection();
			PreparedStatement ps = con.prepareStatement(query);

		ps.setString(1, username);
		ResultSet rs  =ps.executeQuery();
		if(rs.next()) {
			user = new User();
			user.setId(rs.getInt("id"));
		    user.setUsername(rs.getString("username"));
		    user.setPassword(rs.getString("password"));
		    user.setEmail(rs.getString("email"));

		}
	}catch(SQLException e) {
		e.printStackTrace();

	}
	return user;
}
}
