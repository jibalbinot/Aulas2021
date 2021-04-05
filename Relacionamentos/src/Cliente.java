public class Cliente {
	private String nome;
	//criacao e a ligacao dos objetos
	private Endereco end = new Endereco();

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
		this.getEnd().mostra();//chama o mostra do Endereco
	}

}
