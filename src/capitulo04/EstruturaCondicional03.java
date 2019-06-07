package capitulo04;

public class EstruturaCondicional03 {
	public static void main(String[] args) {
		String pais = "Brasil";
		
		switch(pais) {
		case "Brasil": 
		case "Portugal":
			System.out.println("Bom dia");
			break;
		case "Argentina":
		case "Mexico" :
			System.out.println("Buenos dias");
			break;
		case "França":
			System.out.println("Bon Jour");
			break;
		default:
			System.out.println("Good Morning");
			break;
		}
		
	}
}
