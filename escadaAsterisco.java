package theHuxley;
//Made by: Almir Alves de Souza Cruz
//16.02.2022
import java.util.Scanner;

public class escadaAsterisco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
				
		int n = input.nextInt();
		
		//Repeticao FOR que vai incrementar o numero de asteriscos a medida
		//que a escada desce e decrementar o numero de espacos ao mesmo tempo
		for(int asterisco = 1, espaco = n-1; espaco >= 0; asterisco++, espaco--) {
			
			//variaveis auxiliares para controlar a impressao dos caracteres
			//na quantidade correta
			int asteriscoAux = asterisco;
			int espacoAux = espaco;
			
			//repeticao WHILE para imprimir a quantidade correta de espacos e asteriscos
			//respectivamente em cada linha
			while(espacoAux > 0) {
				System.out.print(" ");
				espacoAux--;
			}
			while(asteriscoAux > 0) {
				System.out.print("*");
				asteriscoAux--;
			}
			
			System.out.println();
			
		}
				
				
				
				
				
				
		input.close();
	}

}
