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
public class Menu {
    
    Impressora i = new Impressora (); 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		

		int escolha;
		Opcoes opcoes = new Opcoes (); 
		int idade = 0;
		
		
		
		do {
			escolha = escolherOpcao(sc);
			switch (escolha) {
			case 1:
				opcoes.selecionarOpcao1();
			break; 
			case 2:
				opcoes.selecionarOpcao2();
			break;
				
			case 3:
				opcoes.selecionarOpcao3(idade);			
			break;
			case 0:
				break;
			
			default:
				Impressora.imprimaValor("Você não selecionou uma opção valida!");
				break; 
		}	while (escolha != 0);
			
	}
	
	public static int escolherOpcao (Scanner sc) { 
		Impressora.imprimaValor("Escolha um número de 1 a 3, ou 0 para sair");
		return sc.nextInt();
	}

}

    

