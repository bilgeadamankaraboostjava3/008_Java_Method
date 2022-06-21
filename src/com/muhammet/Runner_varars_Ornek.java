package com.muhammet;

public class Runner_varars_Ornek {

	public static void main(String[] args) {
	
		/**
		 * Bir method, bir string alacak, bu string ten istenilen uzunlukta de�er 
		 * kesilerek string olarak geri d�n�lecek.
		 * 
		 * xxxxxx("Bu g�n hava �ok ya�murlu",5,12); -> n hava �
		 * xxxxxx("Bu g�n hava �ok ya�murlu",5,12,324,23223); ->n�yu 
		 * 
		 */
		System.out.println(Islem("Bu g�n hava �ok ya�murlu",1,10));
		
		System.out.println(Islem2("Bu g�n hava �ok ya�murlu",4,9,16));//�vy
		
		System.out.println(Islem3("Bu g�n hava �ok ya�murlu",1,6,9,12));
	}
	
	
	public static String Islem2(String ifade,int... indexList) {// {4,9,16}
		String arananKarakter="";
		for(int i=0;i<indexList.length;i++) {
										// i=0; ->       4          ,    5   / �
										// i=1; ->       9          ,    10  / v
										// i=2; ->       16          ,   17  / y
										
			arananKarakter += ifade.substring(indexList[i], indexList[i]+1);  // �vy 
		}
		
		return arananKarakter;
	}
	public static String Islem3(String ifade,int... indexList) {
		String arananKarakter="";
		for(int index : indexList) { // {1,6,9,12}
			arananKarakter += ifade.substring(index, index+1);
		}		
		return arananKarakter;
	}
	
	
	
	
	/**
	 * 
	 * length= 24
	 * endIndex = 23
	 * Bu g�n hava �ok ya�murlu
	 */
	public static String Islem(String ifade,int start,int end) {
		if(start>end)
			return "Ba�lang�� de�eri biti�tn b�y�k olamaz"; // method g�vdesinde ilk �al��an return methodu sonland�r�r.
		if(start>ifade.length() || start<0 || end<0 )
			return "Ba�lang� ve biti� de�ereleri ifadenin s�n�rlar� d���nda olamaz [0,"+ifade.length()+"]";
		if(end>ifade.length())
			end = ifade.length()-1;
		String result =  ifade.substring(start, end+1); // 5,25
		return result;		
	}
	

}
