package br.com.proway.capgemini;

import java.util.Arrays;
import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		//System.out.println("Informe uma palavra para encontrarmos os anagramas: ");
		//String palavra = entrada.nextLine();
		String palavra = "ifailuhkqq";
		int tamanhoPalavra = palavra.trim().length();
		int quantidade = 0;
		
		System.out.println("=== IMPRIMINDO ===");
		for(int i = 0; i < tamanhoPalavra; i++) {
			for(int j = i + 1; j <= tamanhoPalavra; j++) {
				for(int k = j + 1; k <= tamanhoPalavra; k++) {
					if(i != j && i < j && k <= tamanhoPalavra && i == 0) {
						char[] trecho1SemOrdenacao = palavra.substring(i, j).toCharArray();
						Arrays.sort(trecho1SemOrdenacao);
						StringBuilder trecho1Ordenado = new StringBuilder();
						for(char c : trecho1SemOrdenacao) {
							trecho1Ordenado.append(c);
						}
						char[] trecho2SemOrdenacao = palavra.substring(k-j, k).toCharArray();
						Arrays.sort(trecho2SemOrdenacao);
						StringBuilder trecho2Ordenado = new StringBuilder();
						for(char c : trecho2SemOrdenacao) {
							trecho2Ordenado.append(c);
						}
						System.out.println("i: " + i + " | j: " + j + " | k: " + k + " | k-1: " + (k-j));
						
						
						System.out.println(palavra.substring(i, j) + "    |    " + palavra.substring(k-j, k));
						
						
						System.out.println("Trecho 1: " + trecho1Ordenado + " | Trecho 2: " + trecho2Ordenado);
						if(trecho1Ordenado.toString().equals(trecho2Ordenado.toString())){
							System.out.println("ESTE DE CIMA!!!!!!");
							++quantidade;
						}
					}
					
					if(i != j && i < j && k <= tamanhoPalavra) {
						char[] trecho1SemOrdenacao = palavra.substring(i, j).toCharArray();
						Arrays.sort(trecho1SemOrdenacao);
						StringBuilder trecho1Ordenado = new StringBuilder();
						for(char c : trecho1SemOrdenacao) {
							trecho1Ordenado.append(c);
						}
						char[] trecho2SemOrdenacao = palavra.substring(k-j, k).toCharArray();
						Arrays.sort(trecho2SemOrdenacao);
						StringBuilder trecho2Ordenado = new StringBuilder();
						for(char c : trecho2SemOrdenacao) {
							trecho2Ordenado.append(c);
						}
						System.out.println("i: " + i + " | j: " + j + " | k: " + k + " | k-i: " + (k-i));
						
						
						System.out.println(palavra.substring(i, j) + "    |    " + palavra.substring(k-i, k));
						
						
						System.out.println("Trecho 1: " + trecho1Ordenado + " | Trecho 2: " + trecho2Ordenado);
						if(trecho1Ordenado.toString().equals(trecho2Ordenado.toString())){
							System.out.println("ESTE DE CIMA!!!!!!");
							++quantidade;
						}
					}
				}

			}
			System.out.println();
			System.out.println();
		}
		
		System.out.println("Quantidade: " + quantidade);
		
	
		entrada.close();
	}

}
