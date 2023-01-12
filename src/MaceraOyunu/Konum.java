package MaceraOyunu;

	import java.util.Scanner;

	public abstract class Konum {
		protected Oyuncu oyuncu;
		protected String isim;
		Scanner scan = new Scanner(System.in);
		
		Konum(Oyuncu oyuncu){
			this.oyuncu = oyuncu;
		}
		
		public abstract boolean getKonum();

		public Oyuncu getOyuncu() {
			return oyuncu;
		}

		public void setOyuncu(Oyuncu oyuncu) {
			this.oyuncu = oyuncu;
		}

		public String getIsim() {
			return isim;
		}

		public void setIsim(String isim) {
			this.isim = isim;
		}
		
		
	}

