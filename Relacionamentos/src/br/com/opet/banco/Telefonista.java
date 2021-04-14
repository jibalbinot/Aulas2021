package br.com.opet.banco;

public class Telefonista extends Funcionario {
	private int estacaoDeTrabalho;
	
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
