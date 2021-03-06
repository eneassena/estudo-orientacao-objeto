package br.com.treinaweb.zoologico.classes;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {
	private String nome;
	
	private List<Animal> animais;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}	
	
	public Zoologico() {
		animais = new ArrayList<Animal>();
	}
	
	public void adicionarAnimal(Animal animalASerAdicionado) {
		animais.add(animalASerAdicionado);
	}
	
	// remover animal da lista
	public void removerAnimalDaLista(int indiceDoAnimal) {
		animais.remove(indiceDoAnimal);
	}
	
	// mostra animais
	public void listarAnimais() {
		
		System.out.printf("\nAnimais do Zool?gico %s\n", nome);
		
//		for(int i=0; i < animais.size(); i ++) {
//			System.out.println(animais.get(i).toString());
//		}
		
		for(Animal animal: animais) {
			System.out.println(animal.toString());
		}
		System.out.println();
	}
	
}
