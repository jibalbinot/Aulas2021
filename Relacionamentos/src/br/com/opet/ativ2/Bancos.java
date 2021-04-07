package br.com.opet.ativ2;

public class Bancos {
	private double preco;
	private String modelo;
	private String fabricante;

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public void mostra() {
		System.out.println("Bancos");
		System.out.println("-Preco.....: " + this.preco);
		System.out.println("-Modelo....: " + this.modelo);
		System.out.println("-Fabricante: " + this.fabricante);
	}
}
