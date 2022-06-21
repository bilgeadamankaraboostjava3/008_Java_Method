package com.muhammet;

public class Runner_ForEach {

	public static void main(String[] args) {
		
		int[] sayiDizisi = {1,23,1,3244,232,2,4};
		String[] sinifListesi = {"Ahmet", "Ayhan", "Ayþe", "Güneþ", "Bahar"};
		for(int sayi : sayiDizisi) {
			System.out.println(sayi);
		}
		for(String ogrenci: sinifListesi) {
			System.out.println(ogrenci);
		}
		//                         spor, yüzme, kiptap, sinema, v.s.
		boolean[] ilgiAlanlarim = {false, false, true, true};
		for(boolean secim : ilgiAlanlarim ) {
			System.out.println(secim);
		}
	}

}
