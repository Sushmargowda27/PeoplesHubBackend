package com.example.People.s.Hub.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.People.s.Hub.Exception.CustomException;
import com.example.People.s.Hub.Model.Employee;
import com.example.People.s.Hub.Repository.EmployeeRepository;
import com.example.People.s.Hub.Service.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeerepo;
	
	@Override
	public Employee save(Employee emp) {
		// TODO Auto-generated method stub
		return employeerepo.save(emp);
	}

	@Override
	public Object delete(Integer empid) {
		// TODO Auto-generated method stub
		Employee emp=employeerepo.findByid(empid);
		try
		{
			if(emp!=null)
			{
				employeerepo.deleteById(emp.getEmpid());
				throw new CustomException("employee delete Successfully");
			}
			else
			{
				throw new CustomException("employee is not found");
			}
		}
		catch(CustomException e)
		{
			return e.getMessage();
		}
		
		
	}

	@Override
	public List<Employee> allemp() {
		// TODO Auto-generated method stub
		return employeerepo.findAll();
	}

}
