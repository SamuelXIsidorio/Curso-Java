package capitulo09.laboratorio;

public abstract class Pessoa {
	private String nome;
	private int idade;
	private char sexo;
	private RG rg;
	
	public Pessoa(String nome, int idade, char sexo, RG rg) {
		this.nome =  nome;
		this.idade = idade;
		this.sexo = sexo;
		this.rg = rg;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public char getSexo() {
		return sexo;
	}
	
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	public RG getRG() {
		return rg;
	}
	
	public void setRG(RG rg) {
		this.rg = rg;
	}
	
	public int getNumeroRg() {
		return getRG().getNumero();
	}
	
	public String getDataNascimentoRG() {
		return getRG().getDataNasc();
	}
	
	public abstract void falar(String fala);
	public abstract void mostrarDados();
}
