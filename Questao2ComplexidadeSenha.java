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
				
				//Condicao que testa varios 'OUS' checando se é um caracter Especial valido
				
				temcharEspecial = true;
				
				
				
			}
		}
		
		//Checa se a senha tem no minimo cada um tipo de caracter necessario
		//Além de checar se ela tem o tamanho correto
		if(entradaSenha.length() >= 6) {
			
			//Se tiver todos os tipos de caracter a senha é considerada forte
			//Senão ela não da nenhum retorno
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

Possui no mínimo 6 caracteres.
Contém no mínimo 1 digito.
Contém no mínimo 1 letra em minúsculo.
Contém no mínimo 1 letra em maiúsculo.
Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+


*/