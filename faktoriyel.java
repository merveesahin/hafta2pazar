package com.d�nguler;

import java.util.Scanner;

public class faktoriyel {

	public static void main(String[] args) {
		Scanner klavyedenOku = new Scanner(System.in);
		System.out.println("say� girin");
		int bolunenSayi = klavyedenOku.nextInt();
		for (int i = 1; i <= bolunenSayi; i++) {
			if (bolunenSayi % i == 0) {
				System.out.println(i);
			}

		}

	}
}
