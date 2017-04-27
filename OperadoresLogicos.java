package br.unipe.java.unidade2;

public class OperadoresLogicos {
	
	public static void main(String[] args) {
		
		if (existePeixe() || existeBebida()){
			System.out.println("BELEZA!!");
		}
		
		byte valor = 127;
		short valorShort = 12345;
		int valorInt = 1231231231;
		
		valor = (byte)valorShort;
		System.out.println(valor);
		
		boolean ehIgual = (5 == 5) ? (7 == 7) ? true : false : false;
		
		System.out.println(ehIgual);
		
		
		
		
		
	}

	public static boolean existePeixe(){
		System.out.println("Bacalhau!!");
		return true;
	}
	
	public static boolean existeBebida(){
		System.out.println("Vinhoo!");
		return true;
	}
	
	
}
