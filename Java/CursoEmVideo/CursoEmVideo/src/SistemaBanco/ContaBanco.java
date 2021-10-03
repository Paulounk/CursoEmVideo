package SistemaBanco;

public class ContaBanco {
	
	public int numConta;
	protected String tipo;
	private String dono;
	private double saldo;
	private boolean status;
	
	//CONSTRUCTOR
	public ContaBanco() {
		this.saldo = 0;
		this.status = false;
	}
	
	//METODOS PERSONALIZADOS
	public void abrirConta(String t) {
		while(t != "cc" && t != "cp") {
			System.out.println("Informe cc para Conta Corrente ou cp para Conta Poupança.");
		}
		
		setTipo(t);
		setStatus(true);
		
		if(t.equals("cc")){
			setSaldo(50.00);
		}else {
			setSaldo(150.00);
		}
		
		System.out.println("Conta aberta com sucesso!");
	}
	
	public void fecharConta() {
		if(this.saldo > 0) {
			System.out.println("Conta com dinheiro");
		}
		else if(this.saldo < 0) {
			System.out.println("Conta negativa!");
		}
		else {
			setStatus(false);
			System.out.println("Conta fechada com sucesso!");
		}
	}
	
	public void depositar(double valor) {
		if(this.status == true) {
			setSaldo(getSaldo() + valor);
		}else {
			System.out.println("Erro! Está conta está fechada.");
		}
	}
	
	public void sacar(double valor) {
		
		if(this.status == true) {
			if(this.saldo >= valor) {
				setSaldo(getSaldo() - valor);
				System.out.println("Saldo realizando na conta de " + getDono());
			}else {
				System.out.println("Saldo insuficiente para saque!");
			}
		}else {
			System.out.println("Erro! Está conta está fechada.");
		}
	}
	
	public void pagarMensalidade() {
		int vMensal = 0;
		
		if(this.tipo == "cc") {
			vMensal = 12;
		}else {
			vMensal = 20;
		}
		
		if(this.status == true) {
			if(this.saldo > vMensal) {
				setSaldo(getSaldo() - vMensal);
			}
			else {
				System.out.println("Saldo Insuficiente!");
			}
		}else {
			System.out.println("Erro! Está conta está fechada.");
		}
	}
	
	public void estadoAtual() {
		System.out.println("===============================");
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: " + this.isStatus());
	}

	//GETTERS E SETTERS - METODOS ESPECIAIS
	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
}
