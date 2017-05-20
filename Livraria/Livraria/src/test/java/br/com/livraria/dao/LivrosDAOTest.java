package br.com.livraria.dao;

import java.math.BigDecimal;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.livraria.DAO.LivrosDAO;
import br.com.livraria.DAO.entity.Livros;

@SuppressWarnings("unused")
public class LivrosDAOTest {

	@Test
	public void salvar() {

		Livros livros = new Livros();
		livros.setAno_publicacao(2020);
		livros.setAutor("Esta funfando");
		livros.setCategoria("TI");
		livros.setEdicao(10);
		livros.setEditora("Arqueiro");
		livros.setIdioma("Portugues");
		livros.setNome_livro("SOMOS GENIOS");
		livros.setNum_paginas(new Short("100"));

		LivrosDAO livrosDAO = new LivrosDAO();
		livrosDAO.salvar(livros);

		System.out.println("Livro salvo com sucesso");

	}

	@Test
	@Ignore
	public void listar() {

		LivrosDAO livrosDAO = new LivrosDAO();
		List<Livros> resultado = livrosDAO.listar();

		for (Livros livros : resultado) {

			System.out.println("Nome do Livro: " + livros.getNome_livro());
			System.out.println("Ano de Publicação: " + livros.getAno_publicacao());
			System.out.println("Autor do Livro: " + livros.getAutor());
			System.out.println("Categoria do Livro: " + livros.getCategoria());
			System.out.println("Edição do Livro: " + livros.getEdicao());
			System.out.println("Editora do Livro: " + livros.getEditora());
			System.out.println("Idioma do Livro: " + livros.getIdioma());
			System.out.println("Numero de páginas : " + livros.getNum_paginas());

		}
	}

	@Test
	@Ignore
	public void buscar() {
		Long codigo = 7L;

		LivrosDAO livrosDAO = new LivrosDAO();
		Livros livros = livrosDAO.buscar(codigo);

		System.out.println("Nome do Livro: " + livros.getNome_livro());
		System.out.println("Ano de Publicação: " + livros.getAno_publicacao());
		System.out.println("Autor do Livro: " + livros.getAutor());
		System.out.println("Categoria do Livro: " + livros.getCategoria());
		System.out.println("Edição do Livro: " + livros.getEdicao());
		System.out.println("Editora do Livro: " + livros.getEditora());
		System.out.println("Idioma do Livro: " + livros.getIdioma());
		System.out.println("Numero de páginas : " + livros.getNum_paginas());

	}

	@Test
	@Ignore
	public void excluir() {
		Long codigo = 8L;

		LivrosDAO livrosDAO = new LivrosDAO();
		Livros livros = livrosDAO.buscar(codigo);

		livrosDAO.excluir(livros);	
		
		System.out.println("Ano de Publicação: " + livros.getAno_publicacao());
		System.out.println("Autor do Livro: " + livros.getAutor());
		System.out.println("Categoria do Livro: " + livros.getCategoria());
		System.out.println("Edição do Livro: " + livros.getEdicao());
		System.out.println("Editora do Livro: " + livros.getEditora());
		System.out.println("Idioma do Livro: " + livros.getIdioma());
		System.out.println("Nome do Livro: " + livros.getNome_livro());
		System.out.println("Numero de páginas : " + livros.getNum_paginas());

	}

	@Test
	@Ignore
	public void editar(){
	Long codigoLivros = 7L;
	
	LivrosDAO livrosDAO = new LivrosDAO ();
	Livros livros = livrosDAO.buscar(codigoLivros);
	
	System.out.println("Ano de Publicação: " + livros.getAno_publicacao());
	System.out.println("Autor do Livro: " + livros.getAutor());
	System.out.println("Categoria do Livro: " + livros.getCategoria());
	
	
	System.out.println("Ano de Publicação: " + livros.getAno_publicacao());
	System.out.println("Autor do Livro: " + livros.getAutor());
	System.out.println("Categoria do Livro: " + livros.getCategoria());
	System.out.println("Edição do Livro: " + livros.getEdicao());
	System.out.println("Editora do Livro: " + livros.getEditora());
	System.out.println("Idioma do Livro: " + livros.getIdioma());
	System.out.println("Nome do Livro: " + livros.getNome_livro());
	System.out.println("Numero de páginas : " + livros.getNum_paginas());
	
	
	livros.setAno_publicacao(2020);
	
	livrosDAO.editar(livros);
	
	
	}
	
	
}
