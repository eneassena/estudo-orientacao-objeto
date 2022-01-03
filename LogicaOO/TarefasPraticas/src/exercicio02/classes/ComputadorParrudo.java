package exercicio02.classes;

import exercicio02.abstracts.Computador;

public class ComputadorParrudo extends Computador {
	
	private String corDoGabinete;
	
	public String getCorDoGabinete() {
		return corDoGabinete;
	}

	public void setCorDoGabinete(String corDoGabinete) {
		this.corDoGabinete = corDoGabinete;
	}

	public ComputadorParrudo(String nome, double preco, String dataFabricacao) {
		super(nome, preco);
		super.setDataFabricacao(dataFabricacao);
	}
	
	public ComputadorParrudo(String nome, double preco) {
		super(nome, preco); 
	}
	
	public ComputadorParrudo(String nome, double preco, String dataFabricacao, String corDoGabinete) {
		super(nome, preco, dataFabricacao);
		this.corDoGabinete = corDoGabinete;
	}
	
	public void jogarCS() {
		if(estaLigado()) {
			System.out.println("Jogo CS iniciando...");	
		} else {
			System.out.println("Computador Game esta Desligado...");
		}
		
	}
}
