package br.com.opet.banco;

public class Secretaria extends Funcionario {
	private int ramal;

	@Override
	public double getBonificacao() {
		return this.getSalario() * 0.1;
	}

	public int getRamal() {
		return ramal;
	}

	public void setRamal(int ramal) {
		this.ramal = ramal;
	}

	@Override
	public void mostra() {
		System.out.println("Secretária");
		super.mostra();
		System.out.println("Ramal: " + this.getRamal());
	}

}
