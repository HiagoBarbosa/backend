package com.thebehero.voluntario;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;

import com.thebehero.doacao.Doacao;

@Entity
public class Voluntario {
	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	private Long id;
	@NotNull
	private String nomeVoluntario;
	@NotNull
	private String emailVoluntario;
	@NotNull
	private String profissão;
	@NotNull
	private String rg;
	@NotNull
	private Long cpf;
	@NotNull
	private String cep;
	@NotNull
	private String rua;
	private String numero;
	private String comp;
	private int numFixo;
	private int numMobile;
	
	@NotNull
	private String descricao;
	@NotNull
	private String password;
	@NotNull
	private String image;
	
	
	@ManyToOne
	private Doacao doacao;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeVoluntario() {
		return nomeVoluntario;
	}

	public void setNomeVoluntario(String nomeVoluntario) {
		this.nomeVoluntario = nomeVoluntario;
	}

	public String getEmailVoluntario() {
		return emailVoluntario;
	}

	public void setEmailVoluntario(String emailVoluntario) {
		this.emailVoluntario = emailVoluntario;
	}

	public String getProfissão() {
		return profissão;
	}

	public void setProfissão(String profissão) {
		this.profissão = profissão;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
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

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Doacao getDoacao() {
		return doacao;
	}

	public void setDoacao(Doacao doacao) {
		this.doacao = doacao;
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
		Voluntario other = (Voluntario) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
