package capitulo10;

public class AppEletrodomestico {
	public static void main(String[] args) {
		
		Eletrodomestico a, b, c ,d ,e, f;
		a = new Geladeira();
//		b = new Microondas();
//		c = new Televisao();
//		d = new Televisao();
//		e = new Microondas();
//		f = new Geladeira();
//		
//		Eletrodomestico.ligarTudo(a, b, c, d, e, f);

		a.ligar();
		a.acionarTimer(1);
	}
}
