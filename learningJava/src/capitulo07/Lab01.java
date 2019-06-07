package capitulo07;

public class Lab01 {
	public static void main(String[] args) {
		
		Cadastro c1 = new Cadastro();
		Cadastro c2 = new Cadastro("Claudio", "Abreu");
		Cadastro c3  = new Cadastro("Lourdes", "Souza", 40);
		
		c1.mostrar();
		System.out.println();
		c2.mostrar();
		System.out.println();
		c3.mostrar();
	}
}
