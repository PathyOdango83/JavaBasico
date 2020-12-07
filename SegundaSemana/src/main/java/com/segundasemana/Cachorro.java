/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.segundasemana;

    import br.com.util.Tradutor;

public class Cachorro extends Animal  {
	
	private Boolean possuiCama;
	
	public Cachorro() {

	}
	
	public Boolean getPossuiCama() {
		return possuiCama;
	}

	public void setPossuiCama(Boolean possuiCama) {
		this.possuiCama = possuiCama;
	}
	
	@Override
	public void dizerOla () {
		System.out.println("Olá, eu sou um Cachorro!");
	}
	
	public String getTraduzirPossuiCama() {

		return Tradutor.traduzir(this.possuiCama);
	}
}

    

