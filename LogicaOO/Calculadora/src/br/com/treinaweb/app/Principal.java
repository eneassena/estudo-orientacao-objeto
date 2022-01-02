package br.com.treinaweb.app;

import br.com.treinaweb.fabricas.FabricaCalculadoraMatematica;
import br.com.treinaweb.interfaces.CalculadorMatematico;

public class Principal {

	public static void main(String[] args) {
		
		String calculo = "**";
		int numero1 = 5;
		int numero2 = 3;
		
		FabricaCalculadoraMatematica fabrica = new FabricaCalculadoraMatematica();
		 
		CalculadorMatematico calculador = fabrica.criarCalculador(numero1, numero2, calculo);
		
		if(calculador != null) {
			
			System.out.println("Objeto calculo criado " + calculador.calcular());
			
		} else {
			
			System.out.println("não eh possivel realizar calculo");
			
		}
		
		
	}
}
