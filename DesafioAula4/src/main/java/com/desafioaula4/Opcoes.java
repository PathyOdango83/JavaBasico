/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desafioaula4;

import java.util.Scanner;

/**
 *
 * @author Patricia Silva
 */
class Opcoes {
    

	
	Scanner sc = new Scanner (System.in);
	
	public  void selecionarOpcao1() {
		
	
		String animal;
			
				do {
					animal = lerAnimal();
					Impressora.imprimaValor("Eu prefiro Gato");
				}	while (!animal.toLowerCase().equals("gato") );//usado o ! para ter o efeito contrario do .equals
					Impressora.imprimaValor("Que legal! O meu também!");
		}

		
	public String lerAnimal() {
		Impressora.imprimaValor("Qual seu animal preferido?");
		return sc.nextLine();
	}
	
	public int selecionarOpcao2() {		
		
		Impressora.imprimaValor("Qual a idade do seu filho?");
		int idade = sc.nextInt();
		
		if (idade > 0 && idade < 12) {			
			Impressora.imprimaValor("Ele ainda é uma criança!");			
		} else if (idade > 11 && idade < 19) {			
			Impressora.imprimaValor("Adolescência é fogo...");
		} else {
			Impressora.imprimaValor("Ele já é um adulto!");
		}
		return idade;
		
	}

	public void selecionarOpcao3(int idade) {

		if (idade == 0) {
			Impressora.imprimaValor("É necessário informar a idade na opção 2");
		} else {

			for (int i = 0; i < idade; i++) {
				Impressora.imprimaValor(i + "...");

			}
			Impressora.imprimaValor(idade + "são tantos anos...");
		}
	}
} 

