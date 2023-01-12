package MaceraOyunu;

public class Envanter {
	private boolean su,yiyecek,odun;
	private String sIsim,zIsim;
	private int hasar,z�rh;
	
	Envanter(){
		this.su = false;
		this.yiyecek = false;
		this.odun = false;
		this.hasar = 0;
		this.z�rh = 0;
		this.sIsim = null;
		this.zIsim = null;
	}

	public boolean isSu() {
		return su;
	}

	public void setSu(boolean su) {
		this.su = su;
	}

	public boolean isYiyecek() {
		return yiyecek;
	}

	public void setYiyecek(boolean yiyecek) {
		this.yiyecek = yiyecek;
	}

	public boolean isOdun() {
		return odun;
	}

	public void setOdun(boolean odun) {
		this.odun = odun;
	}

	public String getsIsim() {
		return sIsim;
	}

	public void setsIsim(String sIsim) {
		this.sIsim = sIsim;
	}

	public String getzIsim() {
		return zIsim;
	}

	public void setzIsim(String zIsim) {
		this.zIsim = zIsim;
	}

	public int getHasar() {
		return hasar;
	}

	public void setHasar(int hasar) {
		this.hasar = hasar;
	}

	public int getZ�rh() {
		return z�rh;
	}

	public void setZ�rh(int z�rh) {
		this.z�rh = z�rh;
	}
	
	
}
