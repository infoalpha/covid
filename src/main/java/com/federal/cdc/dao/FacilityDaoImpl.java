package com.federal.cdc.dao;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.federal.cdc.mapper.FacilityMapper;
import com.federal.cdc.model.Facility;
import com.federal.cdc.util.AppConstants;

@Repository
public class FacilityDaoImpl implements FacilityDao {

	@Autowired
	DataSource datasource;

	@Autowired
	JdbcTemplate jdbcTemplate;

	public int register(Facility facility) {

		String sql = "insert into facility (name,companyname,address,bedcapacity,status) values (?,?,?,?,?)";

		KeyHolder keyHolder = new GeneratedKeyHolder();

		jdbcTemplate.update(connection -> {
			PreparedStatement ps = connection.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
			ps.setString(1, facility.getName());
			ps.setString(2, facility.getCompanyName());
			ps.setString(3, facility.getAddress());
			ps.setLong(4, facility.getBedCapacity());
			ps.setString(5, AppConstants.PENDING);

			return ps;
		}, keyHolder);
		
		Number generatedKey= keyHolder.getKey();

		return generatedKey.intValue();

	}

	public List<Facility> getAllFacilities() {
		
		String sql = "select * from facility";
		
		List<Facility> facilities = jdbcTemplate.query(sql, new FacilityMapper());

		return facilities.size() > 0 ? facilities : null;
		
	}
	
	public int update(Facility facility) {

		String sql = "update facility set name=? ,companyname=? ,address=?,bedcapacity=?,inspectionDate=?,status=? where id = ?";

		int updatedRows = jdbcTemplate.update(sql,facility.getName(),facility.getCompanyName(),facility.getAddress(),facility.getBedCapacity(),facility.getInspectionDate(),facility.getStatus(),facility.getId());

		return updatedRows;

	}

	@Override
	public Facility getFacilityById(int id) {
		
		String sql = "select * from facility where id = ?";
		
		Facility facility  = jdbcTemplate.queryForObject(sql, new Object[]{id}, new FacilityMapper());


		return facility;
		
	}
}
