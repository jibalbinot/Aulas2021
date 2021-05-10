package br.com.opet.banco;

public class ContaCorrente extends Conta implements Comparable<ContaCorrente> {
	private double limite;

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public int compareTo(ContaCorrente o) {
		if (this.getSaldo() > o.getSaldo()) {
			return 1;
		} else if (this.getSaldo() < o.getSaldo()) {
			return -1;
		} else {
			return 0;
		}
	}

}
