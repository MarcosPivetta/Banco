package br.com.banco.programa;

import br.com.banco.model.Gerente;

public class TestaFuncionario {

	public static void main(String[] args) {
		Gerente pivetta = new Gerente();
		System.out.println(pivetta.getSalario());
		pivetta.setSalario(2000.0);
		System.out.println(pivetta.getSalario());
		pivetta.cobraEntrega();
		System.out.println(pivetta.getBonus());
	}
}
