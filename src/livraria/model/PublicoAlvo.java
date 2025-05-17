package livraria.model;

public class PublicoAlvo extends Livro {

	private int faixaEtaria;


	public PublicoAlvo(String nomeDoLivro, String autorDoLivro, int codigoDoLivro, int quantidadeDoLivro,
			double precoDoLivro, int faixaEtaria) {
		super(nomeDoLivro, autorDoLivro, codigoDoLivro, quantidadeDoLivro, precoDoLivro);
		this.faixaEtaria = faixaEtaria;

	}

	public int getFaixaEtaria() {
		return faixaEtaria;
	}

	public void setFaixaEtaria(int faixaEtaria) {
		this.faixaEtaria = faixaEtaria;
	}


	
@Override
	public int classificar() {

		  if (faixaEtaria <= 12) {

	            System.out.println("Categoria do livro: Crianças");
	            return 1; 
	        } else if (faixaEtaria >= 13 && faixaEtaria <= 18) {
	            
	            System.out.println("Categoria do livro: Jovens");
	            return 2; 
	            
	        } else if (faixaEtaria >= 19) {
	            System.out.println("Categoria do livro: Adultos");
	            return 3; 
	            
	        } else {
	            System.out.println("Faixa etária inválida!");
	            return -1;
	            
	        }
		}
}
