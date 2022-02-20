package br.com.proway.capgemini;

import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		
		System.out.println("=== DEFINICAO DE SENHA ===");
		System.out.println("Possui no m�nimo 6 caracteres.\r\n"
				         + "Cont�m no m�nimo 1 digito.\r\n"
				         + "Cont�m no m�nimo 1 letra em min�sculo.\r\n"
				         + "Cont�m no m�nimo 1 letra em mai�sculo.\r\n"
				         + "Cont�m no m�nimo 1 caractere especial. Os caracteres especiais s�o: !@#$%^&*()-+\r\n");
		
		System.out.println("Informe sua senha: ");
		Scanner entrada = new Scanner(System.in);
		String senha = entrada.nextLine();
		
		while (!senha.trim().matches("^(?=.*[A-Z])(?=.*[!@#$%^&*()-+])(?=.*[0-9])(?=.*[a-z]).{6,}$")) {
			if(senha.trim().length() < 6) {
				System.out.println("A sua senha deve ter no minimo 06 caracteres. Acrescente ao menos " + (6 - senha.trim().length()) + " caracteres");
			}
			System.out.println("A sua senha nao cumpre os requisitos de senha forte!");
			senha = entrada.nextLine();
		}

		System.out.println("Senha valida!!");
		entrada.close();
	}

}
