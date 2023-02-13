package com.netlivro.api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.netlivro.api.models.Autor;
import com.netlivro.api.repository.AutorRepository;


@Service
public class AutorService {
	
	public AutorService(AutorRepository repository) {
		this.repository = repository;
	}
    private final AutorRepository repository;

    public Autor save(Autor autor) {
        return repository.save(autor);
    }

    public Autor findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public List<Autor> findAll() {
        return repository.findAll();
    }

    public Autor update(Autor autor, Long id) {
        return repository.save(autor);
    }

}
