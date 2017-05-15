package br.com.banco.programa;

import br.com.banco.model.Autenticavel;

public class SistemaInterno {
	
	public void autentica(Autenticavel f) {
		int senha = 123;
		if (f.autentica(senha) == true) {
			System.out.println("Autenticado");
		} else {
			System.out.println("Falha na autenticação");
		}
	}
}
