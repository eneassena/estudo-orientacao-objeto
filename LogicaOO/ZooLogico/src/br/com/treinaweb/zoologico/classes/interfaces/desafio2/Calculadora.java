package br.com.treinaweb.zoologico.classes.interfaces.desafio2;

public class Calculadora implements Aritmetica {
	
	@Override
	public int fatorial(int number) {
		int fat = 1;
		
		if(number == 1 || number==0) {
			return number;
		}
		
		for(int n=1; number >= n; number --) {
			
			fat *= number;
		}
		
		return fat;
	}
}
