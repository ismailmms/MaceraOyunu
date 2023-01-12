package MaceraOyunu;

public abstract class SavasKonum extends Konum {
	protected Canavar canavar;
	protected String odul;

	SavasKonum(Oyuncu oyuncu, String isim, Canavar canavar, String odul) {
		super(oyuncu);
		this.canavar = canavar;
		this.isim = isim;
		this.odul = odul;
	}

	public boolean getKonum() {
		int cnvrSayisi = canavar.canavarSayisi();
		System.out.println("suan buradasiniz : " + this.getIsim());
		System.out.println("Dikkatli ol! Burada " + cnvrSayisi + " tane " + canavar.getIsim() + " yasiyor !");
		System.out.print("<S>avas veya <K>aç :");
		String secDurum = scan.nextLine();
		secDurum = secDurum.toUpperCase();
		if (secDurum.equals("S")) {
			if (savas(cnvrSayisi)) {
				System.out.println(this.getIsim() + " bölgesindeki tüm düsmanlari temizlediniz !");
				if (this.odul.equals("Yiyecek") && oyuncu.getEnv().isYiyecek() == false) {
					System.out.println(this.odul + " Kazandiniz! ");
					oyuncu.getEnv().setYiyecek(true);
				} else if (this.odul.equals("Su") && oyuncu.getEnv().isSu() == false) {
					System.out.println(this.odul + " Kazandiniz! ");
					oyuncu.getEnv().setSu(true);
				} else if (this.odul.equals("Odun") && oyuncu.getEnv().isOdun() == false) {
					System.out.println(this.odul + " Kazandiniz! ");
					oyuncu.getEnv().setOdun(true);
				}
				return true;
			}
			
			if(oyuncu.getSaglik() <= 0) {
				System.out.println("Öldünüz !");
				return false;
			}
		
		}
		return true;
	}

	public boolean savas(int cnvrSayisi) {
		for (int i = 0; i < cnvrSayisi; i++) {
			int noCanavarSaglik = canavar.getSaglik();
			oyuncuDurum();
			dusmanDurum();
			while (oyuncu.getSaglik() > 0 && canavar.getSaglik() > 0) {
				System.out.print("<V>ur veya <K>aç :");
				String secDurum = scan.nextLine();
				secDurum = secDurum.toUpperCase();
				if (secDurum.equals("V")) {
					System.out.println("Siz vurdunuz !");
					canavar.setSaglik(canavar.getSaglik() - oyuncu.getToplamHasar());
					vurusSonrasi();
					if (canavar.getSaglik() > 0) {
						System.out.println();
						System.out.println("Canavar size vurdu !");
						oyuncu.setSaglik(oyuncu.getSaglik() - (canavar.getHasar() - oyuncu.getEnv().getZýrh()));
						vurusSonrasi();
					}
				} else {
					return false;
				}
			}

			if (canavar.getSaglik() < oyuncu.getSaglik()) {
				System.out.println("Dusmani yendiniz !");
				oyuncu.setPara(oyuncu.getPara() + canavar.getOdul());
				System.out.println("Güncel Paraniz : " + oyuncu.getPara());
				canavar.setSaglik(noCanavarSaglik);
			} else {
				return false;
			}
			System.out.println("-------------------");
		}
		return true;
	}

	public void oyuncuDurum() {
		System.out.println("Oyuncu Degerleri\n--------------");
		System.out.println("Can:" + oyuncu.getSaglik());
		System.out.println("Hasar:" + oyuncu.getToplamHasar());
		System.out.println("Para:" + oyuncu.getPara());
		if (oyuncu.getEnv().getHasar() > 0) {
			System.out.println("Silah:" + oyuncu.getEnv().getsIsim());
		}
		if (oyuncu.getEnv().getZýrh() > 0) {
			System.out.println("Zýrh:" + oyuncu.getEnv().getzIsim());
		}
	}

	public void dusmanDurum() {
		System.out.println("\n" + canavar.getIsim() + " Degerleri\n--------------");
		System.out.println("Can:" + canavar.getSaglik());
		System.out.println("Hasar:" + canavar.getHasar());
		System.out.println("Ödül:" + canavar.getOdul());
	}

	public void vurusSonrasi() {
		System.out.println("Oyuncu Cani:" + oyuncu.getSaglik());
		System.out.println(canavar.getIsim() + " Cani:" + canavar.getSaglik());
		System.out.println();
	}

}
