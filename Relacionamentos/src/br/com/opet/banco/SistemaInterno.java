package br.com.opet.banco;

import java.util.Scanner;

public class SistemaInterno {
	public void login(FuncionarioAutenticavel fa) {
		Scanner s = new Scanner(System.in);
		System.out.print(fa.getNome()+" informe sua senha: ");
		int senha = Integer.parseInt(s.nextLine());
		if(fa.autentica(senha)) {
			System.out.println("Login efetuado. "+fa.getNome()+" seja bem-vindo(a)!");
		} else {
			System.out.println("Senha incorreta");
		}
	}
}
