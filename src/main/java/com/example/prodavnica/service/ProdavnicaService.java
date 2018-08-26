package com.example.prodavnica.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.prodavnica.domain.Artikal;
import com.example.prodavnica.domain.Prodavnica;
import com.example.prodavnica.repository.ProdavnicaRepository;

@Service
public class ProdavnicaService {

	@Autowired
	private ProdavnicaRepository prodavnicaRepository;
	
	public Prodavnica createProdavnica(String ime,String adresa,ArrayList<Artikal> artikli) {
		Prodavnica prodavnica = new Prodavnica();
		
		prodavnica.setIme(ime);
		prodavnica.setAdresa(adresa);
		prodavnica.setArtikli(artikli);
		
		prodavnicaRepository.save(prodavnica);
	
		return prodavnica;
	}  
	
	public void deleteProdavnica (Long id) {
		Prodavnica prodavnica = prodavnicaRepository.findOneById(id);
		prodavnicaRepository.delete(prodavnica);
	}
	
	
	public Prodavnica editProdavnica (Long id, String ime,String adresa,ArrayList<Artikal> artikli ) {
		Prodavnica prodavnica = prodavnicaRepository.findOneById(id);
		prodavnica.setIme(ime);
		prodavnica.setAdresa(adresa);
		prodavnica.setArtikli(artikli);
		
		return prodavnicaRepository.save(prodavnica);
		
	}
	
	public Prodavnica findOne (Long id) {
		return prodavnicaRepository.findOneById(id);
	}
	

	
}
