package livraria.controller;

import java.util.ArrayList;
import java.util.Scanner;

import livraria.model.Livro;
import livraria.model.PublicoAlvo;
import livraria.repository.LivrariaRepository;


public class EstoqueController implements LivrariaRepository {
	
	private ArrayList<Livro> estoqueDeLivros;
	
	public ArrayList<Livro> getEstoqueDeLivros() {
	    return estoqueDeLivros;
	}
	 public EstoqueController() {
		estoqueDeLivros = new ArrayList<>();
	}

	public void adicionarLivro(Livro livro) {
	estoqueDeLivros.add(livro);
	System.out.println("\nLivro adicionado com sucesso ao estoque!");	
	}

	@Override
	public void listarLivro() {
		if (estoqueDeLivros.isEmpty()) {
			  System.out.println("Não há livros no estoque.");	
		}else {
			 System.out.println("Livros no estoque: ");
	            for (Livro livro : estoqueDeLivros) {
	             livro.visualizar();
	            }
		}
	}

	@Override
	public void atualizarDadosLivro(int codigoDoLivro) {
		for (Livro livro : estoqueDeLivros) {
		if (livro.getCodigoDoLivro() == codigoDoLivro) {
			try (var ler = new Scanner(System.in)) {
				System.out.print("Informe a nova quantidade para o livro " + livro.getNomeDoLivro() + ": \n");
				int novaQuantidade = ler.nextInt();
				livro.setQuantidadeDoLivro(novaQuantidade);
			}
			System.out.println("\nQuantidade do Livro " + livro.getNomeDoLivro() + " atualizada com sucesso.");
		}else {
		
		System.out.println("Livro com código " + codigoDoLivro + " não encontrado.");
		}
		}
	}

	@Override
	public void excluirLivro(int codigoDoLivro) {
		  for (Livro livro : estoqueDeLivros) {
	            if (livro.getCodigoDoLivro() == codigoDoLivro) {
	                estoqueDeLivros.remove(livro);
	                System.out.println("Livro " + livro.getNomeDoLivro() + " excluído do estoque.");
	                return;
	            }else {
	            	System.out.println("Livro não encontrado.");
				}
		  }
	}

	@Override
	public void classificar(int categoriaDoLivro, int faixaEtaria) {
		boolean livroClassificado = false;
		  for (Livro livro : estoqueDeLivros) {
	            if (livro instanceof PublicoAlvo) {
	                PublicoAlvo livroPublicoAlvo = (PublicoAlvo) livro;
	                livroPublicoAlvo.setFaixaEtaria(faixaEtaria);
	                livroPublicoAlvo.classificar();
	                livroClassificado = true;
	                return;
	            }
	}
		  if (!livroClassificado) {
		        System.out.println("Nenhum livro encontrado para classificar.");
	}
}
}