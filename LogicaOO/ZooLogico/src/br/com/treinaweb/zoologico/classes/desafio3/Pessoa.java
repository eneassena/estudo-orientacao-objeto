package br.com.treinaweb.zoologico.classes.desafio3;

public class Pessoa {
	
	private String nome;
	private int idade;
	
	public String getNome() {
		return this.nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public Pessoa(String nome){
		this.nome = nome;
	}
}
 