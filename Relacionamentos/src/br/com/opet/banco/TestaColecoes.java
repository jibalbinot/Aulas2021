package br.com.opet.banco;

import java.util.ArrayList;

public class TestaColecoes {

	public static void main(String[] args) {
		int x;
		x = 10;

		Cliente c;
		c = new Cliente();
		c.setNome("Adao");

		// vetor em C
		// int v[5];

		// vetor em Java
		int[] v;
		v = new int[5];// vetor de inteiros

		v[2] = 9;
		// loop para inserção de dados
		for (int i = 0; i < v.length; i++) {
			v[i] = 3 + i;// insere dados
		}

		// loop para percorrer/mostrar os dados
		System.out.print("Saida for comum...: ");
		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i] + " ");
		}
		System.out.println();
		// loop para percorrer/mostrar com o enhanced-for
		System.out.print("Saida enhanced-for: ");
		// for( <variavel_tipo_do_vetor : vetor)
		for (int aux : v) {
			System.out.print(aux + " ");
		}

		System.out.println();

		Cliente[] vc = new Cliente[5]; // vetor de objetos
		vc[2] = c;
		vc[4] = new Cliente(); //criando e inserindo o objeto
		vc[4].setNome("Pedro");

		for (int i = 0; i < vc.length; i++) {
			if (vc[i] != null) {
				System.out.println(vc[i].getNome());
			}
		}

		ArrayList vd = new ArrayList();
		vd.add(3);
		vd.add(8);
		vd.add(c);
		vd.add("Maria");
		vd.add(3.15);
		vd.remove(c);
		System.out.println(vd);

	}

}
