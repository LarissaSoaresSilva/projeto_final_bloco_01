package livraria.model;

public class PublicoAlvo extends Livro {

	private int faixaEtaria;
	private int categoriaDoLivro;

	public PublicoAlvo(String nomeDoLivro, String autorDoLivro, int codigoDoLivro, int quantidadeDoLivro,
			double precoDoLivro, int faixaEtaria, int categoriaDoLivro) {
		super(nomeDoLivro, autorDoLivro, codigoDoLivro, quantidadeDoLivro, precoDoLivro);
		this.faixaEtaria = faixaEtaria;
		this.categoriaDoLivro = categoriaDoLivro;

	}

	public int getFaixaEtaria() {
		return faixaEtaria;
	}

	public void setFaixaEtaria(int faixaEtaria) {
		this.faixaEtaria = faixaEtaria;
	}

	public int getCategoriaDoLivro() {
		return categoriaDoLivro;
	}

	public void setCategoriaDoLivro(int categoriaDoLivro) {
		this.categoriaDoLivro = categoriaDoLivro;
	}

	public void classificar() {

		switch (this.categoriaDoLivro) {

		case 1:
			if (faixaEtaria <= 12) {
				System.out.println("Livro para Crianças.");
			}
			break;

		case 2:
			if (faixaEtaria >= 13 && faixaEtaria <= 18) {
				System.out.println("Livro para Jovens.");
			}
			break;

		case 3:
			if (faixaEtaria >= 18) {

				System.out.println("Livro para Adultos.");
			}
			break;

		default:
			System.out.println("Categoria de livro inválida.");
			break;
		}
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Categoria do Livro: " + this.categoriaDoLivro);
	}
}
