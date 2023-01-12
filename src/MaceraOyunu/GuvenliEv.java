package MaceraOyunu;

public class GuvenliEv extends NormalKonum {

	GuvenliEv(Oyuncu oyuncu) {
		super(oyuncu, "Güvenli Ev");
	}
	
	public boolean getKonum() {
		oyuncu.setSaglik(oyuncu.getsSaglik());
		System.out.println("Iyilestiniz...");
		System.out.println("Suan Güvenli Ev adli yerdesiniz.");
		return true;
	}

}
