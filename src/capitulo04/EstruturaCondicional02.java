package capitulo04;

public class EstruturaCondicional02 {
	public static void main(String[] args) {
		int optMenu = 4;
		
		//byte, short, int, char, String, Enum
		switch (optMenu) {
		case 1:
			System.out.println("Abir o programa");
			break;
		case 2:
			System.out.println("Gerar relatorios");
			break;
		case 3:
			System.out.println("Fechar o programa");
			break;
		default:
			System.out.println("Opção invalida");
			break;
		}
	}
}
