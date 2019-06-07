package capitulo02;

import capitulo02.enumeracoes.SexoVO;

public class App {
	public static void main(String[] args) {
		System.out.println(SexoVO.MASCULINO);
		
		SexoVO opcao = SexoVO.FEMININO;
		System.out.println(opcao);
		
		String escolha = SexoVO.OUTRO.toString();
		System.out.println(escolha);
		
		Pessoa p;
		p = new Pessoa(); // INSTANCIAÇÃO
		
		System.out.println(p);
		
		
		
	}
}
