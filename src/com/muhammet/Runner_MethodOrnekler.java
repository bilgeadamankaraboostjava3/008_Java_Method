package com.muhammet;

import java.util.Scanner;

public class Runner_MethodOrnekler {

	public static void main(String[] args) {

		EkranaYaz();		
		switch (Secim()) {
		case 1:Toplama(); break;
		case 2:Cikartma(); break;
		case 3:Bolme(); break;
		case 4:Carpma(); break;
		case 0:System.out.println("ÇIKIÞ"); break;		
		default: System.out.println("Geçersiz Seçim.");
			break;
		}
		
	}
	
	private static int SayiAl() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("sayýyý gir...: ");
		int s1 = scanner.nextInt();
		return s1;
	}
	
	private static void Toplama() {
		System.out.println("Toplama");		
		int toplam = SayiAl() + SayiAl();
		System.out.println("Toplam...: "+ toplam);
	}
	private static void Cikartma() {
		System.out.println("Çýkartma");
		Scanner scanner = new Scanner(System.in);
		System.out.print("1. sayýyý gir...: ");
		int s1 = scanner.nextInt();
		System.out.print("2. sayýyý gir...: ");
		int s2 = scanner.nextInt();
		int fark = s1 - s2;
		System.out.println("Fark...: "+ fark);
	}
	private static void Carpma() {
		System.out.println("Çarpma");
		Scanner scanner = new Scanner(System.in);
		System.out.print("1. sayýyý gir...: ");
		int s1 = scanner.nextInt();
		System.out.print("2. sayýyý gir...: ");
		int s2 = scanner.nextInt();
		int carpim = s1 * s2;
		System.out.println("Çarpim...: "+ carpim);
	}
	private static void Bolme() {
		System.out.println("Bölme");
		Scanner scanner = new Scanner(System.in);
		System.out.print("1. sayýyý gir...: ");
		int s1 = scanner.nextInt();
		System.out.print("2. sayýyý gir...: ");
		int s2 = scanner.nextInt();
		int bolum = s1 / s2;
		System.out.println("Bölüm...: "+ bolum);
	}
	
	private static int Secim() {
		Scanner scanner = new Scanner(System.in);
		int secim;
		do {
		System.out.print("Seçiniz...: ");
		secim = scanner.nextInt();
		}while(secim<0 || secim>4);
		return secim;
	} 
	
	private static void EkranaYaz() {
		System.out.println("************************");
		System.out.println("****   hesap     *******");
		System.out.println("************************");
		System.out.println();
		System.out.println("1- Toplama");
		System.out.println("2- Çýkartma");
		System.out.println("3- bölme");
		System.out.println("4- çarpma");
		System.out.println("0- çýkýþ");
		System.out.println();
	}
	
}
