package br.com.treinaweb.zoologico.classes.heranca.desafio2;

public abstract class Pessoa {
	private String nome;
	private int idade;
	 
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public void showInfo() {
		System.out.println(nome);
		System.out.println(idade);
	}	
	
}
