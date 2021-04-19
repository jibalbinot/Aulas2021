package br.com.opet.banco;

public class Telefonista extends Funcionario {
	private int estacaoDeTrabalho;
	
	@Override
	public double getBonificacao() {
		return this.getSalario() * 0.05;
	}
	
	public int getEstacaoDeTrabalho() {
		return this.estacaoDeTrabalho;
	}
	
	public void setEstacaoDeTrabalho(int estacaoDeTrabalho) {
		this.estacaoDeTrabalho = estacaoDeTrabalho;
	}
	
	@Override
	public void mostra() {
		System.out.println("Telefonista");
		super.mostra();
		System.out.println("Estação de Trabalho: "+this.getEstacaoDeTrabalho());
		System.out.println();
	}

	
	
}
