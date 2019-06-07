package capitulo09;

public class Professor extends Pessoa {
	String disciplina;
	int nroRegistro;
	double salario;
	
	public Professor() {
		
	}
	
	public Professor(String nome, String sobrenome, int idade, char sexo, 
					String disciplina, int nroRegistro, double salario) {
		super(nome, sobrenome, idade, sexo);
		this.disciplina = disciplina;
		this.nroRegistro = nroRegistro;
		this.salario = salario;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public int getNroRegistro() {
		return nroRegistro;
	}

	public void setNroRegistro(int nroRegistro) {
		this.nroRegistro = nroRegistro;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	@Override
	public void mostrarDados() {
		System.out.println("**** "+getClass().getSimpleName()+" ****");
		System.out.println("Nome: " + getNome());
		System.out.println("Sobrenome: "  +  getSobrenome());
		System.out.println("Idade: " +  getIdade());
		System.out.println("Sexo: " + getSexo());
		System.out.println("Disciplina: " + getDisciplina());
		System.out.println("Registro: " + getNroRegistro());
		System.out.println("Salario: " + getSalario());
		System.out.println("--------------------------\n");
	}
}
