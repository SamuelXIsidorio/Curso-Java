package capitulo11;

public class PessoaApp {
	public static void main(String[] args) {
		Pessoa fulano = new Pessoa();
		try{
			fulano.setNome("");
		} catch (CadastroException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(fulano.getNome());
		
	}
}
