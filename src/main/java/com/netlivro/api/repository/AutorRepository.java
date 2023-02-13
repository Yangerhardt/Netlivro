package com.netlivro.api.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.netlivro.api.models.Autor;

public interface AutorRepository extends JpaRepository<Autor, Long> {

}
