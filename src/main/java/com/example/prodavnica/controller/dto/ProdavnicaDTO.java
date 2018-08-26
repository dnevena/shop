package com.example.prodavnica.controller.dto;

import java.util.ArrayList;

import com.example.prodavnica.domain.Artikal;

public class ProdavnicaDTO {

	private String ime;
	private String adresa;
	private ArrayList<Artikal>artikli = new ArrayList<>();
	public ProdavnicaDTO() {
		super();
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getAdresa() {
		return adresa;
	}
	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}
	public ArrayList<Artikal> getArtikli() {
		return artikli;
	}
	public void setArtikli(ArrayList<Artikal> artikli) {
		this.artikli = artikli;
	}
	
	
	
}
