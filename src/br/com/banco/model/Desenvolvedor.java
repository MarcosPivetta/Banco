package br.com.banco.model;

public class Desenvolvedor extends Funcionario implements Autenticavel{
	public double getBonus() {
		return this.salario * 0.25;
	}

	@Override
	public boolean autentica(int senha) {
		return false;
	}
}
