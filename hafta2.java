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
			System.out.println("PAZARTES�");
			break;
		case "SL":
			System.out.println("SALI");
			break;
		case "�RS":
			System.out.println("�AR�AMBA");
			break;
		case "PRS":
			System.out.println("PER�EMBE");
			break;
		case "CM":
			System.out.println("CUMA");
			break;
		case "CMT":
			System.out.println("CUMARTES�");
			break;
		case "PZ":
			System.out.println("PAZAR");

		default:
			System.out.println("YANLI� TEKRAR SAYI G�R�N�Z");

			break;
		}

	}

}
