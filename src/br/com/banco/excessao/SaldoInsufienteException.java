package br.com.banco.excessao;

public class SaldoInsufienteException extends RuntimeException {
	
	private final double saldoAtual;
	
	public SaldoInsufienteException(double saldoAtual) {
		super("Saldo insuficiente: " + saldoAtual);
		this.saldoAtual = saldoAtual;
	}
	
	public double getSaldoAtual() {
		return saldoAtual;
	}
}