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
		
		Company kodilla = new Company("kodilla");
		Employee kodillaUser = new Employee("Kodilla","User");
		kodilla.getEmployees().add(kodillaUser);
		kodillaUser.getCompanies().add(kodilla);
		
		//when
		companyDao.save(kodilla);
		int companyID = kodilla.getId();
		List<Company> result = facade.findCompanyByPartOfName("kodi");
		
		//Then
		Assert.assertEquals(1, result.size());
		
		//CleanUP
		//companyDao.delete(newCompany);
		
	}
	
	@Test
	public void getEmployeesByNamePartTest() {
		//Given
		Employee kodillaUser = new Employee("Kodilla","User");
		
		//when
		employeeDao.save(kodillaUser);
		List<Employee> result = facade.findEmployeeByPartOfName("odil");
		int employeeToDeleteid = kodillaUser.getId();
		
		//Then
		Assert.assertEquals(1,result.size());
		Assert.assertEquals("odil",result.get(0).getLastname());
		
		//CleanUp
		//employeeDao.delete(employeeToDeleteid);
	}
}


