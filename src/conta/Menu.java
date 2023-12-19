package conta;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import conta.util.Cores;
import conta.model.Conta;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;

public class Menu {
	
	public static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		int opcao;
				
		// Teste da Classe Conta Corrente - TESTE OK!
//		ContaCorrente cc1 = new ContaCorrente(2, 123, 1, "Mariana", 15000.0f, 1000.0f);
//		cc1.visualizar();
//		cc1.sacar(12000.0f);
//		cc1.visualizar();
//		cc1.depositar(5000.0f);
//		cc1.visualizar();
//		
//		// Teste da Classe Conta Poupanca -  TESTE OK!
//		ContaPoupanca cp1 = new ContaPoupanca(3, 123, 2, "Victor", 100000.0f, 15);
//		cp1.visualizar();
//		cp1.sacar(1000.0f);
//		cp1.visualizar();
//		cp1.depositar(5000.0f);
//		cp1.visualizar();
		
		while (true) {
			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
							+ "***********************************************");
			System.out.println("                                               ");
			System.out.println("            BANCO DO BRAZIL COM Z              ");
			System.out.println("                                               ");
			System.out.println("***********************************************");
			System.out.println("                                               ");
			System.out.println("         1 - Criar conta                       ");
			System.out.println("         2 - Listar todas as contas            ");
			System.out.println("         3 - Buscar conta por número           ");
			System.out.println("         4 - Atualizar dados da conta          ");
			System.out.println("         5 - Apagar conta                      ");
			System.out.println("         6 - Sacar                             ");
			System.out.println("         7 - Depositar                         ");
			System.out.println("         8 - Transferir valores entre contas   ");
			System.out.println("         9 - Sair                              ");
			System.out.println("                                               ");
			System.out.println("***********************************************");
			System.out.println("Entre com a opção desejada:                    ");
			System.out.println("                                               " + Cores.TEXT_RESET);
			
			try {
				opcao = leia.nextInt();
			} catch(InputMismatchException e) {
				System.out.println("\nDigeite valores inteiros!");
				leia.nextLine();
				opcao=0;
			}
						
			if(opcao == 9) {
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nBanco do Brasil com Z - O seu futuro começa aqui!");
				sobre();
				leia.close();
				System.exit(0);
			}
			
			switch(opcao) {
				case 1:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Criar conta\n\n");
					
					keyPress();
					break;
				case 2:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Listas todas as contas\n\n");
					
					keyPress();
					break;
				case 3:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Consultar dados da conta por número\n\n");
					
					keyPress();
					break;
				case 4:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Atualizar daddos da conta\n\n");
					
					keyPress();
					break;
				case 5:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Apagar a conta\n\n");
					
					keyPress();
					break;
				case 6:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Saque\n\n");
					
					keyPress();
					break;
				case 7:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Depósito\n\n");
					
					keyPress();
					break;
				case 8:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Transferência entre contas\n\n");
					
					keyPress();
					break;
				default:
					System.out.println(Cores.TEXT_RED_BOLD + "Opção inválida\n");
					
					keyPress();
					break;
			}
		}
	}
	
	public static void sobre() {
		System.out.println("\n***********************************************");
		System.out.println("Projeto Desenvolvido por: ");
		System.out.println("Generation Brasil - generation@generation.org");
		System.out.println("github.com/conteudoGeneration");
		System.out.println("***********************************************");
	}
	
	public static void  keyPress() {
		
		try {
				System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para continuar...");
				System.in.read();
		} catch (IOException e) {
			System.out.println("Você pressionou uma tecla diferente de enter!");
		}
	}

}
