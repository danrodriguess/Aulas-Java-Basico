package br.unipe.java.unidade1;

public class ParImpar {
	float n,i;
	
	public void verificar(float n){
			if (n % 2 == 0){
				System.out.println("O número " + n + " é par.\n");
			}else{
				System.out.println("O número " + n + " é impar.\n");
			}
			
	}
}
