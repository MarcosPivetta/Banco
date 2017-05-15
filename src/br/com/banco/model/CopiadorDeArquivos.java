package br.com.banco.model;

public class CopiadorDeArquivos implements Runnable {
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("Copiador");
		}
	}
}
