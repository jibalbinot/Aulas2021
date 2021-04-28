package br.com.opet.banco;

public class TestaSistemaInterno {
   public static void main(String[] args) {
	   Gerente g = new Gerente();
	   g.setNome("Evandro");
	   g.setCpf("123.456.789-10");
	   g.setSalario(2000);
	   g.setSenha(123);
	   g.setNumeroDeFuncionariosGerenciados(5);
	   g.setUsuario("evandro");
	   g.mostra();
	   
	   Diretor d = new Diretor();
	   d.setNome("Michele");
	   d.setCpf("111.222.333-44");
	   d.setSalario(3000);
	   d.setSenha(111);
	   d.mostra();
	   
	   System.out.println();
	   
	   SistemaInterno si = new SistemaInterno();
	   si.login(g);//o gerente fez login no SI
	   si.login(d);//o diretor fez login no SI
	   
   }
}
