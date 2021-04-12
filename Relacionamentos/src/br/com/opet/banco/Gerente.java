package br.com.opet.banco;

public class Gerente extends Funcionario {
	private int senha;
	private int numeroDeFuncionariosGerenciados;

	@Override
	public void mostra() {
		//super.mostra();//casa seja interessante usar o código da classe mãe (superclasse)
		System.out.println("-----------------");
		System.out.println("Nome........: Dr(a) " + this.getNome());
		System.out.println("CPF.........: " + this.getCpf());
		System.out.println("Salario.....: " + this.getSalario());
		System.out.println("Subordinados: "+this.numeroDeFuncionariosGerenciados);
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
		System.out.println("Alterou a senha do "+this.getNome());
	}

}
