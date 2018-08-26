package com.example.prodavnica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.prodavnica.domain.Artikal;

@Repository
public interface ArtikalRepository extends JpaRepository<Artikal,Long> {

	Artikal findOneById(Long id);
	
}
