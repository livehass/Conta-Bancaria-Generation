package conta;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int op;

		while (true) {
			System.out.println("***********************************************************\n"
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
					+ "***********************************************************\n");

			op = sc.nextInt();
			if (op == 9) {
				System.out.println("          BANCO DA GENERATION - LIDER NO SEGUIMENTO");
				sobre();
				sc.close();
				System.exit(0);
			}
			switch (op) {
			case 1:
				System.out.println("Criar conta \n\n");
				break;
			case 2:
				System.out.println("Listar todas as contas \n\n");
				break;
			case 3:
				System.out.println("Consultar todas as contas - por número\n\n");
				break;
			case 4:
				System.out.println("Atualizar dados da conta \n\n");
				break;
			case 5:
				System.out.println("Apagar conta\n\n");
				break;
			case 6:
				System.out.println("Sacar do saldo em conta \n\n");
				break;
			case 7:
				System.out.println("Depositar em conta\n\n");
				break;
			case 8:
				System.out.println("Transferir valores entre contas \n\n");
				break;
			default:
				System.out.println("Opção Inválida");
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
