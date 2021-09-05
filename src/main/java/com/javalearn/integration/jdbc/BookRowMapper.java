package com.javalearn.integration.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class BookRowMapper implements RowMapper<Book> {

	@Override
	public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
		String title = rs.getString("TITLE");
        double price = rs.getDouble("PRICE");
        return new Book(title, price);
	}
  }
