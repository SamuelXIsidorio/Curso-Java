package capitulo08;

import capitulo05.modelo.Pessoa;

public class Array04 {
	public static void main(String[] args) {
		 Pessoa listaPessoas[] = new Pessoa[8];
		 listaPessoas[0] = new Pessoa("Deivison", 28, 'M');
		 listaPessoas[1] = new Pessoa("Giovanna", 19, 'F');
		 listaPessoas[2] = new Pessoa("Marcos", 19, 'M');
		 listaPessoas[3] = new Pessoa("Leonardo", 21, 'M');
		 listaPessoas[4] = new Pessoa("Samuel", 19, 'M');
		 listaPessoas[5] = new Pessoa("Philip", 22, 'M');
		 listaPessoas[6] = new Pessoa("Gabriel",19,'M');
		 listaPessoas[7] = new Pessoa("Diego ", 30, 'M');
		 
		 for(Pessoa pessoa: listaPessoas) {
			 System.out.println(pessoa);
		 }
		 
	}
}
