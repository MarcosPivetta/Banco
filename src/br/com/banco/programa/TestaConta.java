package br.com.banco.programa;

import br.com.banco.model.Conta;

public class TestaConta {

	public static void main(String[] args) {
		Conta conta = new Conta("Marcos", 123, 450);

		conta.imprime();
		conta.deposita(50.0);
		
		conta.saca(200);
		
		System.out.println(conta.getSaldo());
	}

}