package com.d�nguler;

import java.util.Scanner;

public class y�ld�zz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner klavyedenOku = new Scanner(System.in);
		System.out.println("sat�r giriniz");
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
