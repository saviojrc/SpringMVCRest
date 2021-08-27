package br.com.globalLabs.SpringMVCRest.service;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.globalLabs.SpringMVCRest.exception.JediNotFoundException;
import br.com.globalLabs.SpringMVCRest.model.Jedi;
import br.com.globalLabs.SpringMVCRest.repository.JediRepository;

@Service
public class JediService {

	@Autowired
	private JediRepository repository;

	public List<Jedi> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	public Jedi findById(Long id) {
		final Optional<Jedi> jedi = repository.findById(id);

		if (jedi.isPresent()) {
			return jedi.get();
		} else {
			throw new JediNotFoundException();
		}

	}

	public Jedi save(@Valid Jedi jedi) {

		return repository.save(jedi);
	}

	public Jedi update(Long id, @Valid @RequestBody Jedi dto) {

		Optional<Jedi> jediEntity = repository.findById(id);
		final Jedi jedi;

		if (jediEntity.isPresent()) {
			jedi = jediEntity.get();
		} else {
			throw new JediNotFoundException();
		}

		jedi.setName(dto.getName());
		jedi.setLastName(dto.getLastName());

		return repository.save(jedi);

	}

	public void delete(Long id) {
		final Jedi jedi = findById(id);
		
		repository.delete(jedi);
		

	}

}
