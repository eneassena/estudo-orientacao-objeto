package br.com.treinaweb.zoologico.classes;

public class Gato extends Animal {
	public String corPelo;

	public String getCorPelo() {
		return corPelo;
	}

 
	public Gato(String nome, int totalPatas, int idade) {
		super(nome, totalPatas, idade);
	}
	
	public Gato(String nome) {
		super(nome); 
	}
	
	public Gato(String nome, String CorPelo) {
		super(nome);
		this.corPelo = CorPelo;
	}
	
	
	
	
}
