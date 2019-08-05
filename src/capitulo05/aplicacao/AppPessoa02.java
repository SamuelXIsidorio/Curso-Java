package capitulo05.aplicacao;

import capitulo05.modelo.Pessoa;

public class AppPessoa02 {
	public static void main(String[] args) {
		//Pessoa p1; // VARIÁVEL NÃO INICIALIZADA, NÃO ACESSA OS ATRIBUTOS E NEM MÉTODOS
		//p1.nome = "Diego"; ISSO SERIA UM ERRO DE COMPILAÇÃO
		
		Pessoa antonia = new Pessoa();
		Pessoa marcos = new Pessoa();
		
		antonia.nome = "Antônia";
		antonia.idade = 45;
		antonia.sexo = 'F';
		
		marcos.nome = "Marcos";
		marcos.idade = 29;
		marcos.sexo = 'M';
		
		// NESTE MOMENTO AMBOS OS IDENTIFICADORES APONTAM PARA O MESMO LOCAL NA MEMÓRIA
		marcos = antonia; 
		marcos.sexo = 'M';
		
		System.out.println("Dados da Antônia");
		System.out.println(antonia);
		antonia.mostrarDados();
		
		System.out.println("\n");
		
		System.out.println("Dados do Marcos");
		System.out.println(marcos);
		marcos.mostrarDados();
	}
}
