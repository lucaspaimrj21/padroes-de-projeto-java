package Builder;

public class MinhaApp {

	public static void main(String[] args) {
		Cozinha cozinha = new Cozinha();
		
		//Builders
		SanduicheBuilder b1 = new HamburguerBuilder();
		SanduicheBuilder b2 = new FishBuilder();
		SanduicheBuilder b3 = new VeganburguerBuilder();
		
		cozinha.fazSanduiche(b3);
		b3.getSanduiche();
	}

}
