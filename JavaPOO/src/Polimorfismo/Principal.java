package Polimorfismo;

public class Principal {

	public static void main(String[] args) {
		
		Mamifero m = new Mamifero();
		Cachorro c = new Cachorro();
		
		m.setPeso(35.5);
		m.setCorPelo("Marrom");
		m.alimentar();
		m.locomover();
		m.emitirSom();
		
		c.emitirSom();

	}

}
