package Observer;
import java.util.Observable;
import java.util.Observer;


public class CarroPolicia implements Observer, Carro {

	public void frente() {
		System.out.println("Viatura segue em frente.");
	}

	public void direita() {
		System.out.println("Viatura vira a direita.");
	}

	public void esquerda() {
		System.out.println("Viatura vira a esquerda.");
	}
	
	public void para() {
		System.out.println("Viatura pára.");
	}

	public void update(Observable arg0, Object arg1) {
		CarroRoubado carroObservado = (CarroRoubado)arg0;
		String acao = String.valueOf(arg1);
		
		if(acao.equals("frente")){
			this.frente();
		}
		else if(acao.equals("direita")){
			this.direita();
		}
		else if(acao.equals("esquerda")){
			this.esquerda();
		}
		else if(acao.equals("pára")){
			this.para();
		}
	}
}
