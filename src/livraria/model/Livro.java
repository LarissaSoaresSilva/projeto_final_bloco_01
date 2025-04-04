package livraria.model;

public abstract class Livro {

	private String nomeDoLivro;
	private String autorDoLivro;
	private int codigoDoLivro;
	private int quantidadeDoLivro;
	double precoDoLivro;

	public Livro(String nomeDoLivro, String autorDoLivro,int codigoDoLivro,int quantidadeDoLivro, double precoDoLivro) {
		this.nomeDoLivro = nomeDoLivro;
		this.autorDoLivro = autorDoLivro;
		this.codigoDoLivro = codigoDoLivro;
		this.quantidadeDoLivro = quantidadeDoLivro;
		this.precoDoLivro = precoDoLivro;
		
	}

	public String getNomeDoLivro() {
		return nomeDoLivro;
	}

	public void setNomeDoLivro(String nomeDoLivro) {
		this.nomeDoLivro = nomeDoLivro;
	}

	public String getAutorDoLivro() {
		return autorDoLivro;
	}

	public void setAutorDoLivro(String autorDoLivro) {
		this.autorDoLivro = autorDoLivro;
	}


	public int getCodigoDoLivro() {
		return codigoDoLivro;
	}

	public void setCodigoDoLivro(int codigoDoLivro) {
		this.codigoDoLivro = codigoDoLivro;
	}

	public int getQuantidadeDoLivro() {
		return quantidadeDoLivro;
	}

	public void setQuantidadeDoLivro(int quantidadeDoLivro) {
		this.quantidadeDoLivro = quantidadeDoLivro;
	}


	public double getPrecoDoLivro() {
		return precoDoLivro;
	}

	public void setPrecoDoLivro(double precoDoLivro) {
		this.precoDoLivro = precoDoLivro;
	}

	
	public void visualizar() {
	
		System.out.println("\n***********************************************************\n");
		System.out.println("Dados do Livro :");
		System.out.println("***********************************************************");
		System.out.println("Código de Identificação do Livro: " + this.codigoDoLivro);
		System.out.println("Nome do Livro: " + this.nomeDoLivro);
		System.out.println("Autor(es) do Livro: " + this.autorDoLivro);
		System.out.println("Preço de Venda: " + this.precoDoLivro);
		System.out.println("Quantidade em estoque: " + this.quantidadeDoLivro);

	}

}
	

