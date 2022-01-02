package exercicio01.app;

import exercicio01.classes.Agencia;
import exercicio01.classes.ContaBancaria;
import exercicio01.classes.ContaCorrente;
import exercicio01.classes.ContaCorrenteFlex;
import exercicio01.classes.ContaCorrenteGold;
import exercicio01.classes.Titular;


public class Main {
	
	public static void main(String[] args) {
		
		Agencia ag = new Agencia("Bradesco");
		
		ContaBancaria cc  = new ContaCorrenteGold("00032164-5", ag);
		
		
		Titular t = new Titular("Jose", "Oliveira", "7981564564", cc);
		t.contaDepositar(1000);
		t.contaSacar(500);
		t.contaDepositar(5000);
		t.contaSacar(6000);
		t.extrato();
		
		
		
		
	}
	
}
