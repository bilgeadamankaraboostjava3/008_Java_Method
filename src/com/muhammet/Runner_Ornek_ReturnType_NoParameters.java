package com.muhammet;

import java.util.Random;

public class Runner_Ornek_ReturnType_NoParameters {

	// Deðiþken
	// Sýnýf içinde tanýmlanan deðiþken Global Deðiþken DEðildir.
	public static int SinifUstInt = 234;
	//Method
	public static void BosMethod() {
		System.out.println("dddddd");
	}
	public static void main(String[] args) {
		
		/**
		 * Rast gele 5 in katý olan sayý üreten method
		 */
		BosMethod();
		SinifAltInt = 343;
			int rastgeleSayi;
		for(int i=0;i<10;i++) {
			rastgeleSayi= RandomNumber();
			System.out.println("Üretilen sayý....: "+ rastgeleSayi);
		}
	
	}

	
	/**
	 * 0-100
	 * @return
	 */
	public static int RandomNumber() {
		Random random = new Random();
		int result = random.nextInt(20) * 5;
		return result;
	}
	public static int SinifAltInt = 234;
}//Class Sonu
