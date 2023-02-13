package com.netlivro.api.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netlivro.api.models.Autor;
import com.netlivro.api.service.AutorService;

@RestController
@RequestMapping("/api/autores")
public class AutorController {

    private final AutorService service;
    

    public AutorController(AutorService service) {
		this.service = service;
	}

	@PostMapping
    public ResponseEntity<Autor> save(@RequestBody Autor autor) {
        return ResponseEntity.status(HttpStatus.OK).body(service.save(autor));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Autor> update(@RequestBody Autor autor, Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(service.update(autor, id));
    }

    @PostMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        service.deleteById(id);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Autor> findById(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(service.findById(id));
    }
    @GetMapping
    public ResponseEntity<List<Autor>> findAll() {
        return ResponseEntity.status(HttpStatus.OK).body(service.findAll());
    }
}

