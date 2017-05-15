package br.com.banco.programa;

public class TestaExcessão {

	public static void main(String[] args) {
		System.out.println("inicio main");
		m1();
		System.out.println("fim main");
	}

	private static void m1() {
		System.out.println("inicio metodo m1");
		m2();
		System.out.println("fim metodo m1");		
	}

	private static void m2() {
		System.out.println("inicio metodo m2");
		int[] nums =  new int[5];
		
		for (int i = 0; i < 6; i++) {
			try {
				nums[i] = i * 2;
				System.out.println(nums[i]);
				
			} catch (Exception e) {
				System.out.println("Problema!");
			}
		}
		
		System.out.println("fim metodo m2");		
	}

}
