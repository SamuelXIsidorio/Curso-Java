package capitulo09;

public class Aluno extends Pessoa {
	
	String curso;
	int matricula;
	double mensalidade;
	
	public Aluno() {
	}
	
	public Aluno(String nome, String sobrenome, int idade, char sexo,
				String curso, int matricula, double mensalidade) {
		super(nome, sobrenome, idade, sexo);
		this.curso = curso;
		this.matricula = matricula;
		this.mensalidade = mensalidade;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public double getMensalidade() {
		return mensalidade;
	}

	public void setMensalidade(double mensalidade) {
		this.mensalidade = mensalidade;
	}

	@Override
	public void mostrarDados() {
		System.out.println("**** "+getClass().getSimpleName()+" ****");
		System.out.println("Nome: " + getNome());
		System.out.println("Sobrenome: "  +  getSobrenome());
		System.out.println("Idade: " +  getIdade());
		System.out.println("Sexo: " + getSexo());
		System.out.println("Curso: " + getCurso());
		System.out.println("Matricula: " + getMatricula());
		System.out.println("Mesalidade: " + getMensalidade());
		System.out.println("--------------------------\n");
	}
	
	
}
