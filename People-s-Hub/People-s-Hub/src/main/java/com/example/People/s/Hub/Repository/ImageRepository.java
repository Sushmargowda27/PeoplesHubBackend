package com.example.People.s.Hub.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.People.s.Hub.Model.Image;


@Repository
public interface ImageRepository extends JpaRepository<Image, Integer>{
	
	@Query(value="select * from image where id=?1",nativeQuery=true)
	public Image findByid(Integer id);

}
