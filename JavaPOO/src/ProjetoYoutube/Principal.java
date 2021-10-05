package ProjetoYoutube;

public class Principal {

	public static void main(String[] args) {
		
		Video v[] = new Video[3];
		v[0] = new Video("Aula 1 de POO");
		v[1] = new Video("Aula 12 de PHP");
		v[2] = new Video("Aula 10 DE HTML5");
		
		
		Gafanhoto g[] = new Gafanhoto[2];
		g[0] = new Gafanhoto("Pedro", 22, "M", "Pedrinho");
		g[1] = new Gafanhoto("Maria", 18, "F", "Mah");
		
		
		Visualizacao vis[] = new Visualizacao[5];
		vis[0] = new Visualizacao(g[0], v[2]);
		vis[0].avaliar();
		
		vis[1] = new Visualizacao(g[0], v[1]);
		vis[1].avaliar(85.0);
		
		System.out.println(vis[0].toString());
		System.out.println(vis[1].toString());

	}

}
