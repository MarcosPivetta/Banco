package br.com.banco.model;

import br.com.banco.excessao.SaldoInsufienteException;

public class Conta implements Comparable<Conta> {
	private double saldo;
	private String titular;
	private int agencia;
	private int numero;

	public Conta(String nome, int agencia, double saldo) {
		super();
		this.titular = nome;
		this.agencia = agencia;
		this.saldo = saldo;
	}
	
	public Conta() {
	}

	public void imprime() {
		System.out.println(this.titular);
		System.out.println(this.agencia);
		System.out.println(this.saldo);

	}

	/**
	 * Realiza um saque na conta dado o valor passado
	 * @param valor a ser sacado
	 */
	public void saca(double valor) {
		
		if (saldo >= valor) {
			
			this.saldo -= valor;
		} else {
			throw new SaldoInsufienteException(saldo);
		}
	}

	public synchronized void deposita(double valor) {
		this.saldo += valor;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public int compareTo(Conta outra) {
		if (this.saldo < outra.saldo) return -1;
		if (this.saldo > outra.saldo) return 1;
		return 0;
	}

}
