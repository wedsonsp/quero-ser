package br.com.intelitrader.caixaeletronico;

import java.util.Scanner;

public class CaixaEletronico {

	public static void calcular(double valor){
		//Notas disponiveis
		int[] cedulas = {100,50,20,10};
		//Valor total
		double total = valor;
		
		for(int i = 0; i < cedulas.length; i++){
			if( valor >= cedulas[i] ){
				//Calculo de Qtd de Notas e seus respectivos valores.
				System.out.println( (int)valor/cedulas[i] + " notas de " + " R$" + cedulas[i]);
				//Calcula as notas diferentes dos notas disponíveis contidas no Array.
				valor = valor % cedulas[i];
			}
			
		}
		
		System.out.println("Não existem notas de : R$ " + valor + " disponíveis"
				+ " .Apenas para multiplos de R$ 100, R$ 50,00, R$ 20,00 e R$ 10,00"
					);
	
	}
	
	public static void main(String[] args) {
		
		//Digitando o valor
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um valor: ");
		int valor = scan.nextInt();
		
		//Passando o valor por parâmetro para o método que faz o Calculo.
		calcular(valor);
		
	}
}
