package br.unipe.java.unidade1;

public class Emprestimo {
	
	public String nome;
	public int idade;
	public float valorEmprestimo;
	public int jurosPercentual;
	public int tempoPagamento;
	
	public void Tela(){
		System.out.println("\n\n\n-------------------------------------------------------");
		System.out.println("\nNome: " + nome);
		System.out.println("\nIdade: " + idade);
		System.out.println("\nValor do Empréstimo: " + valorEmprestimo);
		System.out.println("\nJuros: " + jurosPercentual);
		System.out.println("\nMeses para pagamento:  " + tempoPagamento);
		System.out.println("\n-------------------------------------------------------");
		
	}
	
	public void calcularEmprestimo(float valorEmprestimo, int idade, int tempoPagamento, int jurosPercentual){
		
		if(idade >= 18 && idade < 23){
			valorEmprestimo += (valorEmprestimo / tempoPagamento) * (jurosPercentual / 100);
			
			
		}
		if(idade > 23 && idade <= 33){
			valorEmprestimo += (valorEmprestimo * 10) / 100;
		}
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getValorEmprestimo() {
		return valorEmprestimo;
	}

	public void setValorEmprestimo(float valorEmprestimo) {
		this.valorEmprestimo = valorEmprestimo;
	}

	public int getJurosPercentual() {
		return jurosPercentual;
	}

	public void setJurosPercentual(int jurosPercentual) {
		this.jurosPercentual = jurosPercentual;
	}

	public int getTempoPagamento() {
		return tempoPagamento;
	}

	public void setTempoPagamento(int tempoPagamento) {
		this.tempoPagamento = tempoPagamento;
	}

		
}

