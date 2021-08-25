package br.com.globalLabs.SpringMVCRest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.globalLabs.SpringMVCRest.model.Jedi;

@Repository
public interface JediRepository extends JpaRepository<Jedi, Long> {

	List<Jedi> findByNameContainingIgnoreCase(String name);

}
