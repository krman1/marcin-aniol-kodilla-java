package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Transactional
@SpringBootTest
@RunWith(SpringRunner.class)
public class FacadeTest {
	
	@Autowired
	CompanyDao companyDao;
	@Autowired
	EmployeeDao employeeDao;
	@Autowired
	private Facade facade;
	
	@Test
	public void findCompanyTest() {
		//Given
		
		Company newCompany = new Company("kodilla");
		Employee newEmployee = new Employee("Kodilla", "User");
		newCompany.getEmployees().add(newEmployee);
		newEmployee.getCompanies().add(newCompany);
		
		//when
		companyDao.save(newCompany);
		int companyID = newCompany.getId();
		List<Company> resultSet = facade.findCompanyByPartOfName("kodi");
		
		//Then
		Assert.assertEquals(1, resultSet.size());
		
		//CleanUP
		companyDao.delete(newCompany);
		
	}
	
}


