package com.example.prodavnica.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Artikal {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String ime;
	
	private String tip;
	
	@ManyToOne
	@JsonIgnore
	private Prodavnica prodavnica;
	
	public Artikal() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public Prodavnica getProdavnica() {
		return prodavnica;
	}

	public void setProdavnica(Prodavnica prodavnica) {
		this.prodavnica = prodavnica;
	}
	
	
	
	
}
