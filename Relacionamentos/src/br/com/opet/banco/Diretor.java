package br.com.opet.banco;

public class Diretor extends Funcionario implements Autenticavel {
	private int senha;

	@Override
	public boolean autentica(int senha) {
		if (senha == this.senha)
			return true;
		else
			return false;
	}

	@Override
	public double getBonificacao() {
		return this.getSalario() * 0.20;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

}
