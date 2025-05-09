package Iterator;
import java.util.Iterator;

//ConcreteIterator
public class ArtropodeIterator implements Iterator<Animal> {

	private Zoo zoo;
	private int pos = 0;
	
	public ArtropodeIterator(Zoo zoo){
		this.zoo = zoo;
	}
	
	//Metodo verifica se existe um proximo elemento especifico dessa classe na lista
	public boolean hasNext() {
		for(int i=pos; i < zoo.getAnimais().size(); i++) {
			Animal a = zoo.getAnimais().get(i);
			if(a.getClasse().equalsIgnoreCase("artropode")){
				return true;
			}
		}
		return false;
	}

	//Iterações filtradas.
	public Animal next() {
		while(pos < zoo.getAnimais().size()) {
			Animal a = zoo.getAnimais().get(pos);
			pos++;
			
			if(a.getClasse().equalsIgnoreCase("artropode")){
				return a;
			}
		}
		//Retorna null se não ha mais elementos especificos dessa classe na lista
		return null;
	}

}
