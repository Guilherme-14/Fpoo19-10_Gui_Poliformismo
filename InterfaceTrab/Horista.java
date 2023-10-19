package InterfaceTrab;

public class Horista extends Funcionario{
	

	public Horista(long id, String nome, String tell, int matricula, String endereco) {
		super(id, nome, tell, matricula, endereco);
		
	}
	
	@Override	
	public double calculaSalario(double valorHora , double quantHoras) {
		return valorHora * quantHoras;
	}
}
