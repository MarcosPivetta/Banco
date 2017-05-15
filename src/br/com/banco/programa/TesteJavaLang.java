package br.com.banco.programa;

import br.com.banco.model.Conta;

public class TesteJavaLang {

	public static void main(String[] args) {
		Conta c1 = new Conta("Pivetta", 101, 500.0);
		Conta c2 = new Conta("Juliano", 101, 1000.0);
		
		GuardadorDeObjetos armario = new GuardadorDeObjetos();
		armario.adiciona(c1);
		armario.adiciona(c2);
		
		Conta c1NoArmario = (Conta) armario.pega(0);
		
		System.out.println(c1NoArmario.getSaldo());

	}

}
