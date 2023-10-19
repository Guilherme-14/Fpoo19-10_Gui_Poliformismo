package InterfaceTrab;

public class Funcionario {
	private long id;
	private String nome;
	private String tell;
	private int matricula;
	private String endereco;
	
	
	public Funcionario(long id, String nome, String tell, int matricula, String endereco) {
		
		this.id = id;
		this.nome = nome;
		this.tell = tell;
		this.matricula = matricula;
		this.endereco = endereco;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTell() {
		return tell;
	}
	public void setTell(String tell) {
		this.tell = tell;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public double calculaSalario(double salarioHora , double salarioTrab) {
		return salarioHora - salarioTrab;
	}
}
