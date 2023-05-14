package com.example.People.s.Hub.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Leaves {
	@Id
   private int empid;
   private String empname;
   private String day_type;
   private int dayscount;
   private String manageremail;
   private String Reason;
   
   
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
public String getDay_type() {
	return day_type;
}
public void setDay_type(String day_type) {
	this.day_type = day_type;
}
public int getDayscount() {
	return dayscount;
}
public void setDayscount(int dayscount) {
	this.dayscount = dayscount;
}
public String getManageremail() {
	return manageremail;
}
public void setManageremail(String manageremail) {
	this.manageremail = manageremail;
}
public String getReason() {
	return Reason;
}
public void setReason(String reason) {
	Reason = reason;
}
   
	
}
