package InterfaceTrab;

public class Principal {

	public static void main(String[] args) {
		Jornada jornada = new Jornada(1 , "Gui" , "(15)98989-0808" , 14 , "Rua dos Bobos" );
		System.out.println(jornada.calculaSalario(100, 10));
		
		Horista horista = new Horista(2 , "David" , "(15)98989-0808" , 13 , "Rua dos Bobos" );
		System.out.println(horista.calculaSalario(150, 10));
		
		PessoaJuridica advogado = new PessoaJuridica(3 , "Luiz" , "(15)98989-0808" , 12 , "Rua dos Bobos" );
		System.out.println(advogado.calculaSalario(5000, 1000));
	}

}
