package capitulo10;

public class AppInterface implements ExemploInterface01{
	public static void main(String[] args) {
		ExemploInterface01 ex = new AppInterface();
		ex.teste2();
		
		ExemploInterface01.teste3();
		
	}

	@Override
	public void teste() {
		// TODO Auto-generated method stub
		
	}
}
