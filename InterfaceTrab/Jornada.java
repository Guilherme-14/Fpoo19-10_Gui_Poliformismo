package InterfaceTrab;

public class Jornada extends Funcionario{
	

	public Jornada(long id, String nome, String tell, int matricula, String endereco) {
		super(id, nome, tell, matricula, endereco);
		
	}
	
	@Override	
	public double calculaSalario(double salarioHora , double salarioTrab) {
		return salarioHora * salarioTrab;
	}
}
