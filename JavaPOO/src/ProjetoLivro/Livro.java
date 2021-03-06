package ProjetoLivro;

public class Livro implements Publicacao{

	private String titulo;
	private String autor;
	private int totalPag;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	public String detalhes() {
		return "Livro \nTitulo: " + titulo + "\nAutor: " + autor + 
				"\nTotal de Paginas: " + totalPag + "\nPagina Atual: " + pagAtual + "\nAberto: " + aberto +
				"\nLeitor: " + leitor.getNome() + ", Idade: " + leitor.getIdade() + " anos, " + "Sexo: " + leitor.getSexo();
	}

	public Livro(String titulo, String autor, int totalPag, Pessoa leitor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.totalPag = totalPag;
		this.aberto = false;
		this.pagAtual = 0;
		this.leitor = leitor;
	}

	//GETTERS & SETTERS
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getTotalPag() {
		return totalPag;
	}

	public void setTotalPag(int totalPag) {
		this.totalPag = totalPag;
	}

	public int getPagAtual() {
		return pagAtual;
	}

	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}

	public boolean isAberto() {
		return aberto;
	}

	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	public Pessoa getLeitor() {
		return leitor;
	}

	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}

	@Override
	public void abrir() {
		this.aberto = true;
	}

	@Override
	public void fechar() {
		this.aberto = false;
	}

	@Override
	public void folhear(int pagina) {
	 if(this.aberto == true && this.totalPag > pagina) {
		 this.pagAtual = pagina;
	 }
	 else {
		 System.out.println("Livro n?o est? aberto ou foi excedido o numero de pagina!");
	 }
	}

	@Override
	public void avancarPag() {
		if(this.aberto) {
			 this.pagAtual++;
		 }
	}

	@Override
	public void voltarPag() {
		if(this.aberto) {
			 this.pagAtual--;
		 }
	}
	
	
	
}
