package capitulo09.laboratorio;

public class Aluno extends Pessoa {
	
	private float mensalidade;
	private String curso;
	
	public Aluno(String nome, int idade, char sexo, int numeroRG,
				String dataNasc, float mensalidade, String curso) {
		super(nome, idade, sexo, new RG(numeroRG, dataNasc));
		this.mensalidade = mensalidade;
		this.curso = curso;
	}
	
	public float getMensalidade() {
		return mensalidade;
	}
	
	public void setMensalidade(float mensalidade) {
		this.mensalidade = mensalidade;
	}
	
	public String getCurso() {
		return curso;
	}
	
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	@Override
	public void falar(String fala) {
		System.out.println(getNome() + ": " +  fala);
	}

	@Override
	public void mostrarDados() {
		System.out.printf("--- Aluno: %s ---\n"
				+ "Idade: %d\n"
				+ "Sexo: %s\n"
				+ "Mensalidade: %.2f\n"
				+ "Curso: %s\n"
				+ "Numero RG: %d\n"
				+ "Data de Nascimento: %s\n\n",
				getNome(), 
				getIdade(), 
				getSexo(),
				getMensalidade(), 
				getCurso(),
				getNumeroRg(),
				getDataNascimentoRG() );
	}

}
