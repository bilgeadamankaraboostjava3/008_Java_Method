package com.muhammet;

import java.util.Random;

public class Runner_Ornek_ReturnType_NoParameters {

	// De�i�ken
	// S�n�f i�inde tan�mlanan de�i�ken Global De�i�ken DE�ildir.
	public static int SinifUstInt = 234;
	//Method
	public static void BosMethod() {
		System.out.println("dddddd");
	}
	public static void main(String[] args) {
		
		/**
		 * Rast gele 5 in kat� olan say� �reten method
		 */
		BosMethod();
		SinifAltInt = 343;
			int rastgeleSayi;
		for(int i=0;i<10;i++) {
			rastgeleSayi= RandomNumber();
			System.out.println("�retilen say�....: "+ rastgeleSayi);
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
