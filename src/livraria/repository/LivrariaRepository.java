package livraria.repository;

import livraria.model.Livro;

public interface LivrariaRepository {

	public void adicionarLivro(Livro livro);

	public void listarLivro();

	public void atualizarDadosLivro(int codigoDoLivro);

	public void excluirLivro(int codigoDoLivro);

	public void classificar(int categoriaDoLivro, int faixaEtaria);
}
