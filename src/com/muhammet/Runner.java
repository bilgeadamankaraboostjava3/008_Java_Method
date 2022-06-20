package com.muhammet;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		

	}

	
	/**
	 * Method Tanýmlama
	 * public -> Access Modifier(Eriþim Belirteci), yazmak zorunda deðilsiniz.
	 * static -> Zorunlu deðil
	 * final  -> Zorunlu Deðil
	 * Return Type-> Her method' un geri dönüþ tipi bulunur. 
	 * neler return type olabilir. int, double,char, String[]...
	 * Return Type zorunlu mudur? -> Zorunludur.
	 * ancak bir method geriye bir deðer çevirmek zorunda deðildir.
	 * bu durumda Return type -> void olur
	 * Method Name-> Deðiþken taným kurallarý geçerlidir. Method için
	 * bir isim belirtmek 
	 * Parantez -> Method dýþarýdan deðer alacak ise kullanýlýr. Zorunlu
	 * deðildir. Ancak, eðer method bir deðer istiyor ise o deðerleri 
	 * girmek zorunludur.
	 * parantez içine deðiþken eklerken deðiþken türlerinde bir sýnýrlama var mýdýr
	 * sýnýrlama yoktur. 
	 * {} Method Body-> method un sýnýrlarýdýr. kodlamalar bu sýnýrlar içinde yapýlýr.
	 * zorunlumudur? Zorunludur.
	 * return -> method un deri döndüðü deðerdir. Eðer mehod geridönüþ tipi
	 * void dýþýnda bir þey ise, belirlenen tipte deðer dönmek zorundasýnýz.
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
	 * Ýnternet Var mý?
	 * "Evet" - "Hayýr"
	 *  true  - false
	 * @return
	 */
	public static boolean  isConneciton() {
		return true;
	}
	
}
