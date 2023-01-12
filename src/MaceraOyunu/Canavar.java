package MaceraOyunu;

import java.util.Random;
public class Canavar {
	private String isim;
	private int hasar, odul, saglik, maxSayi;

	public Canavar(String isim, int hasar, int saglik, int odul, int maxSayi) {
		this.isim = isim;
		this.hasar = hasar;
		this.odul = odul;
		this.saglik = saglik;
		this.maxSayi = maxSayi;
	}
	
	public int canavarSayisi() {
		Random r = new Random();
		return r.nextInt(this.maxSayi) + 1;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public int getHasar() {
		return hasar;
	}

	public void setHasar(int hasar) {
		this.hasar = hasar;
	}

	public int getOdul() {
		return odul;
	}

	public void setOdul(int odul) {
		this.odul = odul;
	}

	public int getSaglik() {
		return saglik;
	}

	public void setSaglik(int saglik) {
		this.saglik = saglik;
	}

	public int getMaxSayi() {
		return maxSayi;
	}

	public void setMaxSayi(int maxSayi) {
		this.maxSayi = maxSayi;
	}

}
