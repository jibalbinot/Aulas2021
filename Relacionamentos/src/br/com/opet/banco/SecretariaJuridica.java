package br.com.opet.banco;

public class SecretariaJuridica extends Secretaria {

	@Override
	public double getBonificacao() {
		return this.getSalario() * 0.08;
	}

	@Override
	public void mostra() {
		super.mostra();
		System.out.println("Função......: Jurídica");
		System.out.println();
	}
	
}
