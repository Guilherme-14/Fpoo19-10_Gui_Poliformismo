package InterfaceTrab;

public class PessoaJuridica extends Funcionario{


	public PessoaJuridica(long id, String nome, String tell, int matricula, String endereco) {
		super(id, nome, tell, matricula, endereco);
		
	}
	
	@Override	
	public double calculaSalario(double valorBruto , double imposto) {
		return valorBruto - imposto;
	}
}
