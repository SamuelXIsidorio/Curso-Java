package capitulo11;

public class ExemploException01 {	
	public static void main(String[] args) {
		int valores[] = new int[3];
		int nro = 0;
		
		try {
			valores[0] = 2;
			valores[1] = 6;
			valores[2] = 12;
			System.out.println(valores[0] / nro);
		} catch(ArrayIndexOutOfBoundsException | ArithmeticException  a) {
			System.out.println("Que pena, estamos com problema!");
		} catch(Exception e) {
			System.out.println("Contate o administrador! =X");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
 	}
}	
