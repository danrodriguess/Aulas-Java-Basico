package br.unipe.java.unidade1;

import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		String nome;
		int anoNacimento, anoAtual, idade;
		
		Scanner teclado = new Scanner(System.in);
			
		System.out.println("Informe seu nome: ");
		nome = teclado.next();
		
		System.out.println("Informe o ano do seu nacimento: ");
		anoNacimento = teclado.nextInt();
		
		System.out.println("Informe o ano atual: ");
		anoAtual = teclado.nextInt();
		
		idade = anoAtual - anoNacimento;
		
		teclado.close();
		
		System.out.println("Olá " + nome + ", você tem " + idade + " anos.");
	}

}
