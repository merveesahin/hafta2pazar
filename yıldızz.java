package com.dönguler;

import java.util.Scanner;

public class yýldýzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner klavyedenOku = new Scanner(System.in);
		System.out.println("satýr giriniz");
		int satir = klavyedenOku.nextInt();
		System.out.println("sutun giriniz");
		int sutun = klavyedenOku.nextInt();
		for (int i = 1; i <= satir; i++) {
			for (int j = 1; j <= sutun; j++) {
				System.out.print("*");

			}
			System.out.println("");
		}

	}

}
