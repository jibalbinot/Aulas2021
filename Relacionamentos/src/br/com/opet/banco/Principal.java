package br.com.opet.banco;
public class Principal {

	public static void main(String[] args) {
		//criando os objetos
		Cliente c = new Cliente();
		c.setNome("Armenegildo Zegna");
		
		CartaoDeCredito cdc = new CartaoDeCredito();
				
		//ligando os objetos
		cdc.setCliente(c);
		
	    System.out.println(c.getNome());
	    System.out.println(cdc.getCliente().getNome());

	}

}
