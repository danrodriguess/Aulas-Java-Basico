package br.unipe.java.unidade1;

import java.util.Scanner;

public class ConsumoMedio {

	public static void main(String[] args) {
		float distanciaPercorrida, combustivelGasto, consumo;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Informe a dist�ncia(KM) total percorrida: ");
		distanciaPercorrida = teclado.nextFloat();
		
		System.out.println("Informe o combust�vel(Litros) total gasto: ");
		combustivelGasto = teclado.nextFloat();
		
		consumo = distanciaPercorrida / combustivelGasto;
		
		teclado.close();
		
		System.out.println("Seu consumo m�dio foi de " + consumo + "Km por litro.");
	}

}
