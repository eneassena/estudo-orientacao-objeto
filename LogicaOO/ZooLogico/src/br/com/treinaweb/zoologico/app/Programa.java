package br.com.treinaweb.zoologico.app;


//import br.com.treinaweb.zoologico.classes.desafio1.Pessoa;
//import br.com.treinaweb.zoologico.classes.desafio3.Pessoa;
//import br.com.treinaweb.zoologico.classes.heranca.desafio2.Programador;
//import br.com.treinaweb.zoologico.classes.heranca.desafio3.MeuLivro;
//import br.com.treinaweb.zoologico.classes.interfaces.desafio1.Circulo;

import java.util.*;
import java.lang.reflect.*;
import br.com.treinaweb.zoologico.classes.*;
import br.com.treinaweb.zoologico.classes.desafiofinal.Departamento;
import br.com.treinaweb.zoologico.classes.desafiofinal.Funcionario;
import br.com.treinaweb.zoologico.classes.interfaces.desafio2.Calculadora;



public class Programa {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		Departamento dep = new Departamento();
		
		
		dep.adicionarFuncionario(new Funcionario("Ana"));
		dep.adicionarFuncionario(new Funcionario("Pedro"));
		dep.adicionarFuncionario(new Funcionario("Eneas"));
		
		
		dep.listarFuncionarios();
		
		
	}
	
	
	public void exemplo07() {
		/*Zoologico zoo = new Zoologico();
		Gato xani = new Gato("Xani", "Marron");
		Animal cachorro = new Cachorro("Pepi", 4, 3);
		Veterinario v = new Veterinario();
		
		zoo.setNome("En?as Produ??es");
		
		v.atenderAnimal(xani);
		v.atenderAnimal(cachorro);
		v.listarAnimalAtendidos();
		
		
		zoo.adicionarAnimal(xani);
		zoo.adicionarAnimal(cachorro);
		zoo.removerAnimalDaLista(1);
		zoo.listarAnimais();*/
	}
	
	public void exemplo06() {
		Calculadora c = new Calculadora();
		
		/*System.out.println("Number: ");
		int number = 8;//input.nextInt();
//		c.fatorial(number);
		System.out.printf("Fatorial de %d eh %d\n", number, c.fatorial(number));
//		System.out.printf("%d",c.fatorial(number));*/
	}
	public void exemplo05() {
		/*Circulo c = new Circulo();
		
		System.out.println("Raio: ");
		double raio = input.nextDouble();
		c.setRaio(raio);
		 
		System.out.printf("Area do Circulo eh: %.2f", c.area());*/
	}
	public void exemplo04() {
		// Gato pep = new Gato("Xani", "Marron");
		
		// LSP parte 1
		// Animal animal = new Gato("Pepi", 4, 3);

		// LSP parte 2
		Animavel animal = new Cachorro("Pepi", 4, 3);
		animal.morrer();
		// informa??es do cachorro
		// System.out.println("informe a idade do animal?\n ");
		//input.nextInt();
		// pep.setIdade(3);
		// pep.morrer(); 
		
		// informa??es do Cachorro
		// System.out.println("informe o total de patas do seu animal?\n ");
		//input.nextInt();		
		System.out.print(animal.toString());
		System.out.println(animal.ehAdulto());
		animal.emitirBarulho();	
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
//			System.out.println("Animal ? Adulto");
//		} else {
//			System.out.println("Animal ? n?o Adulto");
//		}
	}	
}
