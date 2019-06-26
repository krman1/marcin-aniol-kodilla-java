package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Facade {
	
	@Autowired
	private CompanyDao companyDao;
	@Autowired
	private EmployeeDao employeeDao;
	
	
	public List<Company> findCompanyByPartOfName(String partOfCompanyName) {
		
		List<Company> partCompanyName = companyDao.findCompanyByPartOfName(partOfCompanyName);
		return  partCompanyName;
	}
	
	public List<Employee> findEmployeeByPartOfName(String partOfEmployeeName) {
		
		List<Employee> partEmployeeName = employeeDao.findEmployeeByPartOfName(partOfEmployeeName);
		return partEmployeeName;
	}
}
