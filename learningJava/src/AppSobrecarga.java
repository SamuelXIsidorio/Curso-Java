
public class AppSobrecarga {
	public static void main(String[] args) {
		TesteSobrecarga sobrecarga = new TesteSobrecarga();
		
		sobrecarga.metodo(3);
		sobrecarga.metodo(3.6,3);
		sobrecarga.metodo(8, 8.9);
		sobrecarga.metodo();
		
	}
}
