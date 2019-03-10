package com.dönguler;

import java.util.Scanner;

public class fordongu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner klavyedenOku = new Scanner (System.in);
		System.out.println("Sayý Girin");
	    int sayi = klavyedenOku.nextInt();
	    for (int i=2; i<=sayi ;i++) {
	    	if(sayi % i==0 ) {
	    		System.out.println(i);
	    		sayi = sayi / i;
	    		i = i - 1;
	    		
	    	}
	    }

	}

}
