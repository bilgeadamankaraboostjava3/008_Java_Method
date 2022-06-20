package com.muhammet;

public class Runner_Ornek_MethodOverloading {
@SuppressWarnings("unused")
	public static void main(String[] args) {

		
		int toplamSonuc = Topla(23,34.0); // int,int
		double ondaliktoplM = Topla(12.34, 23.5);

	}
	
	/**
	 * Normal olarak ayn� method tekar yaz�lamaz
	 * Ancak, girdi olarak ald��� de�eri (Data Type) farkl� olan methodlar� tan�mlayabilrisiniz
	 * Method ad� ayn�, girilen de�erleri farkl� tan�mlanan method tan�mlar�na 
	 * Method Overloading denir.
	 * 
	 */
	/*
	public static int Topla(int s1,int s2) {
		int toplam = s1 + s2;
		return toplam;
	}*/
	public static int Topla(int s1,int s2) {
		String aa = "";
		int toplam = s1 + s2;
		return toplam;
	}
	public static int Topla(int s1,double s2) {
		int toplam = s1 + (int)s2;
		return toplam;
	}
	public static int Topla(double s1,int s2) {
		int toplam = (int)s1 + s2;
		return toplam;
	}
	public static double Topla(double s1,double s2) {
		double toplam = s1 + s2;
		return toplam;
	}
	public static double Topla(double s1,double s2,String kullanici) {
		double toplam = s1 + s2;
		return toplam;
	}
	
	/**
	 * Ger�ek bir senaryoda nerede i�e yarayacak.
	 * M��teri Kaydet
	 * Sat�� Kaydet
	 * A�a��daki �ekilde kurallar� olmayan method tan�mlamalar� yanl��t�r.
	 */
	
	public void MusteriKaydet() {}
	public void MusteriSave() {}
	public void NewAdd() {}
	public void AddProduct() {}
	public void SatisKaydet() {}

	/**
	 * Kaydet - Save
	 */
	public void Save(Object o) {}
	/*
	 * D�ru kullan�m bu �ekilde olmal�d�r
	public void Save(Musteri musteri) {}
	public void Save(Stok stok) {}
	public void Save(Satis satis) {}
	*/
	
	
	
}
