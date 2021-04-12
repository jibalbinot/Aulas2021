package br.com.opet.ativ2;
/**
 * Classe respons�vel por moldar os Pneus
 *
 * @author Manoel Santos da Silva
 */
public class Pneus {
	private double preco;
	private String tipo;
	private String fabricante;

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public void mostra() {
		System.out.println("Pneus");
		System.out.println("-Pre�o.....: " + this.preco);
		System.out.println("-Tipo......: " + this.tipo);
		System.out.println("-Fabricante: " + this.fabricante);
	}
}
