package MaceraOyunu;

public abstract class NormalKonum extends Konum{

	NormalKonum(Oyuncu oyuncu,String isim) {
		super(oyuncu);
		this.isim = isim;
	}
	

	public boolean getKonum() {
		return true;
	}
	
	
}