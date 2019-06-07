package capitulo15.garagem;

public class Garagem {
	Object obj[];
	
	int qtdVagas;
	int vaga;
	
	public Garagem(int qtdVagas) {
		this.qtdVagas = qtdVagas;
		obj = new Object[qtdVagas];
	}
	
	public void estacionarCarro(Object obj) {
		this.obj[vaga] = obj;
		vaga++;
	}
	
	public void retirarCarro(int vaga) {
		obj[vaga] = null;
		
	}
	
	public void imprimeStatus() {
		for(Object objeto: obj) {
			if(objeto == null) {
				System.out.println("Vaga disponível!");
			} else {
				System.out.println(objeto);
			}
		}
	}
}
