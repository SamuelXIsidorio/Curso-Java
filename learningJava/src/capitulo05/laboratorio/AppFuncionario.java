package capitulo05.laboratorio;

public class AppFuncionario {
	public static void main(String[] args) {
		Funcionario func = new Funcionario();
		
		func.nome = "Edmilson";
		func.sobrenome = "Silva";
		func.cargo = "Desenvolvedor Java Jr";
		func.salario = 2890.50;
		
		System.out.println("Nome: " + func.nome);
		System.out.println("Sobrenome: " + func.sobrenome);
		System.out.println("Cargo: " + func.cargo);
		System.out.println("Salario: " + func.salario);
	}
}
