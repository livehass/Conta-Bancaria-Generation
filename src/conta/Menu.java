package conta;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import conta.controller.ContaController;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;
import conta.util.Cores;

public class Menu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ContaController contas = new ContaController();

		int opcao, numero, agencia, tipo, aniversario;
		String titular;
		float saldo, limite;
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

				System.out.println("Digite o Numero Da Agência");
				agencia = sc.nextInt();

				System.out.println("Digite o Nome do Titular");
				sc.skip("\\R?");
				titular = sc.nextLine();

				do {
					System.out.println("Digite o Tipo da Conta (1-CC ou 2-cp): ");
					tipo = sc.nextInt();

				} while (tipo < 1 && tipo > 2);
				System.out.println("Digite o Saldo da Conta (R$)");
				saldo = sc.nextInt();

				switch (tipo) {
				case 1 -> {
					System.out.println("Digite o Limite de Crédito (R$): ");
					limite = sc.nextFloat();
					contas.cadastrar(new ContaCorrente(contas.gerarNumero(), agencia, tipo, titular, saldo, limite));
				}
				case 2 -> {
					System.out.println("Digite o dia do Aniversario da Conta: ");
					aniversario = sc.nextInt();
					contas.cadastrar(new ContaPoupanca(contas.gerarNumero(), agencia, tipo, titular, saldo, aniversario ));
					
					}
				}
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
			System.out.println("Você pressionou uma tecla diferente de enter");
		}
	}

}