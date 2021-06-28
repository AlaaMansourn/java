package com.codingdojo.ManyToMany.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.ManyToMany.models.Category;
import com.codingdojo.ManyToMany.models.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product,Long> {
	
	
	
	
	List<Product> findAll();
	
	Optional<Product> findById(Long id);
	
	
	//List <Category> findByCategoriesNotContains(Product P);
	List<Product> findByCategoriesNotContains(Category c);
	
	
}




