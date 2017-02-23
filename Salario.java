package br.unipe.java.unidade1;

public class Salario {
	
	float salarioAntigo, percentual, aumentoPercentual, salarioNovo;
	
	public void calculaSalario(float salarioAntigo, float percentual){
		aumentoPercentual = salarioAntigo * (percentual/100);
		
		salarioNovo = aumentoPercentual + salarioAntigo;
		
	}

	public float getSalarioAntigo() {
		return salarioAntigo;
	}

	public void setSalarioAntigo(float salarioAntigo) {
		this.salarioAntigo = salarioAntigo;
	}

	public float getPercentual() {
		return percentual;
	}

	public void setPercentual(float percentual) {
		this.percentual = percentual;
	}

	public float getAumentoPercentual() {
		return aumentoPercentual;
	}

	public void setAumentoPercentual(float aumentoPercentual) {
		this.aumentoPercentual = aumentoPercentual;
	}

	public float getSalarioNovo() {
		return salarioNovo;
	}

	public void setSalarioNovo(float salarioNovo) {
		this.salarioNovo = salarioNovo;
	}
	


}
