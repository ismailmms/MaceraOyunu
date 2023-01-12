package MaceraOyunu;

public class GuvenliEv extends NormalKonum {

	GuvenliEv(Oyuncu oyuncu) {
		super(oyuncu, "G�venli Ev");
	}
	
	public boolean getKonum() {
		oyuncu.setSaglik(oyuncu.getsSaglik());
		System.out.println("Iyilestiniz...");
		System.out.println("Suan G�venli Ev adli yerdesiniz.");
		return true;
	}

}
