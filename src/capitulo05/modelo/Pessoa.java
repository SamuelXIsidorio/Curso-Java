package capitulo05.modelo;

public class Pessoa {
	public String nome;
	public int idade;
	public char sexo;
	
	public Pessoa() {
		super(); //	REFERÊNCIA A SUPERCLASSE
	}
	
	public Pessoa(String nome, int idade, char sexo) {
		super(); //	REFERÊNCIA A SUPERCLASSE
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}
	
	public void falar(String fala) {
		System.out.println(nome + " esta falando: " + fala);
	}
	
	public void mostrarDados() {
		System.out.printf("Nome: %s \nIdade: %d \nSexo: %c",
				this.nome, this.idade, this.sexo);
	}

	public String toString() {
		return super.toString() + "\nPessoa: " + this.nome;
	}
}
