package br.com.opet.banco;

public class Secretaria extends Funcionario {
	private int ramal;

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
		System.out.println("Ramal: "+this.getRamal());
	}
	
}
