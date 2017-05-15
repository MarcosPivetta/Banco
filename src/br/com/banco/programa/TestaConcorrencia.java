package br.com.banco.programa;

import br.com.banco.model.BarraDeProgresso;
import br.com.banco.model.Conta;
import br.com.banco.model.CopiadorDeArquivos;

public class TestaConcorrencia {

	public static void main(String[] args) {
		
		
		BarraDeProgresso barra = new BarraDeProgresso();
		Thread t1 = new Thread(barra);
		//t1.start();
		
		CopiadorDeArquivos copiador = new CopiadorDeArquivos();
		Thread t2 = new Thread(copiador);
		//t2.start();
		
		Conta c1 = new Conta(null, 0, 500.0);
		FazDeposito acao = new FazDeposito(c1);
		
		Thread t3 = new Thread(acao);
		Thread t4 = new Thread(acao);
		
		t3.start();
		t4.start();
		
		System.out.println(c1.getSaldo());
		
	}

}
