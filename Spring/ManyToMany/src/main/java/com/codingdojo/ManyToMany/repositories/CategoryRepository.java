package com.codingdojo.ManyToMany.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.ManyToMany.models.Category;
import com.codingdojo.ManyToMany.models.Product;

@Repository
public interface CategoryRepository extends CrudRepository<Category,Long> {

	
	
	List<Category> findAll();
	
	
	Optional<Category> findById(Long id);
	
	List<Category> findByProductsNotContains(Product P);
	
}
