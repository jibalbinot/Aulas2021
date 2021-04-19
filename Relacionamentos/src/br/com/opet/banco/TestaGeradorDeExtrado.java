package br.com.opet.banco;

public class TestaGeradorDeExtrado {

	public static void main(String[] args) {
		
		 GeradorDeExtrato gerador = new GeradorDeExtrato();
		 
		 /*
		  * Classe abstrata não permite a instanciação (criação
		  * de objetos), ela servirá apenas de modelo para outras
		  * classes
		  */
		 //Conta c = new Conta();
		 
		 ContaPoupanca cp = new ContaPoupanca();
		 cp.setSaldo(1000);
		 
		 ContaCorrente cc = new ContaCorrente();
		 cc.setSaldo(1000);
		 
		 gerador.imprimeExtratoBasico(cp);
		 gerador.imprimeExtratoBasico(cc);
		 
	}

}
