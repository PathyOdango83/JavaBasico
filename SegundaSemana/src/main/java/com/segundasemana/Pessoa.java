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

    	public class Pessoa extends ClassePadrao  {

		private Float peso;
		private Character sexo;
		
		//metodo contrutor executa ao Criar uma instancia da classe
		public Pessoa () {
			super();			
		}
		
		public Pessoa(String nome, Float peso, Character sexo) {
			super();
			this.nome = nome;
			this.peso = peso;
			this.sexo = sexo;
		}
		
		@Override
		public String getNome() {
			return "Pessoa: " + this.nome;
		}
		
		public Float getPeso() {
			return peso;
		}
		
		public void setPeso(Float peso) {
			this.peso = peso;
		}
		
		public Character getSexo() {
			return sexo;
		}
		
		public void setSexo(Character sexo) {
			this.sexo = sexo;
		}
		
		
}

}
