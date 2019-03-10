package com.dönguler;

import java.util.Random;
import java.util.Scanner;

public class random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("bir sayi tahmin ediniz");
		Scanner tahmin = new Scanner (System.in);
		int TahminSayi = -1;
		Random sayi = new Random ();
		int randomSayi = sayi.nextInt(10);
		while (randomSayi != TahminSayi) {
			System.out.println("bir sayi tahmin ediniz");
			TahminSayi = tahmin.nextInt();
			if(randomSayi == TahminSayi) {
				System.out.println("dogru tahmin ettiniz");
				break;
				
						
				
			} else { 
				System.out.println("yanlýþ tahmin tekrar deneyin");
			}
			
			
		}

}

}
