package exercicio02.classes;

import exercicio02.abstracts.Computador;

public class ComputadorSimples extends Computador{

	public ComputadorSimples(String nome, double preco) {
		super(nome, preco);
	}
	
	public void jogarPaciencia() {
		if(estaLigado()) {
			System.out.println("Jogando paciência");	
		} else {
			System.out.println("Computador Simples esta desligador...");
		}
		
	}
	
}
