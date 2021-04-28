package br.com.opet.banco;

public class SecretariaAdministrativa extends Secretaria {

	@Override
	public double getBonificacao() {
		return this.getSalario() * 0.07;
	}

	@Override
	public void mostra() {
		super.mostra();
		System.out.println("Fun��o......: Administrativa");
		System.out.println();
	}
	
	

}
