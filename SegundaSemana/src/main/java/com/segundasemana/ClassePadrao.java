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
public class ClassePadrao {
    	
	protected String nome;
	
	public ClassePadrao () {
		
	}
	
	public ClassePadrao (String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return "Meu nome é: " + nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
}

