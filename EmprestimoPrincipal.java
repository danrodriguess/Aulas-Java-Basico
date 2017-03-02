package br.unipe.java.unidade1;

import java.util.Scanner;

public class EmprestimoPrincipal {

	public static void main(String[] args) {
			
		Emprestimo emprestimo = new Emprestimo();
		Scanner teclado = new Scanner(System.in);
		
			
		System.out.println("\n------------- Cadastro de Empréstimo -------------\n");
		System.out.println("\nNome: ");
		emprestimo.nome = teclado.nextLine();
		System.out.println("\nIdade: ");
		emprestimo.idade = teclado.nextInt();
		System.out.println("\nValor do Empréstimo: ");
		emprestimo.valorEmprestimo = teclado.nextFloat();
		System.out.println("\nMeses para pagamento:  ");
		emprestimo.tempoPagamento = teclado.nextInt();
		System.out.println("\nJuros:  ");
		emprestimo.jurosPercentual = teclado.nextInt();
			
		emprestimo.calcularEmprestimo(emprestimo.valorEmprestimo, emprestimo.idade, emprestimo.tempoPagamento, emprestimo.jurosPercentual);
		
		teclado.close();
			
		emprestimo.Tela();
	}
}
