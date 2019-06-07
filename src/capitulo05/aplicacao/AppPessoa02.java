package capitulo05.aplicacao;

import capitulo05.modelo.Pessoa;

public class AppPessoa02 {
	public static void main(String[] args) {
		//Pessoa p1; // VARI�VEL N�O INICIALIZADA, N�O ACESSA OS ATRIBUTOS E NEM M�TODOS
		//p1.nome = "Diego"; ISSO SERIA UM ERRO DE COMPILA��O
		
		Pessoa antonia = new Pessoa();
		Pessoa marcos = new Pessoa();
		
		antonia.nome = "Ant�nia";
		antonia.idade = 45;
		antonia.sexo = 'F';
		
		marcos.nome = "Marcos";
		marcos.idade = 29;
		marcos.sexo = 'M';
		
		// NESTE MOMENTO AMBOS OS IDENTIFICADORES APONTAM PARA O MESMO LOCAL NA MEM�RIA
		marcos = antonia; 
		marcos.sexo = 'M';
		
		System.out.println("Dados da Ant�nia");
		System.out.println(antonia);
		antonia.mostrarDados();
		
		System.out.println("\n");
		
		System.out.println("Dados do Marcos");
		System.out.println(marcos);
		marcos.mostrarDados();
	}
}
