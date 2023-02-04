package com.example.dao;

import com.example.model.Employee;

public interface EmployeeDao {
	void insertEmployee(Employee cus);

	void deleteEmployeeById(String empid);
}
