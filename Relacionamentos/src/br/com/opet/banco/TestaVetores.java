package br.com.opet.banco;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class TestaVetores {

	public static void main(String[] args) {
		/*
		 * Crie uma classe TestaVetores e no método main: 1) crie um array de
		 * ContaCorrente de tamanho 10; 2) Faça um laço para criar e inserir 10 objetos
		 * 3) Percorra o array setando o saldo de 1 a 10 para cada objeto 4) Percorra o
		 * array mostrando o saldo de cada conta
		 */

		// vetor estático de 10 elementos ContaCorrente
		ContaCorrente[] v = new ContaCorrente[10];
		for (int i = 0; i < v.length; i++) {
			v[i] = new ContaCorrente();// criação e inserção
		}
		for (int i = 0; i < v.length; i++) {
			v[i].setSaldo(i + 1);// acesso
		}
		for (int i = 0; i < v.length; i++) {
			System.out.println(v[i].getSaldo());// mostra na tela
		}
		// repita o ultimo loop usando o enhanced-for
		for (ContaCorrente aux : v) {
			System.out.println(aux.getSaldo());
		}

		// estrutura dinâmica
		List ed = new ArrayList();
		ed.add("Jeysonn");
		ed.add("Maria");
		ed.add(45);
		ed.add(4.8);
		ed.add(new ContaCorrente());
		ed.add("Evandro");
		ed.remove(3);
		ed.remove("Jeysonn");
		System.out.println("Tamanho: " + ed.size());
		System.out.println(ed);
		System.out.println(ed.contains("Jeysonn"));
		
		//Generics <Tipo> restringe a lista a um tipo específico
		List<String> ed2 = new ArrayList<String>();
		ed2.add("Jeysonn");
		ed2.add("Evandro");
		//ed2.add(5);//não permite a inserção de elementos diferente
		ed2.add("Pedro");
		ed2.add("Adao");
		System.out.println(ed2);
		Collections.sort(ed2);
		System.out.println(ed2);
		
		// vetor dinâmico de ContaCorrente
		List<ContaCorrente> lista = new ArrayList<ContaCorrente>();
		//loop para adicionar 10 objetos na lista
		for (int i = 0; i < 10; i++) {
			lista.add(new ContaCorrente());// criação e inserção
		}
		for (int i = 0; i < lista.size(); i++) {
			lista.get(i).setSaldo(new Random().nextInt(100));// acesso
		}
		System.out.print("Antes: ");
		for ( ContaCorrente aux : lista) {
			System.out.print(aux.getSaldo()+" ");
		}
		
		System.out.println();
		//Desafio: por que não consigo ordenar a lista de ContaCorrente?
		//pois faltava dizer qual o critério e fazemos isso
		//implementando a interface Comparable que obriga a implementar
		//o método compareTo
		Collections.sort(lista);
		
		System.out.print("Depois: ");
		for ( ContaCorrente aux : lista) {
			System.out.print(aux.getSaldo()+" ");
		}
	}

}
