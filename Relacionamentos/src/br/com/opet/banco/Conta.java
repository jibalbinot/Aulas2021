package br.com.opet.banco;

/*
 * Classe abstrata n�o permite a instancia��o (cria��o
 * de objetos), ela servir� apenas de modelo para outras
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
