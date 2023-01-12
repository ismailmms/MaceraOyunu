package MaceraOyunu;

import java.util.Scanner;

public class Oyuncu {
	private int hasar, saglik, para, sSaglik;
	private String isim, kisim;
	private Envanter env;
	Scanner scan = new Scanner(System.in);

	public Oyuncu(String isim) {
		this.isim = isim;
		this.env = new Envanter();
	}

	public void selectCha() {
		switch (chaMenu()) {
		case 1:
			kOyuncu("Samuray", 5, 21, 15);
			break;
		case 2:
			kOyuncu("Okçu", 7, 18, 20);
			break;
		case 3:
			kOyuncu("Sovalye", 8, 24, 5);
			break;
		default:
			kOyuncu("Samuray", 5, 21, 15);
			break;
		}
		System.out.println("Karakter Oluşturuldu ! Adı=" + getKisim() + " ,Hasar=" + getHasar() + " ,Sağlık="
				+ getSaglik() + " ,Para=" + getPara());
	}

	public int chaMenu() {
		System.out.println("Lütfen bir karakter seçiniz : ");
		System.out.println("1- Samuray \t Hasar : 5 \t Saglık :21 \t Para :15");
		System.out.println("2- Okçu \t Hasar : 7 \t Saglık :18 \t Para :20");
		System.out.println("3- Sovalye \t Hasar : 8 \t Saglık :24 \t Para :5");
		System.out.print("Karater Seçiminiz : ");
		int chaID = scan.nextInt();

		while (chaID < 1 || chaID > 3) {
			System.out.print("Lütfen geçerli bir karakter seçiniz : ");
			chaID = scan.nextInt();
		}

		return chaID;
	}

	public int getToplamHasar() {
		return this.getHasar() + this.getEnv().getHasar();
	}

	public void kOyuncu(String kisim, int hsr, int sglk, int pra) {
		setKisim(kisim);
		setHasar(hsr);
		setSaglik(sglk);
		setPara(pra);
		setsSaglik(sglk);
	}

	public int getHasar() {
		return hasar;
	}

	public void setHasar(int hasar) {
		this.hasar = hasar;
	}

	public int getSaglik() {
		return saglik;
	}

	public void setSaglik(int saglik) {
		this.saglik = saglik;
	}

	public int getPara() {
		return para;
	}

	public void setPara(int para) {
		this.para = para;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getKisim() {
		return kisim;
	}

	public void setKisim(String kisim) {
		this.kisim = kisim;
	}

	public Envanter getEnv() {
		return env;
	}

	public void setEnv(Envanter env) {
		this.env = env;
	}

	public int getsSaglik() {
		return sSaglik;
	}

	public void setsSaglik(int sSaglik) {
		this.sSaglik = sSaglik;
	}

}
