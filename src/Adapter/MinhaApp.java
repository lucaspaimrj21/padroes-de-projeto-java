package Adapter;

public class MinhaApp {

	public static void main(String[] args) {
		//Target
		TomadaBrasileira tomadaBras = new TomadaBrasileira();
		
		//Adaptado
		PlugAmericano plugEUA = new PlugAmericano();

		AdapterEUAtoBrasil tomadaModificada = new AdapterEUAtoBrasil();
		String s1 = tomadaModificada.conecta(plugEUA);
		
		//Target
		TomadaAmericana tomadaEUA = new TomadaAmericana();
		
		//Adaptador
		PlugBrasileiro plugBR = new PlugBrasileiro();
		
		AdapterBrasiltoEUA tomadaModificada2 = new AdapterBrasiltoEUA();
		String s2 = tomadaModificada2.conecta(plugBR);
		
		
		System.out.println(s1);
		System.out.println(s2);
		
	}

}
