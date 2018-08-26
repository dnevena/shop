package com.example.prodavnica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.prodavnica.controller.dto.ArtikalDto;
import com.example.prodavnica.domain.Artikal;
import com.example.prodavnica.service.ArtikalService;

@RestController
@RequestMapping("/artikal")
public class ArtikalController {

	@Autowired
	private ArtikalService artikalService;
	
	@PostMapping("")
	public Artikal createArtikal(@RequestBody ArtikalDto artikalDto) {
		return artikalService.createArtikal(artikalDto.getIme(), artikalDto.getTip(),artikalDto.getProdavnicaId());
}
	
	@DeleteMapping("/{id}")
	public void deleteArtikal (@PathVariable("id") Long id) {
		artikalService.deleteArtikal(id);
	}
	
	
	@GetMapping("/{id}")
	public Artikal findArtikal (@PathVariable ("id") Long id) {
		return artikalService.findOne(id);
	}

	@PutMapping("/{id}")
	public Artikal editArtikal (@PathVariable("id") Long id, @RequestBody ArtikalDto artikalDto) {
		String ime = artikalDto.getIme();
		String tip= artikalDto.getTip();
		Long prodavnicaId = artikalDto.getProdavnicaId();
		return artikalService.editArtikal(id, ime, tip);
		
		
	}

}
