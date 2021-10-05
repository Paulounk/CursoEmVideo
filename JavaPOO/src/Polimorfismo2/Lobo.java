package Polimorfismo2;

public class Lobo extends Mamifero {
	
	//EXEMPLO DE SOBRE-POSIÇÃO
	
	@Override
	public void emitirSom() {
		System.out.println("Auuuuuuu...");
	}

}
