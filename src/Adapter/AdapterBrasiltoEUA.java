package Adapter;

public class AdapterBrasiltoEUA extends TomadaAmericana {
	
	public String conecta(PlugBrasileiro plug) {
		return plug.obtemEletricidade() + this.getNomeRede();
	}

}
