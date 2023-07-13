package com.thebehero.servicoVoluntarioEDoacao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;



@Entity
public class ServicoVoluntarioEDoacao {
	@Id
	@GeneratedValue(generator = "increment")  
	@GenericGenerator(name = "increment", strategy = "increment")
	private Long id;
	@NotNull
	private String nomedovoluntario;
	@NotNull
	private String nomedadoacao;
	private String tipodoVoluntariado;
	@NotNull
	private String dta_Disponibilidade;
	@NotNull
	private String image;
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
	private String cpf;
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomedovoluntario() {
		return nomedovoluntario;
	}

	public void setNomedovoluntario(String nomedovoluntario) {
		this.nomedovoluntario = nomedovoluntario;
	}

	public String getNomedadoacao() {
		return nomedadoacao;
	}

	public void setNomedadoacao(String nomedadoacao) {
		this.nomedadoacao = nomedadoacao;
	}

	public String getTipodoVoluntariado() {
		return tipodoVoluntariado;
	}

	public void setTipodoVoluntariado(String tipodoVoluntariado) {
		this.tipodoVoluntariado = tipodoVoluntariado;
	}

	public String getDta_Disponibilidade() {
		return dta_Disponibilidade;
	}

	public void setDta_Disponibilidade(String dta_Disponibilidade) {
		this.dta_Disponibilidade = dta_Disponibilidade;
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
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
		ServicoVoluntarioEDoacao other = (ServicoVoluntarioEDoacao) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}


}
