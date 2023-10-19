package InterfaceComp;

public class Home implements Computador {
	
public Home() {
		
	}
	
	@Override
	public void ligar() {
		System.out.println("Está ligando");
	}
	
	@Override
	public void reiniciar() {
		System.out.println("Está reiniciando");
	}
	
	@Override
	public void desligar() {
		System.out.println("Está desligando");
	}
	
	@Override
	public void carregSistema() {
		System.out.println("Está carregando");
	}
}
