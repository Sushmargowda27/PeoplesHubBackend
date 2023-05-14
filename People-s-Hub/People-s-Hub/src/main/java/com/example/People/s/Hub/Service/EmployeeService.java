package com.example.People.s.Hub.Service;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.example.People.s.Hub.Model.Employee;

public interface EmployeeService {
	public Employee save(Employee emp);
	public List<Employee> allemp();
	public Object delete(int id);
	public Object update(int id,Employee emp);
	public Object login(String email, String password);
	public Object getbyid(int id);
	public Object saveimage(MultipartFile file, int empid) throws IOException;
	public Object getimage(int empid);
}
