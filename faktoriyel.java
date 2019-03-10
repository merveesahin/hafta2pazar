package com.dönguler;

import java.util.Scanner;

public class faktoriyel {

	public static void main(String[] args) {
		Scanner klavyedenOku = new Scanner(System.in);
		System.out.println("sayý girin");
		int bolunenSayi = klavyedenOku.nextInt();
		for (int i = 1; i <= bolunenSayi; i++) {
			if (bolunenSayi % i == 0) {
				System.out.println(i);
			}

		}

	}
}
