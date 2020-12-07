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
public class animal {
    
    	protected Long identificador;
	protected String nome;
	protected Integer idade;
	protected Float tamanho;
	protected Float peso;
	
	public animal () {
		super();
	}
	
	public animal (Long identificador, String nome, Integer idade, Float tamanho, Float peso) {
		super();
		this.identificador = identificador;
		this.nome = nome;
		this.idade = idade;
		this.tamanho = tamanho;
		this.peso = peso;
	}
	
	public Long getIdentificador() {
		return identificador;
	}

	public void setIdentificador(Long identificador) {
		this.identificador = identificador;
	}
	
	public String getNome () {
		return nome;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public Integer getIdade () {
		return idade;
	}
	
	public void setIdade (Integer idade) {
		this.idade = idade;
	}
	
	public Float getTamanho () {
		return tamanho;
	}
	
	public void setTamanho (Float tamanho) {
		this.tamanho = tamanho;
	}
	
	public Float getPeso () {
		return peso;
	}
	
	public void setPeso (Float peso) {
		this.peso = peso;
	}
	
	public void dizerOla () {
		System.out.println("Olá, eu sou um animal!");
	}


}

	protected Long identificador;
	protected String nome;
	protected Integer idade;
	protected Float tamanho;
	protected Float peso;
	
	public Animal () {
		super();
	}
	
	public Animal (Long identificador, String nome, Integer idade, Float tamanho, Float peso) {
		super();
		this.identificador = identificador;
		this.nome = nome;
		this.idade = idade;
		this.tamanho = tamanho;
		this.peso = peso;
	}
	
	public Long getIdentificador() {
		return identificador;
	}

	public void setIdentificador(Long identificador) {
		this.identificador = identificador;
	}
	
	public String getNome () {
		return nome;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public Integer getIdade () {
		return idade;
	}
	
	public void setIdade (Integer idade) {
		this.idade = idade;
	}
	
	public Float getTamanho () {
		return tamanho;
	}
	
	public void setTamanho (Float tamanho) {
		this.tamanho = tamanho;
	}
	
	public Float getPeso () {
		return peso;
	}
	
	public void setPeso (Float peso) {
		this.peso = peso;
	}
	
	public void dizerOla () {
		System.out.println("Olá, eu sou um animal!");
	}


}

}
