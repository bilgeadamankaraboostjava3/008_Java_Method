package com.muhammet;

public class Runner_Ornek_MethodOverloading {
@SuppressWarnings("unused")
	public static void main(String[] args) {

		
		int toplamSonuc = Topla(23,34.0); // int,int
		double ondaliktoplM = Topla(12.34, 23.5);

	}
	
	/**
	 * Normal olarak ayný method tekar yazýlamaz
	 * Ancak, girdi olarak aldýðý deðeri (Data Type) farklý olan methodlarý tanýmlayabilrisiniz
	 * Method adý ayný, girilen deðerleri farklý tanýmlanan method tanýmlarýna 
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
	 * Gerçek bir senaryoda nerede iþe yarayacak.
	 * Müþteri Kaydet
	 * Satýþ Kaydet
	 * Aþaðýdaki þekilde kurallarý olmayan method tanýmlamalarý yanlýþtýr.
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
	 * Dðru kullaným bu þekilde olmalýdýr
	public void Save(Musteri musteri) {}
	public void Save(Stok stok) {}
	public void Save(Satis satis) {}
	*/
	
	
	
}
