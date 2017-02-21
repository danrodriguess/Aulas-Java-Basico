package br.unipe.java.unidade1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		Cachorro cachorro = new Cachorro();
		
		System.out.println("Informe o nome do seu cachorro: ");
		cachorro.nome = leitor.nextLine();
		cachorro.late();
		
		Carro ferrari = new Carro();
		ferrari.avancar();
		ferrari.retroceder();
		
		Carro camaro = new Carro();
		camaro.abastecer();
		camaro.parar();
		
		leitor.close();
	}

}
