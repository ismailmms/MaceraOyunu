package MaceraOyunu;

public class Magaza extends NormalKonum {

	Magaza(Oyuncu oyuncu) {
		super(oyuncu, "Magaza");
	}

	public boolean getKonum() {
		System.out.println("Para : " + oyuncu.getPara());
		System.out.println("1. Silahlar");
		System.out.println("2. Z�rhlar");
		System.out.println("3. Cikis");
		System.out.print("Se�iminiz : ");
		int secMagaza = scan.nextInt();
		int secOgeID;
		switch (secMagaza) {
		case 1:
			secOgeID = silahMenu();
			buySilah(secOgeID);
			break;
		case 2:
			secOgeID = z�rhMenu();
			buyZ�rh(secOgeID);
			break;
		default:
			break;
		}

		return true;
	}
	
	public int z�rhMenu() {
		System.out.println("1. Hafif \t <Para : 15 - Hasar : 1>");
		System.out.println("2. Orta \t <Para : 25 - Hasar : 3>");
		System.out.println("3. Agir \t <Para : 40 - Hasar : 5>");
		System.out.println("4. Cikis");
		System.out.print("Silah Se�iniz : ");
		int secZ�rhID = scan.nextInt();
		return secZ�rhID;
	}
	
	public void buyZ�rh(int OgeID) {
		int onleme = 0, fiyat = 0;
		String zIsim = null;
		switch (OgeID) {
		case 1:
			onleme = 1;
			zIsim = "Hafif Z�rh";
			fiyat = 15;
			break;
		case 2:
			onleme = 3;
			zIsim = "Orta Z�rh";
			fiyat = 15;
			break;
		case 3:
			onleme = 5;
			zIsim = "A��r Z�rh";
			fiyat = 40;
			break;
		case 4:
			System.out.println("Cikis Yapiliyor.");
			break;
		default:
			System.out.println("Ge�ersiz Islem !");
			break;
		}

		if (fiyat > 0) {
			if (oyuncu.getPara() >= fiyat) {
				oyuncu.getEnv().setZ�rh(onleme);
				oyuncu.getEnv().setzIsim(zIsim);
				oyuncu.setPara(oyuncu.getPara() - fiyat);
				System.out.println(zIsim + " sat�n ald�g�n�z, Engellenen Hasar : " + oyuncu.getEnv().getZ�rh());
				System.out.println("Kalan Para :" + oyuncu.getPara());
			} else {
				System.out.println("Para yetersiz. !");
			}
		}
	}

	public int silahMenu() {
		System.out.println("1. Tabanca\t<Para : 25 - Hasar : 2>");
		System.out.println("2. K�l�c\t<Para : 35 - Hasar : 3>");
		System.out.println("3. T�fek\t<Para : 45 - Hasar : 7>");
		System.out.println("4. Cikis");
		System.out.print("Silah Se�iniz : ");
		int secSilahID = scan.nextInt();
		return secSilahID;
	}

	public void buySilah(int OgeID) {
		int hasar = 0, fiyat = 0;
		String sIsim = null;
		switch (OgeID) {
		case 1:
			hasar = 2;
			sIsim = "Tabanca";
			fiyat = 25;
			break;
		case 2:
			hasar = 3;
			sIsim = "K�l�c";
			fiyat = 35;
			break;
		case 3:
			hasar = 7;
			sIsim = "T�fek";
			fiyat = 45;
			break;
		case 4:
			System.out.println("Cikis Yapiliyor.");
			break;
		default:
			System.out.println("Ge�ersiz Islem !");
			break;
		}

		if (fiyat > 0) {
			if (oyuncu.getPara() > fiyat) {
				oyuncu.getEnv().setHasar(hasar);
				oyuncu.getEnv().setsIsim(sIsim);
				oyuncu.setPara(oyuncu.getPara() - fiyat);
				System.out.println(sIsim + " sat�n ald�n�z, �nceki Hasar :" + oyuncu.getHasar() + ", Yeni Hasar : "
						+ oyuncu.getToplamHasar());
				System.out.println("Kalan Para :" + oyuncu.getPara());
			} else {
				System.out.println("Para yetersiz. !");
			}
		}
	}

}
