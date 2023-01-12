package MaceraOyunu;

public class Envanter {
	private boolean su,yiyecek,odun;
	private String sIsim,zIsim;
	private int hasar,zýrh;
	
	Envanter(){
		this.su = false;
		this.yiyecek = false;
		this.odun = false;
		this.hasar = 0;
		this.zýrh = 0;
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

	public int getZýrh() {
		return zýrh;
	}

	public void setZýrh(int zýrh) {
		this.zýrh = zýrh;
	}
	
	
}
