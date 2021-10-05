package SistemaBanco;

public class Conta {
	public static void main(String[] args) {
		
		ContaBanco c1 = new ContaBanco();
		c1.setNumConta(123);
		c1.setDono("Pedro");
		c1.abrirConta("cc");
		c1.depositar(100);
		
		ContaBanco c2 = new ContaBanco();
		c2.setNumConta(456);
		c2.setDono("Maria");
		c2.abrirConta("cp");
		c2.depositar(500);
		c2.sacar(1000);
		
		c1.estadoAtual();
		c2.estadoAtual();
	}
	
}
