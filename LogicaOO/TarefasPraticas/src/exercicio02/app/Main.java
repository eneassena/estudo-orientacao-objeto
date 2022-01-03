package exercicio02.app;

import exercicio02.abstracts.Computador;
import exercicio02.classes.ComputadorGame;
import exercicio02.classes.ComputadorParrudo;
import exercicio02.classes.ComputadorSimples;
import exercicio02.fabricas.FabricaComputador;

public class Main {

	public static void main(String[] args) {
		
		FabricaComputador fab = new FabricaComputador();
		
		Computador computador = fab.criarComputador("PC Simples", 1800, "simples");
		
		if(computador != null) {
			System.out.println("Computador criado com sucesso!");
			
			System.out.println("-------------------------------------");
			System.out.println("Informações do Computador Simples:");
			computador.setDataFabricacao("2010-03-05");
			System.out.println(computador.toString());
			computador.ligar();
			computador.acessarInternet();
			System.out.println("-------------------------------------");
		} else {
			System.out.println("computador não foi criado");
		}
		
		ComputadorSimples computadorSimples =  FabricaComputador.criaComputadorSimples("PC- Simples", 2500);
		ComputadorParrudo computadorParrudo =  FabricaComputador.criaComputadorParrudo("PC - Parrudo", 8000);
		ComputadorGame computadorGame =  FabricaComputador.criaComputadorGame("PC - Game", 15000);
		
		
		System.out.println("-------------------------------------");
		System.out.println("Informações do Computador Simples:");
		computadorSimples.setDataFabricacao("2011-06-01");
		
		System.out.println(computadorSimples.toString());
		computadorSimples.ligar();
		computadorSimples.acessarInternet();
		computadorSimples.jogarPaciencia();
		System.out.println("-------------------------------------");
		
		
		
		System.out.println("Informações do computador Parrudo");
		computadorParrudo.setDataFabricacao("2020-05-12");
		computadorParrudo.setCorDoGabinete("Preto e Vermelho");
		
		System.out.println(computadorParrudo.toString());
		computadorParrudo.ligar();
		computadorParrudo.acessarInternet();
		computadorParrudo.jogarCS();
		System.out.println("-------------------------------------");
		
		
		
		System.out.println("Informações do computador Game");
		computadorGame.setDataFabricacao("2020-01-10");
		computadorGame.setQuantidadeMemoria(665487);
		
		System.out.println(computadorGame.toString());
		computadorGame.ligar();
		computadorGame.acessarInternet();
		computadorGame.jogarNeedForSpeed();
		System.out.println("-------------------------------------");
		
	}
}
