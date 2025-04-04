package livraria;

import java.util.Scanner;
import livraria.model.Livro;
import livraria.model.PublicoAlvo;

public class Menu {

	public static void main(String[] args) {

		// teste de consulta publico alvo
		PublicoAlvo l1 = new PublicoAlvo("O pequeno Principe", "Antoine de Saint-Exupéry", 121, 10, 20.0, 6, 1);
		l1.visualizar();
		l1.classificar();
		

		Scanner ler = new Scanner(System.in);

		int opcaoMenu = 0, codigoDoLivro, quantidadeDoLivro, categoriaDoLivro;
		double precoDoLivro;
		String nomeDoLivro, autorDoLivro;

		while (true) {

			System.out.println("#### ### ### ### ### ### ### ### ### ### ####");
			System.out.println("                                             ");
			System.out.println("        Livraria Soares Há Um Click          ");
			System.out.println("                                             ");
			System.out.println("#### ### ### ### ### ### ### ### ### ### ####");
			System.out.println("                                             ");
			System.out.println("     1 - Adicionar o Livro no estoque        ");
			System.out.println("     2 - Listar todos os Livros do estoque   ");
			System.out.println("     3 - Alterar dados dos Livros do estoque ");
			System.out.println("     4 - Excluir Livro do estoque            ");
			System.out.println("     0 - Sair                                ");
			System.out.println("                                             ");
			System.out.println("#### ### ### ### ### ### ### ### ### ### ####");
			System.out.println("Entre com a opção desejada:                  ");
			System.out.println("                                             ");
			opcaoMenu = ler.nextInt();

			if (opcaoMenu == 0) {

				System.out.println(
						"\nLivraria Soares Há Um Click - Livros ao seu alcance, com um clique de distância! \n");
				sobre();
				ler.close();
				System.exit(0);
			}

			switch (opcaoMenu) {

			case 1:
				System.out.println("\nAdicionar o  Livro no estoque\n");

				break;

			case 2:
				System.out.println("\nListar todos os Livros do estoque: \n");
				break;

			case 3:
				System.out.println("\nAlterar dados dos Livros do estoque: \n");
				break;
			case 4:
				System.out.println("\nExcluir Livro do estoque: \n");
				break;

			default:
				if (opcaoMenu < 0 || opcaoMenu > 4) {
					System.out.println("\nOpção Inválida!\n");
					break;
				}
			}
		}
	}

	public static void sobre() {

		System.out.println("****************************************************\n");
		System.out.println("Projeto Desenvolvido por: Larissa Soares da Silva.    ");
		System.out.println("github.com/LarissaSoaresSilva/projeto_final_bloco_01  ");
		System.out.println("\n****************************************************");

	}
}