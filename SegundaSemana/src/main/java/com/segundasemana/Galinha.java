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
public class Galinha extends animal {

	private Float tamanhoDoPoleiro;

	public Float getTamanhoDoPoleiro() {
		return tamanhoDoPoleiro;
	}

	public void setTamanhoDoPoleiro(Float tamanhoDoPoleiro) {
		this.tamanhoDoPoleiro = tamanhoDoPoleiro;
	}

	@Override
	public void dizerOla() {
		System.out.println("Olá eu sou uma Galinha!");
	}
	
    
}
