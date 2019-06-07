package capitulo11;

public class Pessoa {
	private String nome;

	public Pessoa() {

	}

	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) throws CadastroException {
		if(nome != "") {
			this.nome = nome;
		} else {
			throw new CadastroException("Nome não pode ser vazio!");
		}
	}
}
