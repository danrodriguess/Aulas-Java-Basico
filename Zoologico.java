package br.unipe.java.unidade2;

public class Zoologico {
	
	public static void main(String[] args) {
		Animal wil = new Cachorro();
		treina(wil);
	}

	public static void treina(Animal animal){
		
		animal.come();
		animal.dorme();
	
	}

}
