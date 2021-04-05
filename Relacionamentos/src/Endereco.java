
public class Endereco {
	private String logradouro;
	private int numero;
	private String cep;

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public void mostra() {
		System.out.println("Logradouro: "+this.getLogradouro());
		System.out.println("Numero....: "+this.getNumero());
		System.out.println("CEP.......: "+this.getCep());
	}

}
