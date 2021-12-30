package br.com.treinaweb.zoologico.classes;

public abstract class Animal {
	
	private String nome;
	private int totalPatas;
	private int idade;	
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getTotalPatas() {
		return this.totalPatas;
	}
	
	public void setTotalPatas(int totalPatas) {
		this.totalPatas = totalPatas;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public Animal(String nome, int totalPatas, int idade) {
		this.setNome(nome);
		this.setTotalPatas(totalPatas);
		this.setIdade(idade);
	}
	
	public Animal (String nome) {
		this.setNome(nome);
	}
	
	public void emitirBarulho() {
		System.out.println("Som De Animal");
	}
	
	public boolean ehAdulto() {
		return this.idade >= 1;
	}
	
	public String toString() {
		return "Nome: " + this.getNome() + " Idade: "+ this.getIdade() + " Total de Patas: "+ this.getTotalPatas();
	}
}
