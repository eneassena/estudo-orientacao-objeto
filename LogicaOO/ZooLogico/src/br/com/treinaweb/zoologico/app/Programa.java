package br.com.treinaweb.zoologico.app;


import br.com.treinaweb.zoologico.classes.Cachorro;
import br.com.treinaweb.zoologico.classes.Gato;
//import br.com.treinaweb.zoologico.classes.desafio1.Pessoa;
//import br.com.treinaweb.zoologico.classes.desafio3.Pessoa;

import java.util.*;
//import java.lang.reflect.*;


public class Programa {

	public static void main(String[] args)
	{
		
		Cachorro pep = new Cachorro("Pepi");
		Gato gap =new Gato("Xanin", "Marron");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("informe a idade do animal?\n ");
		pep.setIdade(input.nextInt());
		
		System.out.println("informe o total de patas do seu animal?\n ");
		pep.setTotalPatas(input.nextInt());
		
		System.out.print(pep.toString());
		
		
		
	}
	
	public void exemplo03() {
		
//		Scanner end = new Scanner(System.in);
//		Pessoa p = new Pessoa(end.nextLine()); // "Ana Paula"
//		p.setIdade(end.nextInt());
//		System.out.println(p.getNome());
//		System.out.println(p.getIdade());
		
	}
	public void exemplo02() {

//		Pessoa charley = new Pessoa();
//		Field[] allFields = Pessoa.class.getDeclaredFields();
//		for(Field item: allFields) {		
//			if(Modifier.isPublic(item.getModifiers())) {
//				System.out.println( item.getName() );	
//			}
//		}
//		Scanner entrada = new Scanner(System.in);		
//		charley.nome = entrada.nextLine();
//		charley.idade = entrada.nextInt();
//		System.out.println(charley.nome);
//		System.out.println(charley.idade);

	}
	public void exemplo01() {

//		Animal cachorro = new Animal("Bolinha", 4, 5);
//		cachorro.setIdade(5);
//		cachorro.setNome("Bolinha");
//		cachorro.setTotalPatas(4);
//		System.out.println("Ola o Animal " + cachorro.getNome() + ", possui " + cachorro.getTotalPatas() + " patas e tem " + cachorro.getIdade() + " anos");
//		cachorro.emitirBarulho();
//		if(cachorro.ehAdulto()) {
//			System.out.println("Animal � Adulto");
//		} else {
//			System.out.println("Animal � n�o Adulto");
//		}

	}
	
}
