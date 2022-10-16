package com.thebehero.caso;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;



@Entity
public class Caso {
	@Id
	@GeneratedValue(generator = "increment")  
	@GenericGenerator(name = "increment", strategy = "increment")
	private Long id;
	
	@NotNull
	private String nomedocaso;
	@NotNull
	private String nomedaong;
	@NotNull
	private String especie;
	@NotNull
	private String dta_recolhimento;
	@NotNull
	private String image;
	@NotNull
	private String raca;
	@NotNull
	private String descricao;
	@NotNull
	private String email;
	@NotNull
	private int cep;
	@NotNull
	private String rua;
	private int numero;
	private String comp;
	@NotNull
	private int numFixo;
	@NotNull
	private int numMobile;
	@NotNull
	private int cnpj;
	
	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNomedocaso() {
		return nomedocaso;
	}

	public void setNomedocaso(String nomedocaso) {
		this.nomedocaso = nomedocaso;
	}

	public String getNomedaong() {
		return nomedaong;
	}

	public void setNomedaong(String nomedaong) {
		this.nomedaong = nomedaong;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getComp() {
		return comp;
	}

	public void setComp(String comp) {
		this.comp = comp;
	}

	public int getNumFixo() {
		return numFixo;
	}

	public void setNumFixo(int numFixo) {
		this.numFixo = numFixo;
	}

	public int getNumMobile() {
		return numMobile;
	}

	public void setNumMobile(int numMobile) {
		this.numMobile = numMobile;
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
		return nomedocaso;
	}

	public void setNome(String nomedocaso) {
		this.nomedocaso = nomedocaso;
	}
	
	@JoinColumn(name="caso")
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Caso other = (Caso) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}


}
