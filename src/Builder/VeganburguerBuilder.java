package Builder;

public class VeganburguerBuilder extends SanduicheBuilder {
	
	private Sanduiche s = new VeganBurguer(); 
	
	public void abrePao() {
		System.out.println("Abre pão vegano de hamburguer.");
	}

	public void insereIngredientes() {
		System.out.println("Insere carne de soja");
	}

	public void fechaPao() {
		System.out.println("Fecha pão vegano de hamburguer.");
	}

	public Sanduiche getSanduiche() {
		System.out.println("Vegan Burguer está pronto !");
		return s;
	}
}


