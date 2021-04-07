package br.com.opet.ativ2;

public class Carro {
	private Pneus p = new Pneus();
	private Motor m = new Motor(1.5, 10000.00, "Honda");
	private Bancos b = new Bancos();
	private int codigo;
	private static int contador = 0;

	Carro() {
		this.codigo = ++Carro.contador;
	}

	public Pneus getP() {
		return p;
	}

	public void setP(Pneus p) {
		this.p = p;
	}

	public Motor getM() {
		return m;
	}

	public void setM(Motor m) {
		this.m = m;
	}

	public Bancos getB() {
		return b;
	}

	public void setB(Bancos b) {
		this.b = b;
	}

	public int getCodigo() {
		return codigo;
	}

	public void mostra() {
		System.out.println("Carro");
		System.out.println("-Codigo....: " + this.codigo);
		this.p.mostra();
		this.m.mostra();
		this.b.mostra();
		System.out.println("----------------------");
	}
}
