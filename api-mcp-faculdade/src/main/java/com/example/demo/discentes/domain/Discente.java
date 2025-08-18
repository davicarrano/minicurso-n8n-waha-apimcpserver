package com.example.demo.discentes.domain;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "discentes")
public class Discente implements Serializable  {
	private static final long serialVersionUID = 1L;

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY) // autoincremento
	    private Integer id;

	    @Column(nullable = false, length = 100)
	    private String nome;

	    @Column(length = 80)
	    private String cidade;

	    @Column(length = 80)
	    private String curso;

	    @Column(name = "linha_pesquisa", length = 120)
	    private String linhaPesquisa;

	    // Construtor padrão (obrigatório para JPA)
	    public Discente() {
	    }

	    // Construtor completo
	    public Discente(String nome, String cidade, String curso, String linhaPesquisa) {
	        this.nome = nome;
	        this.cidade = cidade;
	        this.curso = curso;
	        this.linhaPesquisa = linhaPesquisa;
	    }

	    // Getters e Setters
	    public Integer getId() {
	        return id;
	    }

	    public void setId(Integer id) {
	        this.id = id;
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

	    // toString (opcional, mas útil para debug)
	    @Override
	    public String toString() {
	        return "Discente{" +
	                "id=" + id +
	                ", nome='" + nome + '\'' +
	                ", cidade='" + cidade + '\'' +
	                ", curso='" + curso + '\'' +
	                ", linhaPesquisa='" + linhaPesquisa + '\'' +
	                '}';
	    }	


}
