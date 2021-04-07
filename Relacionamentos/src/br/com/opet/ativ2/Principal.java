package br.com.opet.ativ2;

public class Principal {

	public static void main(String[] args) {

		// criação dos objetos
		Carro c1 = new Carro();
		Carro c2 = new Carro();
		Carro c3 = new Carro();

		// atribuição de valores
		c1.getP().setPreco(350);
		c1.getP().setFabricante("Pirelli");
		c1.getP().setTipo("Radial");
		c1.getB().setPreco(2000);
		c1.getB().setModelo("Padrão");
		c1.getB().setFabricante("Racing");

		c2.getP().setPreco(550);
		c2.getP().setFabricante("Michelin");
		c2.getP().setTipo("Misto");
		c2.getB().setPreco(3500);
		c2.getB().setModelo("Esportivo");
		c2.getB().setFabricante("Recaro");

		c3.getP().setPreco(250);
		c3.getP().setFabricante("Dunlop");
		c3.getP().setTipo("Off Road");
		c3.getB().setPreco(3700);
		c3.getB().setModelo("Básico");
		c3.getB().setFabricante("Ford");

		// mostrar na tela os valores
		c1.mostra();
		c2.mostra();
		c3.mostra();
	}

}
