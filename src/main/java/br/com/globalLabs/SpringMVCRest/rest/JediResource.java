package br.com.globalLabs.SpringMVCRest.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.globalLabs.SpringMVCRest.model.Jedi;
import br.com.globalLabs.SpringMVCRest.repository.JediRepository;

@RestController
public class JediResource {

	@Autowired
	private JediRepository repository;

	@GetMapping("/jedi")
	public List<Jedi> getAllJedi() {

		return repository.findAll();
	}
	
	

}
