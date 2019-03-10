package xxxx;

import java.util.Scanner;

public class haftaici {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner gunKodu = new Scanner (System.in);
		System.out.println("Gun kodu giriniz");
        String girilenGunKodu = gunKodu.next();
        switch (girilenGunKodu) {
		case "PTS":
		case "SL":
		case "CRS":
		case "PRS":
		case "CM":
			System.out.println("HAFTAÝÇÝ");
			
		
			
			break;
		case "CMT":
		case "PZR":
			System.out.println("HAFTASONU");
			

		default:
			System.out.println("YANLIÞ GÝRÝÞ");
			break;
		}

	}

}
