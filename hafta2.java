package xxxx;

import java.util.Random;
import java.util.Scanner;

public class hafta2 {

	public static void main(String[] args) {
		Scanner gunKodu = new Scanner(System.in);
		System.out.println("gun kodu girin");
		String girilenGunKodu = gunKodu.next();

		switch (girilenGunKodu) {
		case "PTS":
			System.out.println("PAZARTESÝ");
			break;
		case "SL":
			System.out.println("SALI");
			break;
		case "ÇRS":
			System.out.println("ÇARÞAMBA");
			break;
		case "PRS":
			System.out.println("PERÞEMBE");
			break;
		case "CM":
			System.out.println("CUMA");
			break;
		case "CMT":
			System.out.println("CUMARTESÝ");
			break;
		case "PZ":
			System.out.println("PAZAR");

		default:
			System.out.println("YANLIÞ TEKRAR SAYI GÝRÝNÝZ");

			break;
		}

	}

}
