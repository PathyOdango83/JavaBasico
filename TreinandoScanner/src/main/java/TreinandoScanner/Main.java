
 

import static TreinandoScanner.TreinandoScanner.verificaIdadeComSwitch;
import static TreinandoScanner.TreinandoScanner.verificaIdadeEPeso;
import java.util.Scanner; 

public class Main {
     
     public static void main(String[] args){
         
        String controle = "C";

        
         Scanner sc = new Scanner (System.in);
         
         while (controle.equals("C")){
         
         System.out.print("Informe seu nome:");
			String nome = sc.nextLine();
			System.out.print("Informe sua idade:");
			int idade = sc.nextInt();
			System.out.print("Informe seu peso:");
			float peso = sc.nextFloat();

   System.out.printf("\nMeu nome é %s \nMinha  idade é %d  \nMeu peso é %.2f \n", nome, idade, peso);
       
       verificaIdadeEPeso(peso,idade,nome);
       
       verificaIdadeComSwitch(idade);
      } 
    
     }
     
     
}
