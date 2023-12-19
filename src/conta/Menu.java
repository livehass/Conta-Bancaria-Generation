package conta;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;
import conta.util.Cores;

public class Menu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Teste da Classe Conta Corrente
		ContaCorrente cc1 = new ContaCorrente(1, 123, 1, "José da Silva", 0.0f, 1000.0f);
		cc1.visualizar();
		cc1.sacar(12000.0f);
		cc1.visualizar();
		cc1.depositar(5000.0f);
		cc1.visualizar();

		// Teste da Classe Conta Poupança
		ContaPoupanca cp1 = new ContaPoupanca(2, 123, 2, "Maria dos Santos", 100000.0f, 15);
		cp1.visualizar();
		cp1.sacar(1000.0f);
		cp1.visualizar();
		cp1.depositar(5000.0f);
		cp1.visualizar();

		int op;

		while (true) {
			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
					+ "***********************************************************\n"
					+ "*			                                  *\n"
					+ "*-------------------BANCO-DA-GENERETION-------------------*\n"
					+ "*			                                  *\n"
					+ "***********************************************************\n"
					+ "*			                                  *\n"
					+ "*          1 - Criar conta                                *\n"
					+ "*          2 - Listar todas as contas                     *\n"
					+ "*          3 - Buscar conta por número                    *\n"
					+ "*          4 - Atualizar dados da conta                   *\n"
					+ "*          5 - Apagar conta                               *\n"
					+ "*          6 - Sacar                                      *\n"
					+ "*          7 - Depositar                                  *\n"
					+ "*          8 - Transferir valores entre contas            *\n"
					+ "*          9 - Sair                                       *\n"
					+ "*			                                  *\n"
					+ "***********************************************************\n"
					+ "*              Entre com a opção desejada                 *\n"
					+ "***********************************************************\n" + Cores.TEXT_RESET);
			try {
				op = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				sc.nextLine();
				op = 0;
			}

			if (op == 9) {
				System.out.println(Cores.TEXT_WHITE_BOLD + "          BANCO DA GENERATION - LIDER NO SEGUIMENTO");
				sobre();
				sc.close();
				System.exit(0);
			}
			switch (op) {
			case 1:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Criar conta \n\n");
				keyPress();
				break;
			case 2:
				System.out.println(Cores.TEXT_WHITE_BOLD + Cores.TEXT_WHITE_BOLD + "Listar todas as contas \n\n");
				keyPress();
				break;
			case 3:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Consultar todas as contas - por número\n\n");
				keyPress();
				break;
			case 4:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Atualizar dados da conta \n\n");
				keyPress();
				break;
			case 5:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Apagar conta\n\n");
				keyPress();
				break;
			case 6:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Sacar do saldo em conta \n\n");
				keyPress();
				break;
			case 7:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Depositar em conta\n\n");
				keyPress();
				break;
			case 8:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Transferir valores entre contas \n\n");
				keyPress();
				break;
			default:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Opção Inválida");
				keyPress();
				break;
			}

		}

	}

	private static void sobre() {
		System.out.println("***********************************************************\n"
				+ "*      Projeto Desenvolvido por: Jorge Felipe             *\n"
				+ "*      Generation Brasil - generation@generation.org      *\n"
				+ "*      github.com/conteudoGeneration                      *\n"
				+ "***********************************************************\n");

	}

	public static void keyPress() {
		try {
			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para COntinuar");
			System.in.read();
		} catch (IOException e) {
			System.out.println("Você pressionou uma tecla diferente dded enter");
		}
	}

}