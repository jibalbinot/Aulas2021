package br.com.opet.banco;

/*
 * Classe abstrata que servirá de modelo para outras
 * classes
 */
public abstract class Funcionario {
	private String nome;
	private String cpf;
	private double salario;

	/*
	 * método abstrato não tem corpo(código)
	 * uma classe filha concreta que estenda
	 * essa classe deverá implementar este 
	 * método
	 */
	public abstract double getBonificacao();

	public void mostra() {
		System.out.println("-----------------");
		System.out.println("Nome........: " + this.getNome());
		System.out.println("CPF.........: " + this.getCpf());
		System.out.println("Salario.....: " + this.getSalario());
		System.out.println("Bonificacao.: "+this.getBonificacao());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
