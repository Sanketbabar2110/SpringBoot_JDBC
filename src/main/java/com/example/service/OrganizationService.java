package com.example.service;

import com.example.model.Employee;
import com.example.model.EmployeeHealthInsurance;

public interface OrganizationService {

	public void joinOrganization(Employee employee, EmployeeHealthInsurance employeeHealthInsurance);

	public void leaveOrganization(Employee employee, EmployeeHealthInsurance employeeHealthInsurance);

}
