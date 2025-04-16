package ChainOfResponsability;

public class MinhaApp {
	
	public static void main(String args[]) {
		//Tomadores de decisão
		TomadorDeDecisao presidente = new Presidente();
		TomadorDeDecisao vicepresidente = new VicePresidente();
		TomadorDeDecisao diretor = new Diretor();
		TomadorDeDecisao gerente = new Gerente();
		
		gerente.setSucessor(diretor);
		diretor.setSucessor(vicepresidente);
		vicepresidente.setSucessor(presidente);
		
		Compra compra = new Compra(50000F);
		gerente.aprova(compra);
	}
}
