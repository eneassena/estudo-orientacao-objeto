package exercicio02.fabricas;

import exercicio02.classes.ComputadorParrudo;
import exercicio02.abstracts.Computador;
import exercicio02.classes.ComputadorGame;
import exercicio02.classes.ComputadorSimples;

public class FabricaComputador {
 
	public static ComputadorSimples criaComputadorSimples(String nome, double preco) {
		return new ComputadorSimples(nome, preco);
	}
	
	public static ComputadorParrudo criaComputadorParrudo(String nome, double preco) {
		return new ComputadorParrudo(nome, preco);
	}
	
	public static ComputadorGame criaComputadorGame(String nome, double preco) {
		return new ComputadorGame(nome, preco);
	}
	
	public Computador criarComputador(String nome, double preco, String tipoComputador) {
		switch(tipoComputador) {
			case "simples":
				return FabricaComputador.criaComputadorSimples(nome, preco);
			case "parrudo":
				return FabricaComputador.criaComputadorParrudo(nome, preco);
			case "game":
				return FabricaComputador.criaComputadorGame(nome, preco);
				default:
					return null;
			}
	}

}
