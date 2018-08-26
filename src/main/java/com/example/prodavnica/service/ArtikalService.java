package com.example.prodavnica.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.prodavnica.domain.Artikal;
import com.example.prodavnica.domain.Prodavnica;
import com.example.prodavnica.repository.ArtikalRepository;
import com.example.prodavnica.repository.ProdavnicaRepository;

@Service
public class ArtikalService {

	@Autowired
	private ArtikalRepository artikalRepository;
	
	@Autowired
	private ProdavnicaRepository prodavnicaRepository;
	
	
	
	public Artikal createArtikal (String ime, String tip, Long prodavnicaId) {
		Artikal artikal = new Artikal();
		artikal.setIme(ime);
		artikal.setTip(tip);
		
		Prodavnica prodavnica = prodavnicaRepository.findOneById(prodavnicaId);
		artikal.setProdavnica(prodavnica);
		prodavnica.getArtikli().add(artikal);
		prodavnicaRepository.save(prodavnica);
		
		artikalRepository.save(artikal);
		
		return artikal;
		
	}
	
	
	public void deleteArtikal(Long id) {
		Artikal artikal = artikalRepository.findOneById(id);
		artikalRepository.delete(artikal);
		
		
	}
	
	public Artikal findOne (Long id) {
		return artikalRepository.findOneById(id);
	}
	
	
	public Artikal editArtikal (Long id, String ime, String tip) {
		
		Artikal artikal = artikalRepository.findOneById(id);
		artikal.setIme(ime);
		artikal.setTip(tip);
	
		return artikalRepository.save(artikal);
		
		
	}
}
