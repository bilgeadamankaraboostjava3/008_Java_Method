package com.muhammet;

import java.util.Scanner;

public class Runner_Scop {

	// Deðiþkenler
	// Scope -> bir deðiþken özel bir ek belirteci yok ise, benzer tüm methodlar için
	// {} sýnýrlarý içinde çalýþýr.
	int sayi;
	String ifade;
	public int geneleAcikSayi;
	static int sabitAdresliSayi;
	static String sabitAdresliIfade;
	
	// Method
	public static void sabitAdresiMethod() {
		sabitAdresliSayi = 434;
		
		System.out.println("Sabit Adres");
	}
	
	public void ekranaYaz() {
		// local deðiþken
		int icInteger= 10;
	    sabitAdresliSayi = 5554;
		sayi = icInteger;
		System.out.println("Selamlar");
	}
	
	public void Toplama() {
		int toplamaInteger=4;
		sayi = toplamaInteger;
		//int i = 45; // bir deðiþken bir scope içinde 1 kez tanýmlanýr.
		for(int i=0;i<10;i++) {
			System.out.println(i);
		}
		if(toplamaInteger>5) {
			int sayi1=0,sayi2=0;
			int toplam = sayi1+sayi2;
		}
		for(int i=4;i<12;i++)
			System.out.println(i);
		//System.out.println(i); not run
		
		// System.out.println(toplam); not run
		//System.out.println(i); not run
	}
	
	public static void main(String[] args) {
		// Java Members & Scope
		sabitAdresiMethod();
		
		
	} // Main Sonu

}// Class Sonu
