package br.com.opet.banco;

public class TestaFuncionarios {

	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.setNome("Rafael Consentino");
		g.setSalario(2000);
		g.setCpf("12345");
		g.setUsuario("rafael.consentino");

		Telefonista t = new Telefonista();
		t.setNome("Carolina Melo");
		t.setSalario(1000);
		t.setEstacaoDeTrabalho(13);
		
		Secretaria s = new Secretaria();
		s.setNome("Tatiana Andrade");
		s.setSalario(1500);
		s.setRamal(198);
		
		Funcionario x = g;
		
		System.out.println("X: "+x.getBonificacao());//qual bonificacao sera executada 10% 0u 15%

		
		g.mostra();
		t.mostra();
		s.mostra();
		
		ControleDeBonificacoes sistema =  new ControleDeBonificacoes();
		System.out.println("Total: "+ sistema.getTotalDeBonificacoes());
		sistema.registra(g);
		sistema.registra(t);
		sistema.registra(s);
		System.out.println("Total: "+ sistema.getTotalDeBonificacoes());
		
	}

}
