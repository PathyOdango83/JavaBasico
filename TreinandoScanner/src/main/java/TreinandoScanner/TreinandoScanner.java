/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TreinandoScanner;

/**
 *
 * @author Patricia Silva
 */
public class TreinandoScanner {
    public static void verificaIdadeEPeso(float peso, int idade, String nome) {
		if ((peso > 80 && idade > 40) || nome.equals ("Patricia")){
			System.out.println("Você precisa correr mais");
		} 
                  else {
			System.out.println("Coma mais carboidratos");
		       }
	}

	public static void verificaIdadeComSwitch(int idade) {
		switch (idade) {
		case 80:
			System.out.println("Parabéns pelos seus 80 anos!");
			break;

		case 40:
			System.out.println("Parabéns pelos seus 40 anos!");
			break;

		default:
			System.out.println("Você ainda é jovem!");
			break;
		}
	}
    
}
