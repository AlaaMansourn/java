package com.codingdojo.license.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;


import com.codingdojo.license.models.License;
import com.codingdojo.license.models.Person;
import com.codingdojo.license.repositories.LicenseRepository;
import com.codingdojo.license.repositories.PersonRepository;


@Service
public class HomeService {
	
	
private final LicenseRepository licenseRepository;
private final PersonRepository personRepository;
public HomeService(LicenseRepository licenseRepository, PersonRepository personRepository) {
	
	this.licenseRepository = licenseRepository;
	this.personRepository = personRepository;
}




public Person createPerson(Person person) {
	
	
	
	return personRepository.save(person);
}

public License createLicense(License license) {
	
	
	
	
	
	
	return licenseRepository.save(license);
}
    public List<Person> findUnLicensed(){
	
	
	return personRepository.findByNotLicense();
	
	
}
    
    public Person findPerson(Long id) {
		Optional<Person> optionalPerson=personRepository.findById(id);
		if(optionalPerson.isPresent()) {
			
			
			return optionalPerson.get();
			
		}
		else {
			return null;

		}
	}
}
