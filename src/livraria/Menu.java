package livraria;


import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;


import livraria.model.Livro;
import livraria.model.PublicoAlvo;
import livraria.controller.EstoqueController;

public class Menu {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		EstoqueController estoqueController = new EstoqueController();

		int opcaoMenu = 0, codigoDoLivro, quantidadeDoLivro, faixaEtaria;
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
			System.out.println("     5 - Classificar o Livro                 ");
			System.out.println("     6 - Sair                                ");
			System.out.println("                                             ");
			System.out.println("#### ### ### ### ### ### ### ### ### ### ####");
			System.out.println("Entre com a opção desejada:                  ");
			System.out.println("                                             ");
			
			try {
				opcaoMenu = ler.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("/nDigite apenas numéros inteiros!");
				opcaoMenu = 0 ;
			}
			

			if (opcaoMenu == 6) {

				System.out.println(
						"\nLivraria Soares Há Um Click - Livros ao seu alcance, com um clique de distância! \n");
				sobre();
				ler.close();
				System.exit(0);
			}

			switch (opcaoMenu) {

			case 1:
				System.out.println("\nAdicionar o  Livro no estoque\n");
				
				System.out.println("Digite os dados do livro: \n");
				
                System.out.println("Nome do livro: ");
                ler.skip("\\R?");
                nomeDoLivro = ler.nextLine();
                System.out.println("Autor do livro: ");
                ler.skip("\\R?");
                autorDoLivro = ler.nextLine();
                System.out.println("Código do livro: ");
                codigoDoLivro = ler.nextInt();
                System.out.println("Quantidade do livro: ");
                quantidadeDoLivro = ler.nextInt();
                System.out.println("Preço do livro (R$):   ");
                precoDoLivro = ler.nextDouble();
                System.out.println("Faixa etária:   ");
                faixaEtaria = ler.nextInt();
                
                
             PublicoAlvo livro = new PublicoAlvo(nomeDoLivro , autorDoLivro, codigoDoLivro, quantidadeDoLivro, precoDoLivro, faixaEtaria);
               
            	estoqueController.adicionarLivro(livro);
             
             keyPress();
               break;
			case 2:
				System.out.println("\nListar todos os Livros do estoque: \n");
				
				estoqueController.listarLivro();
				
				keyPress();
				break;

			case 3:
				System.out.println("\nAlterar dados dos Livros do estoque: \n");
				
				 System.out.println("Digite o código do livro a ser alterado:");
                 codigoDoLivro = ler.nextInt();
                 estoqueController.atualizarDadosLivro(codigoDoLivro);
            
				keyPress();
				break;
			case 4:
				System.out.println("\nExcluir Livro do estoque: \n");
				 System.out.println("Digite o código do livro a ser excluído:");
                 codigoDoLivro = ler.nextInt();
                 estoqueController.excluirLivro(codigoDoLivro);
				
				keyPress();
				break;
			case 5 :
				  System.out.println("\nClassificar o Livro");
                  System.out.print("Digite o código do livro: ");
                  codigoDoLivro = ler.nextInt();
                  System.out.print("Qual faixa etária? ");
                  faixaEtaria = ler.nextInt();
                  
                  PublicoAlvo livroParaClassificar = null;
                  for (Livro livro1 : estoqueController.getEstoqueDeLivros()) {
                      if (livro1.getCodigoDoLivro() == codigoDoLivro) {
                          livroParaClassificar = (PublicoAlvo) livro1; // Casting para PublicoAlvo
                          break;
                      }
                  }

                  if (livroParaClassificar != null) {
                      int categoriaDoLivro = livroParaClassificar.classificar();
                      System.out.println("Categoria do Livro: " + categoriaDoLivro);
                  } else {
                      System.out.println("Livro não encontrado.");
                  }
                  
                  keyPress();
                  break;

			default:
				if (opcaoMenu <= 0 || opcaoMenu > 6) {
					System.out.println("\nOpção Inválida!\n");
					
					keyPress();
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
	
	public static void keyPress() {
		try {
			System.out.println("Pressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {
			System.out.println("Você pressionou uma tecla diferente de enter!");
		}
	}
}