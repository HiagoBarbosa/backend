package br.net.thebehero.caso.model;



public class CasoDTO {
	public CasoDTO(int id, String nome, String raca, String especie, String dta_recolhimento, String descricao,
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

	private int id;
	private String nome;
	private String raca;
	private String especie;
	private String dta_recolhimento;
	private String descricao;
	private String image;

	public int getId() {
		return id;
	}

	public void setId(int id) {
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
}









