package MaceraOyunu;

import java.util.Scanner;

public class Oyun {
	Oyuncu oyuncu;
	Konum konum;
	Scanner scan = new Scanner(System.in);

	public void giris() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Macera Oyununa Hosgeldiniz !");
		System.out.println("Oyuna baslamadan �nce isminizi giriniz : a");
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
			System.out.println("Eylem ger�eklestirmek i�in bir yer se�iniz : ");
			System.out.println("1. G�venli Ev --> Size ait g�venli bir mekan, d�sman yok !");
			System.out.println("2. Ma�ara --> Kar��n�za zombi ��kabilir !");
			System.out.println("3. Orman --> Kar��n�za  vampir ��kabilir !");
			System.out.println("4. Nehir --> Kar��n�za  ay� ��kabilir !");
			System.out.println("5. Ma�aza --> Silah veya Z�rh alabilirsiniz!");
			System.out.print("Gitmek istedi�iniz yer : ");
			int secKonum = scan.nextInt();
			while (secKonum < 0 || secKonum > 5) {
				System.out.print("L�tfen ge�erli bir yer se�iniz : ");
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

			if (konum.getIsim() == ("G�venli Ev") ) {
				if (oyuncu.getEnv().isOdun() && oyuncu.getEnv().isYiyecek() && oyuncu.getEnv().isSu()) {
					System.out.println("Tebrikler Oyunu Kazand�n�z !");
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
