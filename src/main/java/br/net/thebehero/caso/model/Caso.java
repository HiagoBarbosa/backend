package br.net.thebehero.caso.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import javax.persistence.*;
@Entity
@Table(name="tb_casoOng")
public class Caso implements Serializable {

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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public static Long getSerialverionuid() {
		return serialVerionUID;
	}

	private static final Long serialVerionUID = 1L;
	
	public Caso(Long id, String nome, String raca, String especie, String dta_recolhimento, String descricao,
			String image) {
		super();
		this.id = id;
		this.nome = nome;
		this.raca = raca;
		this.especie = especie;
		this.dta_recolhimento = dta_recolhimento;
		this.descricao = descricao;
		this.image = image;
	}

	@Id
	@GeneratedValue
	@Column(name="id_caso")
	private Long id;
		
	@Column(name="nome_caso")
	private String nome;
	
	@Column(name="raca_caso")
	private String raca;
	
	@Column(name="especie_caso")
	private String especie;
	
	@Column(name="dta_recolhimento_caso")
	private String dta_recolhimento;
	
	@Column(name="descricao_caso")
	private String descricao;
	
	@Column(name="image_caso")
	private String image;
}
