import java.util.Scanner;

public class Teste {
	Vetor dadosVetor = new Vetor();

	public static void main(String[] args) throws Exception {
		Vetor vetor = new Vetor();
		while (true) {
			switch (readString(menu()).charAt(0)) {
			case '1': vetor.insereFinal(readString("Digite o valor: ")); break;
			case '2': vetor.insereInicio(readString("Digite o valor: ")); break;
			case '3': vetor.get(readInteger("Digite a posi��o: ")); break;
			case '4': vetor.inserePosicao(); break;
			case '5': vetor.remove(0); break;
			case '6': vetor.remove(readInteger("Digite a posi��o: ")); break;
			case '7': System.exit(0); break;
			}
		}
	}

	private static String menu() {
		String menu = "";
		menu += "\nEscolha:";
		menu += "\n  1 - Inserir no final.";
		menu += "\n  2 - Inserir no inicio.";
		menu += "\n  3 - Verifica posi��o.";
		menu += "\n  4 - Inserir em uma posi��o.";
		menu += "\n  5 - Remover primeiro item.";
		menu += "\n  6 - Remover item em uma posi��o.";
		menu += "\n  7 - Sair.";
		menu += "\nEscolha: ";
		return menu;
	}

	public static String readString(String msg) {
		Scanner input = new Scanner(System.in);
		System.out.print(msg);
		return input.nextLine();
	}

	public static int readInteger(String msg) {
		Scanner input = new Scanner(System.in);
		System.out.print(msg);
		return input.nextInt();
	}	
}
