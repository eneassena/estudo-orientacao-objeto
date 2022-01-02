package br.com.treinaweb.fabricas;

import br.com.treinaweb.interfaces.CalculadorMatematico;
import br.com.treinaweb.calculadora.classes.Adicao;
import br.com.treinaweb.calculadora.classes.Divisao;
import br.com.treinaweb.calculadora.classes.Multiplicacao;
import br.com.treinaweb.calculadora.classes.Potencia;
import br.com.treinaweb.calculadora.classes.Subtracao;


public class FabricaCalculadoraMatematica {

	public CalculadorMatematico criarCalculador(int numero1, int numero2, String calculo) 
	{
		switch(calculo) 
		{
			case "+":
				return new Adicao(numero1, numero2);
			case "-":
				return new Subtracao(numero1, numero2);
			case "*":
				return new Multiplicacao(numero1, numero2);
			case "/":
				return new Divisao(numero1, numero2);
			case "**":
				return new Potencia(numero1, numero2);
			default:
				return null;				
		}
	}
}
