package Polimorfismo2;

public class Mamifero extends Animal{

	protected String corPelo;
	
	
	//EXEMPLO DE SOBRE-POSI��O
	@Override
	public void emitirSom() {
		System.out.println("Som de mam�fero..");
	}
}
