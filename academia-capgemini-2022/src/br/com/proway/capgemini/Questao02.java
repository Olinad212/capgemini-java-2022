package br.com.proway.capgemini;

import java.util.Scanner;

public class Questao02 {
	
	/**
	 * @author Danilo Nogueira da Silva
	 * Esta classe valida a senha informada pelo usuario.
	 * @param args
	 */

	public static void main(String[] args) {
		
		System.out.println("=== DEFINICAO DE SENHA ===");
		System.out.println("Possui no minimo 6 caracteres.\r\n"
				         + "Contém no minimo 1 digito.\r\n"
				         + "Contém no minimo 1 letra em minusculo.\r\n"
				         + "Contém no minimo 1 letra em maiusculo.\r\n"
				         + "Contém no minimo 1 caractere especial. Os caracteres especiais sao: !@#$%^&*()-+\r\n");
		
		System.out.print("Informe sua senha: ");
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