package com.thebehero.doacao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;

import com.thebehero.ong.Ong;

@Entity
public class Doacao {
	@Id
	@GeneratedValue(generator = "increment")  
	@GenericGenerator(name = "increment", strategy = "increment")
	private Long id;
	
	@NotNull
	private String nomeDoacao;
	@NotNull
	private String nomeDoador;
	@NotNull
	private String tpDoacao;
	@NotNull
	private String image;
	@NotNull
	private String descricao;
	@NotNull
	private String email;
	@NotNull
	private String cep;
	@NotNull
	private String rua;
	private int numero;
	private String comp;
	@NotNull
	private int numFixo;
	@NotNull
	private int numMobile;
	@NotNull
	private int cnpjoucpf;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomeDoacao() {
		return nomeDoacao;
	}
	public void setNomeDoacao(String nomeDoacao) {
		this.nomeDoacao = nomeDoacao;
	}
	public String getNomeDoador() {
		return nomeDoador;
	}
	public void setNomeDoador(String nomeDoador) {
		this.nomeDoador = nomeDoador;
	}
	public String getTpDoacao() {
		return tpDoacao;
	}
	public void setTpDoacao(String tpDoacao) {
		this.tpDoacao = tpDoacao;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
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
	public int getCnpjoucpf() {
		return cnpjoucpf;
	}
	public void setCnpjoucpf(int cnpjoucpf) {
		this.cnpjoucpf = cnpjoucpf;
	}
	
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
		Doacao other = (Doacao) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
