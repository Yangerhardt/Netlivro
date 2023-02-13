package com.netlivro.api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.netlivro.api.models.Autor;
import com.netlivro.api.models.Livro;
import com.netlivro.api.repository.AutorRepository;
import com.netlivro.api.repository.LivroRepository;

@Service
public class LivroService {
    
	
	public LivroService(LivroRepository repository, AutorRepository autorRepository) {
		this.repository = repository;
		this.autorRepository = autorRepository;
	}

	private final LivroRepository repository;
    private final AutorRepository autorRepository;

    
    public Livro save(Livro livro, Long autorId) {
        Autor autor = autorRepository.findById(autorId).orElse(null);
        livro.setAutor(autor);
        return repository.save(livro);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public Livro findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public List<Livro> findAll() {
        return repository.findAll();
    }

    public Livro update(Livro livro) {
        return repository.save(livro);
    }


}
