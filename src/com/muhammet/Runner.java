package com.muhammet;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		

	}

	
	/**
	 * Method Tan�mlama
	 * public -> Access Modifier(Eri�im Belirteci), yazmak zorunda de�ilsiniz.
	 * static -> Zorunlu de�il
	 * final  -> Zorunlu De�il
	 * Return Type-> Her method' un geri d�n�� tipi bulunur. 
	 * neler return type olabilir. int, double,char, String[]...
	 * Return Type zorunlu mudur? -> Zorunludur.
	 * ancak bir method geriye bir de�er �evirmek zorunda de�ildir.
	 * bu durumda Return type -> void olur
	 * Method Name-> De�i�ken tan�m kurallar� ge�erlidir. Method i�in
	 * bir isim belirtmek 
	 * Parantez -> Method d��ar�dan de�er alacak ise kullan�l�r. Zorunlu
	 * de�ildir. Ancak, e�er method bir de�er istiyor ise o de�erleri 
	 * girmek zorunludur.
	 * parantez i�ine de�i�ken eklerken de�i�ken t�rlerinde bir s�n�rlama var m�d�r
	 * s�n�rlama yoktur. 
	 * {} Method Body-> method un s�n�rlar�d�r. kodlamalar bu s�n�rlar i�inde yap�l�r.
	 * zorunlumudur? Zorunludur.
	 * return -> method un deri d�nd��� de�erdir. E�er mehod gerid�n�� tipi
	 * void d���nda bir �ey ise, belirlenen tipte de�er d�nmek zorundas�n�z.
	 */
	final double PI = 3.14;
	public static final Object ToplamaIslemi(int sayiA, int sayiB, char karakter
			 ,byte byt, String ifade, Runner runn) {
		Object o;
		o  = 1254;
		o = "yazi";
		o = new Runner();
		o = new Scanner(System.in);
		o = 'A';
		return "Dolu Method";	
	}
	
	/**
	 * �nternet Var m�?
	 * "Evet" - "Hay�r"
	 *  true  - false
	 * @return
	 */
	public static boolean  isConneciton() {
		return true;
	}
	
}
