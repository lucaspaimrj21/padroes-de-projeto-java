package Bridge;

public class ProfessorPosGraduacao extends Professor{

	public ProfessorPosGraduacao(Implementador imp){
		super(imp);
	}
	
	public void op() {
		imp.opImpl();
		System.out.println("Tchau");
	}
}
