package br.com.treinaweb.zoologico.classes;

public abstract class Animal implements Animavel {
	
	private String nome;
	private int totalPatas = 4;
	private int idade;
	private String especie;
	protected boolean estaVivo;
	
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
	
	public String getEspecie() {
		return this.especie;
	}
	
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	private boolean estaVivo() {
		return estaVivo;
	}
	
	public Animal(String nome, int totalPatas, int idade) {
		this.setNome(nome);
		this.setTotalPatas(totalPatas);
		this.setIdade(idade);
		this.estaVivo = true;
	}
	
	public Animal (String nome) {
		this.setNome(nome);
		this.estaVivo = true;
	}
	
	@Override
	public abstract void emitirBarulho();
	
	@Override
	public void morrer() {		
		if(estaVivo)
			this.estaVivo = false;
	}
	
	public String toString() {
		return "\nNome: " + this.getNome() 
				+ ", Idade: "+ this.getIdade() 
				+ ", Total de Patas: " + this.getTotalPatas()
				+ ", Especie: " + this.getEspecie()
				+ "\n";
	}
}
