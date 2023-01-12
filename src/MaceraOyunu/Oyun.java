package MaceraOyunu;

import java.util.Scanner;

public class Oyun {
	Oyuncu oyuncu;
	Konum konum;
	Scanner scan = new Scanner(System.in);

	public void giris() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Macera Oyununa Hosgeldiniz !");
		System.out.println("Oyuna baslamadan önce isminizi giriniz : a");
		String oyuncuIsmi = scan.nextLine();
		oyuncu = new Oyuncu ("a");
		oyuncu.selectCha();
		basla();
	}

	public void basla() {
		while (true) {
			System.out.println();
			System.out.println("=================================================");
			System.out.println();
			System.out.println("Eylem gerçeklestirmek için bir yer seçiniz : ");
			System.out.println("1. Güvenli Ev --> Size ait güvenli bir mekan, düsman yok !");
			System.out.println("2. Maðara --> Karþýnýza zombi çýkabilir !");
			System.out.println("3. Orman --> Karþýnýza  vampir çýkabilir !");
			System.out.println("4. Nehir --> Karþýnýza  ayý çýkabilir !");
			System.out.println("5. Maðaza --> Silah veya Zýrh alabilirsiniz!");
			System.out.print("Gitmek istediðiniz yer : ");
			int secKonum = scan.nextInt();
			while (secKonum < 0 || secKonum > 5) {
				System.out.print("Lütfen geçerli bir yer seçiniz : ");
				secKonum = scan.nextInt();
			}

			switch (secKonum) {
			case 1:
				konum = new GuvenliEv(oyuncu);
				break;
			case 2:
				konum = new Magara(oyuncu);
				break;
			case 3:
				konum = new Orman(oyuncu);
				break;
			case 4:
				konum = new Nehir(oyuncu);
				break;
			case 5:
				konum = new Magaza(oyuncu);
				break;
			default:
				konum = new GuvenliEv(oyuncu);
			}

			if (konum.getIsim() == ("Güvenli Ev") ) {
				if (oyuncu.getEnv().isOdun() && oyuncu.getEnv().isYiyecek() && oyuncu.getEnv().isSu()) {
					System.out.println("Tebrikler Oyunu Kazandýnýz !");
					break;
					
				}
			}
			if (!konum.getKonum()) {
				System.out.println("Oyun Bitti !");
				break;
			}

		}
	}
}
