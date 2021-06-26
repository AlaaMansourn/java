package com.codingdojo.OneToMoney.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.OneToMoney.models.Dojo;
import com.codingdojo.OneToMoney.models.Ninja;
import com.codingdojo.OneToMoney.repositories.DojoRepository;
import com.codingdojo.OneToMoney.repositories.NinjaRepository;



@Service
public class HomeService {

	
	
	
	private final DojoRepository  dojoRepository;
	private final NinjaRepository ninjaRepository;
	
	
	public HomeService(DojoRepository  dojoRepository,NinjaRepository ninjaRepository)
	
	
	{
		
		this.dojoRepository=dojoRepository;
		this.ninjaRepository = ninjaRepository;
		
		
	}
	
	public Dojo createDojo(Dojo D){
		
		
		
		return dojoRepository.save(D);
		
	}
	
	
	
	public Ninja createNinja(Ninja N) {
		
		
		return ninjaRepository.save(N);
	}
	
	public List<Dojo> findAllDojos() {
		
		
		
		return dojoRepository.findAll();
		
		
	}
	
public List<Ninja> findAllNinjas() {
		
		
		
		return ninjaRepository.findAll();
		
		
	}

public Dojo findDojo(Long id) {
	Optional<Dojo> optionalDojo=dojoRepository.findById(id);
	if(optionalDojo.isPresent()) {
		
		
		return optionalDojo.get();
		
	}
	else {
		return null;

	}
}

	
	
}
