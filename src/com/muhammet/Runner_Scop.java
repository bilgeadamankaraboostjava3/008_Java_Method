package com.muhammet;

import java.util.Scanner;

public class Runner_Scop {

	// De�i�kenler
	// Scope -> bir de�i�ken �zel bir ek belirteci yok ise, benzer t�m methodlar i�in
	// {} s�n�rlar� i�inde �al���r.
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
		// local de�i�ken
		int icInteger= 10;
	    sabitAdresliSayi = 5554;
		sayi = icInteger;
		System.out.println("Selamlar");
	}
	
	public void Toplama() {
		int toplamaInteger=4;
		sayi = toplamaInteger;
		//int i = 45; // bir de�i�ken bir scope i�inde 1 kez tan�mlan�r.
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
