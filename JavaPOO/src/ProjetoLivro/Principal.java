package ProjetoLivro;

public class Principal {

	public static void main(String[] args) {
	
		Pessoa [] pessoa = new Pessoa[2];
		Livro[] livro = new Livro[3];
		
		pessoa[0] = new Pessoa ("Jo?o", 25, "M");
		pessoa[1] = new Pessoa ("Maria", 22, "F");
		
		livro[0] = new Livro ("Aprendendo Orienta??o a Objeto", "Joaquim Oliveira", 300, pessoa[0]);
		livro[1] = new Livro ("Clean Code", "Robert Cecil", 150, pessoa[1]);
		livro[2] = new Livro ("Arquitetura limpa", "Robert Cecil", 200, pessoa[0]);
		
		livro[0].abrir();
		livro[0].folhear(600);

	}

}
