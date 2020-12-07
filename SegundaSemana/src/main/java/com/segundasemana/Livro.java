/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.segundasemana;

/**
 *
 * @author Patricia Silva
 */
public class Livro extends ClassePadrao { // extends é usado para extender padrões de uma classe para outras varias classes
	
	private Integer anoDePublicacao;
	private String autor;
	private String editora;
	private Integer classificacao;
		
	public Livro(Integer anoDePublicacao, String nome, String autor, String editora, Integer classificacao) {
		super();
		this.anoDePublicacao = anoDePublicacao;
		this.nome = nome;
		this.autor = autor;
		this.editora = editora;
		this.classificacao = classificacao;
	}
	
	public Livro() {
		super();
	}

	public Integer getAnoDePublicacao() {
		return anoDePublicacao;
	}


	public void setAnoDePublicacao(Integer anoDePublicacao) {
		this.anoDePublicacao = anoDePublicacao;
	}

	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public String getEditora() {
		return editora;
	}


	public void setEditora(String editora) {
		this.editora = editora;
	}


	public Integer getClassificacao() {
		return classificacao;
	}


	public void setClassificacao(Integer classificacao) {
		this.classificacao = classificacao;
	}
	
}
