package com.example.prodavnica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.prodavnica.domain.Prodavnica;

@Repository
public interface ProdavnicaRepository extends JpaRepository<Prodavnica, Long> {

	Prodavnica findOneById(Long id);
}
