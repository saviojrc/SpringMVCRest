package br.com.globalLabs.SpringMVCRest.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.globalLabs.SpringMVCRest.model.Jedi;
import br.com.globalLabs.SpringMVCRest.repository.JediRepository;

@RestController
@RequestMapping("/jedi")
public class JediResource {

	@Autowired
	private JediRepository repository;

	@GetMapping
	public List<Jedi> getAllJedi() {

		return repository.findAll();
	}

}
