package br.com.opet.banco;

public class ContaCorrente extends Conta {
	private double limite;

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

}