package Heranca;

public class Bolsista extends Aluno{
	
	private double bolsa;
	
	public void renovarBolsa() {
		System.out.println("Renovando bolsa de " + this.getNome());
	}
	
	@Override
	public void pagarMens() {
		System.out.println(this.getNome() + " é bolsista! Pagamento facilitado.");
	}

	public double getBolsa() {
		return bolsa;
	}

	public void setBolsa(double bolsa) {
		this.bolsa = bolsa;
	}
	
	
}
