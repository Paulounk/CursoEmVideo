package ProjetoPessoas;

public class Principal {

	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa();
		Aluno aluno = new Aluno();
		Professor prof = new Professor();
		Funcionario func = new Funcionario();
		
		pessoa.setNome("Pedro");
		aluno.setNome("Maria");
		prof.setNome("Claudio");
		func.setNome("Fabiana");
	}

}
