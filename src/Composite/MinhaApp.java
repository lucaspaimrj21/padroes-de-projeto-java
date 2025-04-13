package Composite;

public class MinhaApp {

	public static void main(String[] args) {
		//Cria programadores (folhas)
		Programador pEstagiario = new Programador("José", 900);
		Programador pJunior = new Programador("Pedro", 2900);
		Programador pSenior = new Programador("Ricardo", 5500);
		
		//Gerentes
		Gerente g3 = new Gerente("João", 15000);
        Gerente g2 = new Gerente("Maria", 10000);
        Gerente g1 = new Gerente("Carlos", 7500);
        
        //Montar a estrutura em árvore
        
        //Carlos supervisiona os programadores José e Pedro
        g1.add(pEstagiario);
        g1.add(pJunior);
        
        //Maria supervisiona o programador Ricardo
        g2.add(pSenior);
        
        //João é raiz da estrutura em árvore
        g3.add(g1);
        g3.add(g2);
        
        g3.print();
	}

}
