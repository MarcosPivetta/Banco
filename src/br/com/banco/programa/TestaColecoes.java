package br.com.banco.programa;

import java.util.ArrayList;
import java.util.Collections;

import br.com.banco.model.Conta;

public class TestaColecoes {

	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<String>();
		nomes.add("Marcos");
		nomes.add("Pivetta");
		
		for (int i = 0; i < nomes.size(); i++) {
			System.out.println(nomes.get(i));
		}
		
		for (String nome : nomes) {
			System.out.println(nome);
		}
		
		Collections.sort(nomes);
		System.out.println("Ordenado");
		for (String nome : nomes) {
			System.out.println(nome);
		}
		
		System.out.println(nomes.get(0));
		System.out.println(nomes.contains("Marcos"));
		
		ArrayList<Conta> contas = new ArrayList<Conta>();
		
		Conta c10 = new Conta("Pivetta", 101, 500.0);
		Conta c11 = new Conta("Marcos", 101, 400.0);
		
		contas.add(c10);
		contas.add(c11);
		
		Collections.sort(contas);
		
		for (Conta conta : contas) {
			System.out.println(conta);
		}
	}

}
