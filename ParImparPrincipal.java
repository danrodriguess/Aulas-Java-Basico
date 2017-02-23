package br.unipe.java.unidade1;

import java.util.Scanner;

public class ParImparPrincipal {

	public static void main(String[] args) {
		ParImpar numero = new ParImpar();
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Informe um número: ");
		numero.n = teclado.nextFloat();
		numero.verificar(numero.n);
		
		for(numero.i=1;numero.i<10;numero.i++){
			System.out.println("Informe outro número: ");
			numero.n = teclado.nextFloat();
			numero.verificar(numero.n);
		}
		teclado.close();
	}

}
