package br.com.intelitrader.anobissexto;

import java.util.Scanner;

public class AnoBissexto {

	public static int mostraAno(int ano) {

		System.out.println("O ano �: " + ano);

		if ((((ano % 4 == 0) || (ano % 400 == 0)) && !(ano % 100 == 0))) {

			System.out.println("O ano " + ano + " � Bissexto");
		} else {
			System.out.println("O ano " + ano + " n�o � Bissexto");
		}

		return ano;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o Ano: ");
		int ano = scan.nextInt();
		
		mostraAno(ano);

	}

}
