package br.unipe.java.unidade1;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		float n1, n2, n3, media;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Informe sua primeira nota: ");
		n1 = teclado.nextFloat();
		
		System.out.println("Informe sua segunda nota: ");
		n2 = teclado.nextFloat();
		
		System.out.println("Informe sua terceira nota: ");
		n3 = teclado.nextFloat();
		
		media = (n1+n2+n3)/3;
		
		teclado.close();
		
		System.out.println("Sua média foi: " + media);
		
		if (media >= 7){
			System.out.println("Aprovado, Parabéns!!");
		}else if(media < 7 && media >= 5){
			System.out.println("Recuperação, Quase lá!");
		}else{
			System.out.println("Reprovado, Tente novamente!");
		}
		
	}

}
