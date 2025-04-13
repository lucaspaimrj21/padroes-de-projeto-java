package Bridge;

public class MinhaApp {

	public static void main(String[] args) {
		
		Professor grad = new ProfessorGraduacao(new ProfessorImplGraduacao());
		grad.op();
		
		Professor posGrad = new ProfessorPosGraduacao(new ProfessorImplPosGraduacao());
		posGrad.op();
	}

}
