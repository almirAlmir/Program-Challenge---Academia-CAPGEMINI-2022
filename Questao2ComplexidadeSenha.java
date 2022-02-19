package theHuxley;

import java.util.Scanner;

public class Questao2ComplexidadeSenha {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		boolean temDigitos = false;
		boolean temMinusculo = false;
		boolean	temMaiusculo = false;
		boolean temcharEspecial = false;
		
		String entradaSenha = input.next();
		
		for(int i = 0; i < entradaSenha.length(); i++) {
			
			//Se houve digitos na senha retorna Verdadeiro
			if(Character.isDigit(entradaSenha.charAt(i))) {
				temDigitos = true;
				
			}else if(Character.isLowerCase(entradaSenha.charAt(i))) {
				temMinusculo = true;
			//Acima retorna Verdade se houve minusculos
			//Abaixo retorna verdade se houve maiusculos	
			}else if(Character.isUpperCase(entradaSenha.charAt(i))) {
				temMaiusculo = true;
				
			}else if(entradaSenha.charAt(i) == '!'||
					entradaSenha.charAt(i) == '@'||
					entradaSenha.charAt(i) == '#'||
					entradaSenha.charAt(i) == '$'||
					entradaSenha.charAt(i) == '%'||
					entradaSenha.charAt(i) == '^'||
					entradaSenha.charAt(i) == '&'||
					entradaSenha.charAt(i) == '*'||
					entradaSenha.charAt(i) == '('||
					entradaSenha.charAt(i) == ')'||
					entradaSenha.charAt(i) == '-'||
					entradaSenha.charAt(i) == '+'){
				
				//Condicao que testa varios 'OUS' checando se � um caracter Especial valido
				
				temcharEspecial = true;
				
				
				
			}
		}
		
		//Checa se a senha tem no minimo cada um tipo de caracter necessario
		//Al�m de checar se ela tem o tamanho correto
		if(entradaSenha.length() >= 6) {
			
			//Se tiver todos os tipos de caracter a senha � considerada forte
			//Sen�o ela n�o da nenhum retorno
			if(temDigitos && temMinusculo && temMaiusculo && temcharEspecial) {
				System.out.println("Senha forte");
			}else {
				System.out.println("Senha fraca");
			}
		}else {
			//Se a senha for menor retorna q qtd minima de caracter que a pessoa
			//precisa digitar
			System.out.println(6 - entradaSenha.length());
		}
		
		
		input.close();
	}
	
}

/*

Possui no m�nimo 6 caracteres.
Cont�m no m�nimo 1 digito.
Cont�m no m�nimo 1 letra em min�sculo.
Cont�m no m�nimo 1 letra em mai�sculo.
Cont�m no m�nimo 1 caractere especial. Os caracteres especiais s�o: !@#$%^&*()-+


*/