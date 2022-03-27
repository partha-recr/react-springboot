package com.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.employee.model.Employee;
import com.employee.repository.EmployeeRepository;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {

		Employee employee1 = Employee.builder()
				.firstName("Ramesh")
				.lastName("Fadatare")
				.emailId("ramesh@gmail.com")
				.build();

		Employee employee2 = Employee.builder()
				.firstName("Tony")
				.lastName("Stark")
				.emailId("tony@gmail.com")
				.build();

		Employee employee3 = Employee.builder()
				.firstName("John")
				.lastName("Cena")
				.emailId("cena@gmail.com")
				.build();

		employeeRepository.save(employee1);
		employeeRepository.save(employee2);
		employeeRepository.save(employee3);
	}
}
