package com.muhammet;

public final class Runner_Scope_ornek {
	final String ifade= "sdsada";
	public void method1() {
		sayi = 12;
		//ifade= "dasddad"; not run
	}
	public  static void method2() {
		//sayi = 223;
	}
	public final void method3() {// final-> kullanýldýðý cismi deðiþmez yapar :))
		sayi=343;
	}
	public static void main(String[] args) {
		
	// main, 1, all, all,1, 1-3++	
		int sayi2 = 3;
		System.out.println("sayi2...: "+ sayi2);
		//sayi = 34;
		//System.out.println("sayi3...: "+ sayi3); not run
		//int sayi3=4;
	}
		
		
	

	int sayi=2;
}
