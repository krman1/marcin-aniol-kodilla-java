package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class Facade {
	
	@Autowired
	private CompanyDao companyDao;
	@Autowired
	private EmployeeDao employeeDao;
	
	
	public List<Company> findCompanyByPartOfName(String partOfCompanyName) {
		
		List<Company> partCName = companyDao.findCompanyByPartOfName(partOfCompanyName);
		return  partCName;
	}
}
