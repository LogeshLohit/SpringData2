package com.logesh.JPATest.student.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDAO {

	private DataSource dataSource;

	@Autowired
	public void setDataSource(DataSource db) {
		this.dataSource = db;
	}

	public void addStudent(String name) {
		Connection con = null;
		try {
			con = dataSource.getConnection();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			System.out.println(dataSource.getConnection() == null);
			PreparedStatement stmt = dataSource.getConnection()
					.prepareStatement("insert into student( name ) values (?)");
			// stmt.setInt(1, 2);
			stmt.setString(1, name);
			int va = stmt.executeUpdate();
			System.out.println("res: " + va);
			// For getting all students
			/*
			 * PreparedStatement s = con.prepareStatement("select id, name from student");
			 * ResultSet rs = s.executeQuery(); while (rs.next()) {
			 * System.out.println(rs.getInt("id") + " " + rs.getString("name")); }
			 */
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Get all stdu metd");
	}

}
