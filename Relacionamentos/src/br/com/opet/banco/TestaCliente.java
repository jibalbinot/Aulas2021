package br.com.opet.banco;

public class TestaCliente {

	public static void main(String[] args) {
		// criar os objetos
		Cliente c = new Cliente();
		c.setNome("Ricardo Almeida");
		
		//Endereco e = new Endereco();//não precisa criar o endereco pois já nasceu com o cliente
		c.getEnd().setLogradouro("Rua XV");
		c.getEnd().setNumero(135);
		c.getEnd().setCep("85.555-666");
		
		//não precisa mais ligar os objetos
		//c.setEnd(e);
		
		c.mostra();
		Cliente c2 = new Cliente();
		c2.setNome("Armenegildo Zegna");
		c2.mostra();
		
	}

}
