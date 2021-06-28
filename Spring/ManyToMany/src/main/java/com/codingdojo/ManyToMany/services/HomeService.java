package com.codingdojo.ManyToMany.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codingdojo.ManyToMany.models.Category;
import com.codingdojo.ManyToMany.models.Product;
import com.codingdojo.ManyToMany.repositories.CategoryRepository;
import com.codingdojo.ManyToMany.repositories.ProductRepository;

@Service
public class HomeService {
	
	
	
	private final CategoryRepository categoryRepository;
	private final ProductRepository productRepository;
	
	public HomeService( CategoryRepository categoryRepository,ProductRepository productRepository)
	{
		
		
		
		this.categoryRepository=categoryRepository;
		this.productRepository=productRepository;
	}
	
	
	
	
	public Product create_product(Product P) {
		
		return productRepository.save(P);
		
		
	}
	
	
	public Category create_category(Category C) {
		
		
		return categoryRepository.save(C);
		
		
	}
	
	
	public List<Category> findCantogoriesNotIn(Long id){
		Product p= productRepository.findById(id). orElse(null);
		return categoryRepository.findByProductsNotContains(p);
	}
	
	public List<Category> findCantogoriesIn(Long id){
		
		Product p= productRepository.findById(id). orElse(null);
		System.out.println(p.getCategories());
		return p.getCategories();
		
		
	}
	
	
	
	
	public Product findproductbyid(Long id) {
		
		
		return productRepository.findById(id).orElse(null);
		
		
		
	}
		
		
public Category findcategorybyid(Long id) {
		
		
		return categoryRepository.findById(id).orElse(null);
		
		
		
	}




public void addCatPro(Long id, Long cid) {
	
	Product p = productRepository.findById(id).orElse(null);
	Category c =categoryRepository.findById(cid).orElse(null);
	System.out.println(c.getName());
	List<Category> l = p.getCategories();
	l.add(c);
	System.out.println(l.size());
	System.out.println(p.getName());
	p.setCategories(l);
	productRepository.save(p);
	
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	


