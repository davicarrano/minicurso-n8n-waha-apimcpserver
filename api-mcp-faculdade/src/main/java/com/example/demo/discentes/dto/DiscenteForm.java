package com.example.demo.discentes.dto;

public class DiscenteForm {
	private String nome;
	private String cidade;
	private String curso;
	private String linhaPesquisa;

	public DiscenteForm() {
		// TODO Auto-generated constructor stub
	}

	public DiscenteForm(String nome, String cidade, String curso, String linhaPesquisa) {
		this.nome = nome;
		this.cidade = cidade;
		this.curso = curso;
		this.linhaPesquisa = linhaPesquisa;
	}	
	


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getLinhaPesquisa() {
		return linhaPesquisa;
	}

	public void setLinhaPesquisa(String linhaPesquisa) {
		this.linhaPesquisa = linhaPesquisa;
	}


	
	
}
