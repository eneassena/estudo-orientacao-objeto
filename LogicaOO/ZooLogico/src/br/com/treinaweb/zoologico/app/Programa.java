package br.com.treinaweb.zoologico.app;


import br.com.treinaweb.zoologico.classes.Cachorro;
import br.com.treinaweb.zoologico.classes.Gato;
//import br.com.treinaweb.zoologico.classes.desafio1.Pessoa;
//import br.com.treinaweb.zoologico.classes.desafio3.Pessoa;

import java.util.*;
import java.lang.reflect.*;
import br.com.treinaweb.zoologico.classes.Animal;
import br.com.treinaweb.zoologico.classes.heranca.desafio2.Programador;
import br.com.treinaweb.zoologico.classes.heranca.desafio3.MeuLivro;



public class Programa {
	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		MeuLivro mylivro = new MeuLivro();
		mylivro.setTitulo("Senhor dos an�is");
		System.out.println(mylivro.getTitulo());
		
		
//		Programador eu = new Programador("eneas", 26, "PHP");
//		eu.showInfo();
		
//		Cachorro pep = new Cachorro("Pepi");
//		Gato xani =new Gato("Xanin", "Marron");
		
		// informa��es do cachorro
		// System.out.println("informe a idade do animal?\n ");
		// input.nextInt();
//		pep.setIdade(3);
//		pep.morrer();
//		xani.morrer();
		
		// System.out.println("informe o total de patas do seu animal?\n ");
		// input.nextInt();		
//		System.out.print(pep.toString());
//		System.out.println(pep.ehAdulto());
//		pep.emitirBarulho();
		 
		// informa��es do gato
//		xani.setIdade(1);
//		System.out.println(xani.toString());
//		System.out.println(xani.ehAdulto());
//		xani.emitirBarulho();
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
