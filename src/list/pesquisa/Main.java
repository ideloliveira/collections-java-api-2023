package list.pesquisa;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CatalogoLivros livros = new CatalogoLivros();
		
		livros.adicionarLivro("A hora da Estarela", "Clarice Lispectro", 1977);
		livros.adicionarLivro("Dom Casmurro", "Machado de Assis", 1899);
		livros.adicionarLivro("Memorial de Aires ", "Machado de Assis", 1908);
		livros.adicionarLivro("Capitães da Areia", "Jorge Amado", 1937);
		livros.adicionarLivro("Dona Flôr e seus dois maridos", "Jorge Amado", 1966);
		livros.adicionarLivro("Tenda dos Milagres", "Jorge Amado", 1969);
		livros.adicionarLivro("Tenda dos Milagres", "Simão Costa", 2020);
		
		System.out.println(livros.pesquisarPorAutor("Machado de Assis"));
		//System.out.println(livros.pesquisarPorIntervaloAnos(1908, 1937));
		//System.out.println(livros.pesquisarPorTitulo("Tenda dos Milagres"));

	}

}
