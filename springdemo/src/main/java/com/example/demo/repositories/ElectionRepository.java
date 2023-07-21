package com.example.demo.repositories;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Election;

@Repository
public class ElectionRepository {
	@Autowired
	JdbcTemplate jdbcTemplate;

	class ElectionRowMapper implements RowMapper<Election> {

		@Override
		public Election mapRow(ResultSet rs, int rowNum) throws SQLException {
			// TODO Auto-generated method stub
			Election item = new Election();
			item.setId(rs.getInt("id"));
			item.setTitle(rs.getString("title"));
			return item;
		}
	}
	public List<Election> findCurrentElection(){
		return jdbcTemplate.query("select*from Election", new ElectionRowMapper());
	}
	public List<Election> findPastElection(){
		return jdbcTemplate.query("select*from Election", new ElectionRowMapper());
	}
	
}
