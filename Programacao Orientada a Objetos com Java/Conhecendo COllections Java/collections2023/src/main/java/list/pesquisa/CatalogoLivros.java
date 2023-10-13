package main.java.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
	private List<Livro> livroList;

	public CatalogoLivros() {
		this.livroList = new ArrayList<>();
	}

	public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
		livroList.add(new Livro(titulo, autor, anoPublicacao));
	}

	public List<Livro> pesquisarPorAutor(String autor) {
		List<Livro> listaResultados = new ArrayList<Livro>();
		if (!livroList.isEmpty()) {
			for (Livro livro : livroList) {
				if (livro.getAutor().equalsIgnoreCase(autor)) {
					listaResultados.add(livro);
				}
			}
		}
		return listaResultados;
	}

	public List<Livro> pesquisaPorIntervaloAnos(int anoInicial, int anoFinal) {
		List<Livro> listaResultados = new ArrayList<Livro>();
		if (!livroList.isEmpty()) {
			for (Livro livro : livroList) {
				if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
					listaResultados.add(livro);
				}
			}
		}
		return listaResultados;
	}

	public Livro pesquisaPorTitulo(String titulo) {
		Livro livroPorTitulo = null;
		if (!livroList.isEmpty()) {
			for (Livro l : livroList) {
				if (l.getTitulo().equalsIgnoreCase(titulo)) {
					livroPorTitulo = l;
					break;
				}
			}
		}
		return livroPorTitulo;
	}
	
	public static void main (String[] args) {
		CatalogoLivros catalogoLivros = new CatalogoLivros();
		catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2002);
		catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2003);
		catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2006);
		catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 2020);
		catalogoLivros.adicionarLivro("Livro 5", "Autor 5", 2007);
		catalogoLivros.adicionarLivro("Livro 6", "Autor 6", 2021);
		catalogoLivros.adicionarLivro("Livro 7", "Autor 7", 2021);
		catalogoLivros.adicionarLivro("Livro 8", "Autor 8", 2021);
		
		System.out.println(catalogoLivros.pesquisaPorTitulo("Livro 1"));
		System.out.println(catalogoLivros.pesquisaPorIntervaloAnos(2002, 2010));
		System.out.println(catalogoLivros.pesquisarPorAutor("Autor 6"));
	}
}










