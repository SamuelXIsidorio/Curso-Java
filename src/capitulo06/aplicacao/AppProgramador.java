package capitulo06.aplicacao;

import capitulo06.modelo.Programador;

public class AppProgramador {
	public static void main(String[] args) {
		Programador p = new Programador();
		Programador r = new Programador();
		Programador s = new Programador();
		
		p.setCargo("Desenvolvedor Java");
		p.setSalario(5430.65);
		
		System.out.println(p.getCargo());
		System.out.println(p.getSalario());
		Programador.desenvolverSistema();
		
		p.matricula = 5;
		System.out.println(p.matricula);
		r.matricula = 8;
		System.out.println(r.matricula);
		s.matricula = 149;
		System.out.println(s.matricula);
		
		//Programador.matricula =  99;
		System.out.println(Programador.matricula);
		
		p.matricula = 34;
		System.out.println(p.matricula);
		System.out.println(Programador.matricula);
		
		Programador.matricula = 106;
		System.out.println(p.matricula);
		System.out.println(r.matricula);
		System.out.println(s.matricula);
		
		
		
	}
}
