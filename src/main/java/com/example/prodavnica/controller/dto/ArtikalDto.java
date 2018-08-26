package com.example.prodavnica.controller.dto;

public class ArtikalDto {

	private String ime;
	private String tip;
	private Long prodavnicaId;
	public ArtikalDto() {
		super();
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
	public Long getProdavnicaId() {
		return prodavnicaId;
	}
	public void setProdavnicaId(Long prodavnicaId) {
		this.prodavnicaId = prodavnicaId;
	}
	
	
}
