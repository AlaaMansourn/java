package com.codingdojo.license.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.codingdojo.license.models.Person;



public interface PersonRepository extends CrudRepository<Person,Long> {
	
	
	
	List<Person> findAll();
	
	
	@Query(value="SELECT p.* From persons p LEFT JOIN licenses l ON p.id = l.person_id where l.person_id is null ",nativeQuery=true)
	
	List<Person> findByNotLicense();
	
	Optional<Person> findById(Long id);
	
	
	

}
