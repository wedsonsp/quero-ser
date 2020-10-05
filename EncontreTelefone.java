package br.com.intelitrader.encontretelefone;

import java.util.Scanner;

public class EncontreTelefone {

	public static void main(String[] args) {

		Scanner x = new Scanner(System.in); // Criando o leitor de texto do console

		String numerico = ""; // String que irá concatenar o telefone após a conversão

		System.out.println("Digite o telefone(Somente Letras): "); // texto de interação com usuário

		String str = x.nextLine(); // Leitura do texto

		// Percorrendo o texto lido, letra a letra

		for (int i = 0; i < str.length(); i++) {

			// pegando a letra específica, transformando em maiúscula e atribuindo a uma
			// variável

			char c = str.toUpperCase().charAt(i);

			// Tratamento das letras

			if (c == 'A' || c == 'B' || c == 'C') {

				numerico += 2;

			}

			if (c == 'D' || c == 'E' || c == 'F') {

				numerico += 3;

			}

			if (c == 'G' || c == 'H' || c == 'I') {

				numerico += 4;

			}

			if (c == 'J' || c == 'K' || c == 'L') {

				numerico += 5;

			}

			if (c == 'M' || c == 'N' || c == 'O') {

				numerico += 6;

			}

			if (c == 'P' || c == 'Q' || c == 'R' || c == 'S') {

				numerico += 7;

			}

			if (c == 'T' || c == 'U' || c == 'V') {

				numerico += 8;

			}

			if (c == 'W' || c == 'X' || c == 'Y' || c == 'Z') {

				numerico += 9;

			}

			if (c == '-') {

				numerico += "-";

			}

		}

		System.out.println(numerico);

	}

}
