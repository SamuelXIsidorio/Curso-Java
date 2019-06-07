package capitulo09.laboratorio;

public class Professor extends Pessoa {

	private float salario;
	private String disciplina;
	
	public Professor(String nome, int idade, char sexo, 
			int numeroRG, String dataNasc, 	float salario, String disciplina) {
		super(nome, idade, sexo, new RG(numeroRG, dataNasc));
		this.salario = salario;
		this.disciplina = disciplina;
	}
	
	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	@Override
	public void falar(String fala) {
		System.out.println(getNome() + ": "  + fala);
	}

	@Override
	public void mostrarDados() {
		System.out.printf("--- Professor: %s ---\n"
						+ "Idade: %d\n"
						+ "Sexo: %s\n"
						+ "Salario: %.2f\n"
						+ "Disciplina: %s\n"
						+ "Numero RG: %d\n"
						+ "Data de Nascimento: %s\n\n",
						getNome(), 
						getIdade(), 
						getSexo(),
						getSalario(), 
						getDisciplina(),
						getNumeroRg(),
						getDataNascimentoRG() );
	}

}
