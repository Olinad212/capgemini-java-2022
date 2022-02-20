package br.com.proway.capgemini;

import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		
		System.out.println("=== DEFINICAO DE SENHA ===");
		System.out.println("Possui no mínimo 6 caracteres.\r\n"
				         + "Contém no mínimo 1 digito.\r\n"
				         + "Contém no mínimo 1 letra em minúsculo.\r\n"
				         + "Contém no mínimo 1 letra em maiúsculo.\r\n"
				         + "Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+\r\n");
		
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
