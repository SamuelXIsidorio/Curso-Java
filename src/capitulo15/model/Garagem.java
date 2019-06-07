package capitulo15.model;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Garagem {
	List<Veiculo> veiculo = new ArrayList<>();
	int qtdVagas;
	int vaga;
	
	public Garagem() {
	}
	
	public Garagem(int qtdVagas) {
		this.qtdVagas = qtdVagas;
	}

	public List<Veiculo> getVeiculo() {
		return veiculo;
	}
	public void estacionar(Veiculo veiculo) {
		int vagasOcupadas = 0;
		for (int i = 0; i < this.veiculo.size(); i++) {
			vagasOcupadas++;
		}
		
		if(vagasOcupadas < qtdVagas) {
			this.veiculo.add(veiculo);
			JOptionPane.showMessageDialog(null, 
					veiculo.getModelo() + ", estacionado!", 
							"Sistema Garagem", 1);
		} else {
			JOptionPane.showMessageDialog(null, 
					veiculo.getModelo() + ", Não estacionado!\nGaragem Lotada!", 
					"Sistema Garagem", 1);
		}
	}
	
	public void remover(int vaga) {
		this.veiculo.remove(vaga);
	}
	
	public void remover(String placa) {
		int i = 0;
		
		while(i < this.veiculo.size()) {
			if(veiculo.get(i).getPlaca() == placa) {
				this.veiculo.remove(i);
				break;
			} else if(i == this.veiculo.size()-1){
				JOptionPane.showMessageDialog(null, 
						placa + ", Não encontrado!", 
						"Sistema Garagem", 1);
			}
			i++;
		}
	}
	
	public void imprimirSituacao() {
		StringBuilder result = new StringBuilder();
		result.append("** Situação da Garagem ***\n");
		this.veiculo.forEach(v -> result.append(v.toString()+"\n"));
		JOptionPane.showMessageDialog(null, result, "Sistema Garagem", 1);
	}
}
