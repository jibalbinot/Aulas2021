package br.com.opet.banco;

public class TestaGerente {

	public static void main(String[] args) {
		
		Funcionario f = new Gerente();
		f.setNome("Jeysonn");
		f.setCpf("432");
		f.setSalario(1500);
		f.mostra();
		
		
		Gerente g = new Gerente();
		g.setNome("Evandro");
		g.setCpf("123");
		g.setSalario(2500);
		g.setSenha(111);
		g.mostra();

	}

}
