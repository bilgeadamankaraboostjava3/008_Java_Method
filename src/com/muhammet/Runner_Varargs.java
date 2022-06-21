package com.muhammet;

public class Runner_Varargs {

	public static void main(String[] args) {

		int[] sayilar = {12,3123,4,32,123,123123,212,3,23};
		
		//Topla(sayilar);
		//ToplamVarargs(1,12,233,222,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12);
		//ToplamVarargs(1);
		ToplamVarargs(1,1,1,2);
		//ToplamVarargs(11,1,1,1);
		//ToplamVarargs(1,121221);
		//ToplamVarargs();
		
	}
	
	public static void ToplamVarargs(int... sayilar) {
		int toplam =0;
		for(int i=0;i<sayilar.length;i++) {
			toplam += sayilar[i];
		}
		System.out.println("Toplam....: "+ toplam);
	}
	
	public static void Topla(int[] dizi) {
		int toplam =0;
		for(int i=0;i<dizi.length;i++) {			
			toplam +=dizi[i];			
		}
		System.out.println("Toplam...: "+ toplam);
	}
	
	/*
	public static void Topla(int s1,int s2) {
		System.out.println("Toplam....: "+ (s1+s2));
	}
	public static void Topla(int s1,int s2,int s3) {
		System.out.println("Toplam....: "+ (s1+s2+s3));
	}
	public static void Topla(int s1,int s2,int s3,int s4) {
		System.out.println("Toplam....: "+ (s1+s2+s3+s4));
	}
	*/
	//.
	//.
	//
	//.
	//public static void Topla(int s1,int s2,int s3........ int s50) {
	//	System.out.println("Toplam....: "+ (s1+s2+s3+......+s50));
	//}
	

}
