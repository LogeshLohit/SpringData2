package com.logesh.JPATest.student.connection;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import com.logesh.JPATest.student.repository.StudentDAO;

@Configuration
public class ConnectionUtil {
	@Bean
	public DataSource dataSource() {
		EmbeddedDatabase db = null;
		try {
			EmbeddedDatabaseBuilder dbBuilder = new EmbeddedDatabaseBuilder();
			db = dbBuilder.setType(EmbeddedDatabaseType.DERBY)//.addScript("schema.sql")
				//	.addScript("testdata.sql")
					.build();
		} catch (Exception e) {
			System.out.println("Unable to build db");
			e.printStackTrace();
		}
		if (db == null)
			System.out.println("Connection null");
		return db;

//		DataSourceBuilder dbBuilder = DataSourceBuilder.create();
//		dbBuilder.driverClassName("")
	}

	@Bean
	public StudentDAO dao() {
		StudentDAO dao = new StudentDAO();
		dao.setDataSource(dataSource());
		return dao;
	}

}
