package com.thebehero.caso;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;
import java.io.*;

@Entity
@Table(name="tb_caso")
public class CasoEntidade implements Serializable {
	private static final Long serialVersionUID =1L;
	
	@Id
	@GeneratedValue
	@Column(name="id_caso")
	private Long id;
	
	@NotNull
	@Column(name="nome_caso")
	private String nome;
	
	@NotNull
	@Column(name="especie_caso")
	private String especie;
	@NotNull
	@Column(name="dta_recolhimento_caso")
	private String dta_recolhimento;
	public Long getId() {
		return id;
	}
	public CasoEntidade(Long id, @NotNull String nome, @NotNull String especie, @NotNull String dta_recolhimento,
			@NotNull String image, @NotNull String raca, @NotNull String descricao) {
		super();
		this.id = id;
		this.nome = nome;
		this.especie = especie;
		this.dta_recolhimento = dta_recolhimento;
		this.image = image;
		this.raca = raca;
		this.descricao = descricao;
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
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public static Long getSerialversionuid() {
		return serialVersionUID;
	}
	@NotNull
	@Column(name="image_caso")
	private String image;
	@NotNull
	@Column(name="raca_caso")
	private String raca;
	@NotNull
	@Column(name="descricao_caso")
	private String descricao;
}
