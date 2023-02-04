package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.model.Employee;
import com.example.model.EmployeeHealthInsurance;
import com.example.service.OrganizationService;

@SpringBootApplication
@EnableTransactionManagement
public class SpringBootJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootJdbcApplication.class, args);
		OrganizationService organizationService = context.getBean(OrganizationService.class);

		Employee emp = new Employee();
		emp.setEmpId("emp1");
		emp.setEmpName("emp1");

		EmployeeHealthInsurance employeeHealthInsurance = new EmployeeHealthInsurance();
		employeeHealthInsurance.setEmpId("emp1");
		employeeHealthInsurance.setHealthInsuranceSchemeName("premium");
		employeeHealthInsurance.setCoverageAmount(20000);

		organizationService.joinOrganization(emp, employeeHealthInsurance);
	}
}
	
