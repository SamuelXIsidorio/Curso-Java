package capitulo06;

import capitulo05.modelo.Pessoa;

public class AppMetodosExemplo {
	public static void main(String[] args) {
		Metodos01 m = new Metodos01();
		
		m.exemploMetodo01();
		String retornoMetodo = m.exemploRetorno();
		System.out.println(retornoMetodo);
		
		Pessoa p = m.exemploRetornoClasse();
		
		int valores[] = new int[5];
		valores[0] = 2;
		valores[1] = 18;
		valores[2] = 35;
		valores[3] = 65;
		valores[4] = 80;
		
		System.out.println(m.somarArray(valores));
		
		double salarios[] = new double[5];
		salarios[0] = 1250;
		salarios[1] = 1320.65;
		salarios[2] = 7895.90;
		salarios[3] = 5460.78;
		salarios[4] = 12854;
		
		double salarioNovos[] = m.aumentarSalario(salarios);
		for(double salario: salarioNovos) {
			System.out.printf("%,5.2f\n", salario);
		}
		System.out.println();
		for (double salario : salarios) {
			System.out.println(salario);
		}
		
		
	}
}
