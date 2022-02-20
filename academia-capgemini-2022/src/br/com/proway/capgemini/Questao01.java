package br.com.proway.capgemini;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int altura, degraus, espaco;
		
		System.out.println("Informe o tamanho da escada: ");
		Integer tamanhoDaEscada = entrada.nextInt();
		
		for(altura = 1; altura <= tamanhoDaEscada; altura++) {
			for(espaco = tamanhoDaEscada; espaco > altura; espaco--) {
				System.out.print("|");
			}
			for(degraus = 1; degraus <= altura; degraus++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		entrada.close();

	}

}
