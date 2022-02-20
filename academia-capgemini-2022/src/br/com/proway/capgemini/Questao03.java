package br.com.proway.capgemini;

import java.util.Arrays;
import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {
		
		/**
		 * @author Danilo Nogueira da Silva
		 * Esta classe encontra pares de anagramas dentro de uma palavra informada pelo usuario.
		 * Esta classe ainda precisa ser ajustada porque nao esta encontrando todos os anagramas devido a forma como a palavra esta sendo percorrida.
		 * @param args
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe uma palavra para encontrarmos os anagramas: ");
		String palavraInicial = entrada.nextLine();
		String palavraAjustada = palavraInicial.toLowerCase();
		int tamanhoPalavra = palavraAjustada.trim().length();
		int quantidade = 0;
		
		for(int i = 0; i < tamanhoPalavra; i++) {
			for(int j = i + 1; j <= tamanhoPalavra; j++) {
				for(int k = j + 1; k <= tamanhoPalavra; k++) {
					if(i != j && i < j && k <= tamanhoPalavra && i == 0) {
						StringBuilder trecho1Ordenado = remontaPedacoDaPalavraOrdenado(fragmentaEOrdenaPedacoDaPalavra(palavraAjustada, i, j));
						StringBuilder trecho2Ordenado = remontaPedacoDaPalavraOrdenado(fragmentaEOrdenaPedacoDaPalavra(palavraAjustada, k-j, k));
						if(trecho1Ordenado.toString().equals(trecho2Ordenado.toString())){
							System.out.println(trecho1Ordenado.toString() + " | " + trecho2Ordenado.toString());
							++quantidade;
						}
					}

				}

			}
		}
		
		System.out.println("Quantidade: " + quantidade);
		
	
		entrada.close();
	}
	
	private static char[] fragmentaEOrdenaPedacoDaPalavra(String pedacoDaPalavra, int posicaoInicial, int posicaoFinal) {
		char[] trecho1SemOrdenacao = pedacoDaPalavra.substring(posicaoInicial, posicaoFinal).toCharArray();
		Arrays.sort(trecho1SemOrdenacao);
		return trecho1SemOrdenacao;
	}
	
	private static StringBuilder remontaPedacoDaPalavraOrdenado(char[] trechoASerMontado) {
		StringBuilder trechoOrdenado = new StringBuilder();
		for(char c : trechoASerMontado) {
			trechoOrdenado.append(c);
		}
		return trechoOrdenado;
	}

}
