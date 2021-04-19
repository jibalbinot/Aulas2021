package br.com.opet.banco;

/*
 * Classe abstrata não permite a instanciação (criação
 * de objetos), ela servirá apenas de modelo para outras
 * classes
 */
public abstract class Conta {
	private double saldo;

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
