package com.thebehero.caso;

import java.io.*;

@SuppressWarnings("serial")
public class CasoDTO implements Serializable {
	private Long id;
	private String nome;
	private String especie;
	private String dta_recolhimento;
	private String image;
	private String raca;
	private String descricao;
	
	public CasoDTO(Long id,  String nome,  String especie,  String dta_recolhimento,
			 String image,  String raca,  String descricao) {
		super();
		this.id = id;
		this.nome = nome;
		this.especie = especie;
		this.dta_recolhimento = dta_recolhimento;
		this.image = image;
		this.raca = raca;
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getDta_recolhimento() {
		return dta_recolhimento;
	}

	public void setDta_recolhimento(String dta_recolhimento) {
		this.dta_recolhimento = dta_recolhimento;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
