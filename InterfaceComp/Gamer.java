package InterfaceComp;

public class Gamer implements Computador{
	
	public Gamer() {
		
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
