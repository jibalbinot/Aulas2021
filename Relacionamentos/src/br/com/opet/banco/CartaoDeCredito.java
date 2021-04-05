package br.com.opet.banco;

import br.com.opet.banco.uteis.*;//pode utilizar qualquer classe do diretório uteis
import br.com.opet.banco.uteis.Data;//apenas a Data será utilizada
import java.util.Scanner;//importando uma classe do Java

public class CartaoDeCredito {
	private int numero;
	private Data dataDeValidade;
	private Cliente cliente;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Data getDataDeValidade() {
		return dataDeValidade;
	}

	public void setDataDeValidade(Data dataDeValidade) {
		this.dataDeValidade = dataDeValidade;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
