package com.codingdojo.language.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.language.models.Language;

@Repository
public interface LanguageRepository extends CrudRepository<Language,Long>
{
	
	
	
	List<Language> findAll();
	
	Optional<Language> findById(Long id);
	
	void deleteById(Long id);
	
	
	

}
