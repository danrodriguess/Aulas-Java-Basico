package br.unipe.java.unidade1;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		float x, y, soma;
		
		Scanner teclado = new Scanner(System.in);
			
		System.out.println("Informe o primeiro n�mero: ");
		x = teclado.nextFloat();
		
		System.out.println("Informe o segundo n�mero: ");
		y = teclado.nextFloat();
		
		soma = x + y;
		
		teclado.close();
		
		System.out.println("O resultado da soma �: " + soma);
		
		
	}

}
