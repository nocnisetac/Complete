package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDaoImpl {
    @Value("${spring.datasource.platform}")
    private String platform;
    
    @Autowired
    private JdbcTemplate jdbcTemplate;
    
	@SuppressWarnings("rawtypes")
	public List<Employee> getThemAll() {
		String sql = "SELECT * FROM employee";
		
		List<Employee> emps = new ArrayList<Employee>();
		
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
		for (Map row : rows) {
			Employee emp = new Employee();
			emp.setID(Integer.parseInt(String.valueOf(row.get("id"))));
			emp.setName((String) row.get("name"));
			emps.add(emp);
		}
		return emps;
	}

}
