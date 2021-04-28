package br.com.opet.banco;
public class Cliente implements Autenticavel {
	private String nome;
	private int senha;
	//criacao e a ligacao dos objetos
	private Endereco end = new Endereco();

	@Override
	public boolean autentica(int senha) {
		if (senha == this.senha)
			return true;
		else
			return false;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEnd() {
		return end;
	}

	public void setEnd(Endereco end) {
		this.end = end;
	}

	public void mostra() {
		System.out.println("Nome......: " + this.getNome());
		System.out.println("Senha.....: " + this.getSenha());
		this.getEnd().mostra();//chama o mostra do Endereco
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	
}
