package capitulo09.laboratorio;

public class Lab01 {
	public static void main(String[] args) {
		Pessoa rafael = new Professor("Rafael", 32, 'M', 456789123, 
											"01/03/1985", 4325.88F, "PHP");
		Pessoa manuel = new Aluno("Manuel", 25, 'M', 789456123, "16/05/1990", 565.78F, "PHP");
		Pessoa claudia = new Aluno("Claudia", 22, 'F', 147852369, "25/08/1996", 458.78F, "PHP");
		
		rafael.falar("Manuel?");
		manuel.falar("Presente!");
		rafael.falar("Claudia?");
		claudia.falar("Presente!");
		
		System.out.println();
		rafael.mostrarDados();
		manuel.mostrarDados();
		claudia.mostrarDados();
	}
}
