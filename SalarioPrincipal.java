package br.unipe.java.unidade1;

import java.util.Scanner;

public class SalarioPrincipal {

	public static void main(String[] args) {
			
		Salario salario = new Salario();
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe seu sal�rio atual: ");
		salario.salarioAntigo = teclado.nextFloat();
		
		System.out.println("Informe seu percentual de aumento: ");
		salario.percentual = teclado.nextFloat();
		
		teclado.close();
			
		salario.calculaSalario(salario.salarioAntigo, salario.percentual);
		
		System.out.println("Seu aumento foi de R$" + salario.aumentoPercentual + " reais.\n");
		
		System.out.println("Seu sal�rio, com o aumento, ser� R$" + salario.salarioNovo + " reais.");
	
		
		
		
	}

}
