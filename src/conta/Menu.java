package conta;

import java.util.Scanner;

import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;
import conta.util.Cores;

public class Menu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ContaPoupanca novoteste = new ContaPoupanca("Conta poupança teste ok: ", true);
		novoteste.TestContaPoupanca();
		
		ContaCorrente novoteste2 = new ContaCorrente("Conta corrente teste ok: ", false);
		novoteste2.testaContaCorrente();
		
		
		int op;

		while (true) {
			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
					+"***********************************************************\n"
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
					+ "***********************************************************\n"
					+Cores.TEXT_RESET);

			op = sc.nextInt();
			if (op == 9) {
				System.out.println(Cores.TEXT_WHITE_BOLD+"          BANCO DA GENERATION - LIDER NO SEGUIMENTO");
				sobre();
				sc.close();
				System.exit(0);
			}
			switch (op) {
			case 1:
				System.out.println(Cores.TEXT_WHITE_BOLD+"Criar conta \n\n");
				break;
			case 2:
				System.out.println(Cores.TEXT_WHITE_BOLD+Cores.TEXT_WHITE_BOLD+"Listar todas as contas \n\n");
				break;
			case 3:
				System.out.println(Cores.TEXT_WHITE_BOLD+"Consultar todas as contas - por número\n\n");
				break;
			case 4:
				System.out.println(Cores.TEXT_WHITE_BOLD+"Atualizar dados da conta \n\n");
				break;
			case 5:
				System.out.println(Cores.TEXT_WHITE_BOLD+"Apagar conta\n\n");
				break;
			case 6:
				System.out.println(Cores.TEXT_WHITE_BOLD+"Sacar do saldo em conta \n\n");
				break;
			case 7:
				System.out.println(Cores.TEXT_WHITE_BOLD+"Depositar em conta\n\n");
				break;
			case 8:
				System.out.println(Cores.TEXT_WHITE_BOLD+"Transferir valores entre contas \n\n");
				break;
			default:
				System.out.println(Cores.TEXT_WHITE_BOLD+"Opção Inválida");
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

}