package com.example.prodavnica.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.prodavnica.controller.dto.ProdavnicaDTO;
import com.example.prodavnica.domain.Artikal;
import com.example.prodavnica.domain.Prodavnica;
import com.example.prodavnica.service.ProdavnicaService;

@RestController
@RequestMapping("/shop")
public class ProdavnicaController {
	
	@Autowired
	private ProdavnicaService prodavnicaService;
/*
 @GetMapping("")
 public String hello() {
	return "helloWorld";
 }
	*/
 @PostMapping("")
 public Prodavnica createProdavnica (@RequestBody ProdavnicaDTO prodavnicaDto) {
	 return prodavnicaService.createProdavnica (prodavnicaDto.getIme(), prodavnicaDto.getAdresa(), prodavnicaDto.getArtikli());
 }
 
 
 @DeleteMapping("/{id}")
 public void deleteProdavnica (@PathVariable ("id") Long id) {
	  prodavnicaService.deleteProdavnica(id);
 }
 
 @GetMapping("/{id}")
 public Prodavnica findOne (@PathVariable ("id") Long id) {
	 return prodavnicaService.findOne(id);	 
 } 
 
 @PutMapping("/edit")
 public Prodavnica editProdavnica (@PathVariable("id") Long id, @RequestBody ProdavnicaDTO prodavnicaDto) {
	 String ime = prodavnicaDto.getIme();
	 String adresa = prodavnicaDto.getAdresa();
	 ArrayList<Artikal>artikli = prodavnicaDto.getArtikli();
	 return prodavnicaService.editProdavnica(id, ime, adresa, artikli);
 }
 
}
