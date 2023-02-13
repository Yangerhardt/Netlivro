package com.netlivro.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.netlivro.api.models.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long> {
}
