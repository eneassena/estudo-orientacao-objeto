package exercicio02.classes;

import exercicio02.abstracts.Computador;

public class ComputadorGame extends Computador {
	
	private int quantidadeMemoria;

	public int getQuantidadeMemoria() {
		return quantidadeMemoria;
	}

	public void setQuantidadeMemoria(int quantidadeMemoria) {
		this.quantidadeMemoria = quantidadeMemoria;
	}
	public ComputadorGame(String nome, double preco, String dataFabricacao) {
		super(nome, preco, dataFabricacao);
	}
	
	public ComputadorGame(String nome, double preco) {
		super(nome, preco);
	}
	
	public ComputadorGame(String nome, double preco, String dataFabricacao, int quantidadeMemoria) {
		super(nome, preco, dataFabricacao);
		this.setQuantidadeMemoria(quantidadeMemoria);
	}
	
	public void jogarNeedForSpeed() {
		if(estaLigado()) {
			System.out.println("Inicilizando o jogo Need For Speed...");
		} else {
			System.out.println("Computador Game esta desligado");	
		}
		
	}
	
}
