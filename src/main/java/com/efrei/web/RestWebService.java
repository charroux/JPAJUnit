package com.efrei.web;

import com.efrei.data.ProgrammeurBean;
import com.efrei.service.ProgrammeurBeanRepository;
import com.efrei.service.ProgrammeurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestWebService {

	ProgrammeurBeanRepository repository;
	ProgrammeurService service;

	@Autowired
	public RestWebService(ProgrammeurBeanRepository repository, ProgrammeurService service) {
		super();
		this.repository = repository;
		this.service = service;
		System.out.println(service);
	}
	
	@GetMapping("/programmeurs")
	public Iterable<ProgrammeurBean> getCities(){
		return repository.findAll();
	}

}
