package br.com.opet.banco;

public abstract class Secretaria extends Funcionario {
	private int ramal;

	@Override
	public abstract double getBonificacao();

	public int getRamal() {
		return ramal;
	}

	public void setRamal(int ramal) {
		this.ramal = ramal;
	}

	@Override
	public void mostra() {
		System.out.println("Secret�ria");
		super.mostra();
		System.out.println("Ramal.......: " + this.getRamal());
	}

}
