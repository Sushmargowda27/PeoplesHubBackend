package com.example.People.s.Hub.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.People.s.Hub.Model.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer>{

	@Query(value="select * from admin where email=?1", nativeQuery=true)
	public Admin findemail(String email);
}
