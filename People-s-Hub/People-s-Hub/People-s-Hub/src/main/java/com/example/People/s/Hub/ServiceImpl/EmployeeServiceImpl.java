package com.example.People.s.Hub.ServiceImpl;

import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.example.People.s.Hub.EmailSenderService.EmailSender;
import com.example.People.s.Hub.Exception.CustomException;
import com.example.People.s.Hub.Model.Employee;
import com.example.People.s.Hub.Repository.EmployeeRepository;
import com.example.People.s.Hub.Repository.ImageRepository;
import com.example.People.s.Hub.Service.EmployeeService;
import com.example.People.s.Hub.Model.Image;
import com.example.People.s.Hub.Model.ImageUtility;
import com.example.People.s.Hub.Model.Leaves;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeerepo;
	
	@Autowired
	private EmailSender emailsender;
	
	@Autowired
	private ImageRepository imagerepo;
	
	@Override
	public Employee save(Employee emp) {
		// TODO Auto-generated method stub
		Employee em=employeerepo.findemail(emp.getEmpEmail());
			if(em==null)
			{
				emailsender.sendemail1(emp.getEmpEmail(), "Congratulations!", 
						"Your added to ur company website."+" "
				+"Login for your Employee Account."+" "+"This is your Login Password:"+emp.getPassword()+
				"                                                                                     "+
				               "Thank You!!!"+"                                                                      "+
				               "Regards"+"                                                                           "+
				               "HR Department PeoplesHub");
				employeerepo.save(emp);
			}
			return emp;
						
	}

	@Override
	public Object delete(int id) {
		// TODO Auto-generated method stub
		Employee emp=employeerepo.findByid(id);
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

	@Override
	public Object update(int id,Employee emp) {
		// TODO Auto-generated method stub
		Employee em=employeerepo.findByid(id);
		if(em!=null)
		{
			return employeerepo.save(emp);
		}
		else
		{
			return "employee is not found";
		}
	}

	@Override
	public Object login(String email, String password) {
		// TODO Auto-generated method stub
		System.out.println(email+password);
		Employee emp=employeerepo.findemail(email);
		System.out.println(emp.getPassword());
		System.out.println(emp.getEmpEmail());
		try
		{
			if(emp!=null)
			{
				if(emp.getPassword().equals(password))
				{
					return emp;
				}
				else
				{
					throw new CustomException("password is incorrect");
				}
			}
			else
			{
				throw new CustomException("admin email is wrong");
			}
		}
		catch(CustomException e)
		{
			return e.getMessage();
		}
	}
	@Override
	public Object getbyid(int id) {
		// TODO Auto-generated method stub
		Employee emp=employeerepo.findByid(id);
		if(emp!=null)
		{
			return emp;
		}
		else
		{
			return "Employee object not found";
		}
	}

	@Override
	public Object saveimage(MultipartFile file, int empid) throws IOException {
		// TODO Auto-generated method stub
		String filename = StringUtils.cleanPath(file.getOriginalFilename());
		if (filename.contains("..")) {
			System.out.println("Not a valid file");
		}
		System.out.println(file);
		Image i=new Image();
		i.setType(file.getContentType());
		i.setData(ImageUtility.compressImage(file.getBytes()));
		i.setName(filename);
		i.setId(empid);
		System.out.println(i);
		
	    Employee emp=employeerepo.findByid(empid);
	    Image image=new Image();
	    if(emp!=null)
	    {
	    	image=imagerepo.save(i);
	    }
		if(image!=null)
		  {
			  return ResponseEntity.ok("File uploaded successfully!");
		  }
		  return null;
	}

	@Override
	public Object getimage(int empid) {
		// TODO Auto-generated method stub
		Image image=imagerepo.findByid(empid);
		
		if (image != null) {
			byte[] im=ImageUtility.decompressImage(image.getData());
			System.out.println(im);
	        return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG)
	        		.body(im);
	    } else {
	        return ResponseEntity.notFound().build();
	    }
	}

	@Override
	public Object addleaves(Leaves leaves) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getallmanager() {
		// TODO Auto-generated method stub
		String name="manager";
		return employeerepo.getallmanager(name);
	}
}
