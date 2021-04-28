package br.com.opet.banco;

public class TestaSecretaria {

	public static void main(String[] args) {
		SecretariaAdministrativa sd = new SecretariaAdministrativa();          
		sd.setNome("Vanessa Albuquerque");
		sd.setCpf("123.456.789-10");
		sd.setRamal(4400);
		sd.setSalario(2000);
		sd.mostra();
		
		SecretariaJuridica sj = new SecretariaJuridica();
		sj.setNome("Cristiane Borges");
		sj.setCpf("111.222.333.444-55");
		sj.setRamal(4401);
		sj.setSalario(2000);
		sj.mostra();

	}

}
