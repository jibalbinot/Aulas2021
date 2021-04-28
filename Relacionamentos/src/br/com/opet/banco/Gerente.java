package br.com.opet.banco;

public class Gerente extends FuncionarioAutenticavel {
	private String usuario;
	private int senha;
	private int numeroDeFuncionariosGerenciados;

	@Override
	public boolean autentica(int senha) {
		if (senha == this.senha)
			return true;
		else
			return false;
	}
	
	@Override
	public double getBonificacao() {
		return this.getSalario() * 0.15;
	}
	
	@Override
	public void mostra() {
		System.out.println("Gerente");
		super.mostra();//casa seja interessante usar o código da classe mãe (superclasse)
		System.out.println("Usuário.....: "+this.getUsuario());
		System.out.println("Senha.......: "+this.getSenha());
		System.out.println("Subordinados: "+this.getNumeroDeFuncionariosGerenciados());
		System.out.println();
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public int getNumeroDeFuncionariosGerenciados() {
		return numeroDeFuncionariosGerenciados;
	}

	public void setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados) {
		this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
		//System.out.println("Alterou a senha do "+this.getNome());
	}

}
