/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Patricia Silva
 */
import java.util.Scanner;


public class Principal {

	
	public static void main(String[] args) {
		
	
		
		System.out.println("Digite uma String:");
		Scanner sc = new Scanner (System.in);
		String texto = sc.nextLine();
		
		int controleAchouA = 0;
				
		for (String a : texto.split("") ) { 
			if (controleAchouA == 0) {
			System.out.println(a);
			} else {
				controleAchouA -- ;
			}
			if (a.toLowerCase().contains("a")) {
				controleAchouA = 2;
			}
		}
		for (String a : texto.split("") ) {
			if (a.toLowerCase().contains("b")) {
				System.out.println("Encontrei um b");
				continue;
			}
			System.out.println("Não encontrei um b");
		}
		for (String a : texto.split("")) {
			if (a.toLowerCase().contains("b")) {
				System.out.println("Encontrei um b");
				break;
			}
			System.out.println("Não encontrei um b");
		}
	}

}

