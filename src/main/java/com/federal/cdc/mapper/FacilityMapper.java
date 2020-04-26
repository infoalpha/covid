package com.federal.cdc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.federal.cdc.model.Facility;

public class FacilityMapper implements RowMapper<Facility>{



	@Override
	public Facility mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Facility facility = new Facility();
		facility.setId(rs.getInt("id"));
		facility.setName(rs.getString("name"));
		facility.setCompanyName(rs.getString("companyname"));
		facility.setAddress(rs.getString("address"));
		facility.setBedCapacity(rs.getInt("bedcapacity"));
		facility.setInspectionDate(rs.getString("inspectiondate"));
		facility.setStatus(rs.getString("status"));
		return facility;
	}

}
