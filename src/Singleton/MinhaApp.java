package Singleton;

public class MinhaApp {

	public static void main(String[] args) {
		Janela j = Janela.getInstance();
		j.pack();
		j.setVisible(true);
		
		//Tentativa de criar uma segunda janela, porém o Singleton impede
		Janela j2 = Janela.getInstance();
		j2.pack();
		j2.setVisible(true);
	}

}
