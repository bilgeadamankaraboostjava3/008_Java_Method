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
		case 0:System.out.println("�IKI�"); break;		
		default: System.out.println("Ge�ersiz Se�im.");
			break;
		}
		
	}
	
	private static int SayiAl() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("say�y� gir...: ");
		int s1 = scanner.nextInt();
		return s1;
	}
	
	private static void Toplama() {
		System.out.println("Toplama");		
		int toplam = SayiAl() + SayiAl();
		System.out.println("Toplam...: "+ toplam);
	}
	private static void Cikartma() {
		System.out.println("��kartma");
		Scanner scanner = new Scanner(System.in);
		System.out.print("1. say�y� gir...: ");
		int s1 = scanner.nextInt();
		System.out.print("2. say�y� gir...: ");
		int s2 = scanner.nextInt();
		int fark = s1 - s2;
		System.out.println("Fark...: "+ fark);
	}
	private static void Carpma() {
		System.out.println("�arpma");
		Scanner scanner = new Scanner(System.in);
		System.out.print("1. say�y� gir...: ");
		int s1 = scanner.nextInt();
		System.out.print("2. say�y� gir...: ");
		int s2 = scanner.nextInt();
		int carpim = s1 * s2;
		System.out.println("�arpim...: "+ carpim);
	}
	private static void Bolme() {
		System.out.println("B�lme");
		Scanner scanner = new Scanner(System.in);
		System.out.print("1. say�y� gir...: ");
		int s1 = scanner.nextInt();
		System.out.print("2. say�y� gir...: ");
		int s2 = scanner.nextInt();
		int bolum = s1 / s2;
		System.out.println("B�l�m...: "+ bolum);
	}
	
	private static int Secim() {
		Scanner scanner = new Scanner(System.in);
		int secim;
		do {
		System.out.print("Se�iniz...: ");
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
		System.out.println("2- ��kartma");
		System.out.println("3- b�lme");
		System.out.println("4- �arpma");
		System.out.println("0- ��k��");
		System.out.println();
	}
	
}
