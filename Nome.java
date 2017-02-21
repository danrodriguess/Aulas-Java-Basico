package br.unipe.java.unidade1;

import java.util.Scanner;

public class Nome {

	public static void main(String[] args) {
		String nome;
		int idade;
		
		Scanner teclado = new Scanner(System.in);
			
		System.out.println("Informe seu nome: ");
		nome = teclado.next();
		
		System.out.println("Informe sua idade: ");
		idade = teclado.nextInt();
		
		teclado.close();
		
		System.out.println("Seu nome é " + nome + " e você tem " + idade + " anos.");
	}

}
