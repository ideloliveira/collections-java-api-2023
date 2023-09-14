package list.pesquisa;

import java.awt.desktop.AboutHandler;
import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
	private List<Livro> livroList;

	public CatalogoLivros() {
		this.livroList = new ArrayList<>();
	}
	
	public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
		Livro livro = new Livro(titulo, autor, anoPublicacao);
		livroList.add(livro);		
	}
//	public void pesquisarPorAutor(String autor) {
//		List<Livro>pesquisarLivroIvros = new ArrayList<>();
//		for(Livro livro: livroList) {
//			if(livro.getAutor().equalsIgnoreCase(autor)) {
//				System.out.println("Titulo: "+livro.getTitulo()+"| Autor: "+livro.getAutor());
//			}
//		}
//	}
	public List<Livro>pesquisarPorAutor(String autor){
		List<Livro>livrosPorAutor = new ArrayList<>();
		if(!livroList.isEmpty()) {
			for(Livro livro: livroList) {
				if(livro.getAutor().equalsIgnoreCase(autor)) {
					livrosPorAutor.add(livro);
				}
			}
		}
		return livrosPorAutor;
	}
	public List<Livro>pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
		List<Livro>livroPorIntervaloAno = new ArrayList<>();
		if(!livroList.isEmpty()) {
			for(Livro livro: livroList) {
				if(livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
					livroPorIntervaloAno.add(livro);
				}
			}
		}
		return livroPorIntervaloAno;
	}
	public Livro pesquisarPorTitulo(String titulo) {
		Livro livroPorTituloLivro = null;
		if(!livroList.isEmpty()) {
			for(Livro livro: livroList) {
				if(livro.getTitulo().equalsIgnoreCase(titulo)) {
					livroPorTituloLivro = livro;
					break;
				}
			}
		}
		return livroPorTituloLivro;
	}

}
