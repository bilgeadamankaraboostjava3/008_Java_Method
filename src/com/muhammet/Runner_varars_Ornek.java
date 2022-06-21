package com.muhammet;

public class Runner_varars_Ornek {

	public static void main(String[] args) {
	
		/**
		 * Bir method, bir string alacak, bu string ten istenilen uzunlukta deðer 
		 * kesilerek string olarak geri dönülecek.
		 * 
		 * xxxxxx("Bu gün hava çok yaðmurlu",5,12); -> n hava ç
		 * xxxxxx("Bu gün hava çok yaðmurlu",5,12,324,23223); ->nçyu 
		 * 
		 */
		System.out.println(Islem("Bu gün hava çok yaðmurlu",1,10));
		
		System.out.println(Islem2("Bu gün hava çok yaðmurlu",4,9,16));//üvy
		
		System.out.println(Islem3("Bu gün hava çok yaðmurlu",1,6,9,12));
	}
	
	
	public static String Islem2(String ifade,int... indexList) {// {4,9,16}
		String arananKarakter="";
		for(int i=0;i<indexList.length;i++) {
										// i=0; ->       4          ,    5   / ü
										// i=1; ->       9          ,    10  / v
										// i=2; ->       16          ,   17  / y
										
			arananKarakter += ifade.substring(indexList[i], indexList[i]+1);  // üvy 
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
	 * Bu gün hava çok yaðmurlu
	 */
	public static String Islem(String ifade,int start,int end) {
		if(start>end)
			return "Baþlangýç deðeri bitiþtn büyük olamaz"; // method gövdesinde ilk çalýþan return methodu sonlandýrýr.
		if(start>ifade.length() || start<0 || end<0 )
			return "Baþlangý ve bitiþ deðereleri ifadenin sýnýrlarý dýþýnda olamaz [0,"+ifade.length()+"]";
		if(end>ifade.length())
			end = ifade.length()-1;
		String result =  ifade.substring(start, end+1); // 5,25
		return result;		
	}
	

}
