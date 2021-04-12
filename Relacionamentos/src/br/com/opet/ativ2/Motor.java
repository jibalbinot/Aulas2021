package br.com.opet.ativ2;
/**
 * Classe responsável por moldar o Motor
 *
 * @author Armenegildo Zegna
 */
public class Motor {
	private double potencia;
	private double preco;
	private String fabricante;

	public Motor(double potencia, double preco, String fabricante) {
		this.potencia = potencia;
		this.preco = preco;
		this.fabricante = fabricante;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public void mostra() {
		System.out.println("Motor");
		System.out.println("-Potencia..: " + this.potencia);
		System.out.println("-Preco.....: " + this.preco);
		System.out.println("-Fabricante: " + this.fabricante);

	}

}
