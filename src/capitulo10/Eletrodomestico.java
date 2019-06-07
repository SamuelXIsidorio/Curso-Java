package capitulo10;

public interface Eletrodomestico {
	void ligar();
	void desligar();
	
	static void ligarTudo(Eletrodomestico... eletrodomesticos) {
		for (Eletrodomestico eletrodomestico : eletrodomesticos) {
			eletrodomestico.ligar();
		}
	}
	
	default void acionarTimer(int minutos) {
		try {
			System.out.println("Timer acionado!");
			Thread.sleep(minutos *30000);
		} catch (Exception e) {
		}
		desligar();
	}
}
