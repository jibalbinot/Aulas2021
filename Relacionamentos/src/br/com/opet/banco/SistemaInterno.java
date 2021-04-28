package br.com.opet.banco;

import java.util.Scanner;

public class SistemaInterno {
	public void login(Autenticavel a) {
		Scanner s = new Scanner(System.in);
		System.out.print("Informe sua senha: ");
		int senha = Integer.parseInt(s.nextLine());
		if(a.autentica(senha)) {
			System.out.println("Login efetuado. Seja bem-vindo(a)!");
		} else {
			System.out.println("Senha incorreta");
		}
	}
}
