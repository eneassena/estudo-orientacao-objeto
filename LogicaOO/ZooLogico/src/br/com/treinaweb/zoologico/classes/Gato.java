package br.com.treinaweb.zoologico.classes;

public class Gato extends Animal {
	public String corPelo;

	public String getCorPelo() {
		return corPelo;
	}

	public Gato(String nome, int totalPatas, int idade) {
		super(nome, totalPatas, idade);
		super.setEspecie("Gato");
	}
	
	public Gato(String nome) {
		super(nome);
		super.setEspecie("Gato");
	}
	
	public Gato(String nome, String CorPelo) {
		super(nome);
		this.corPelo = CorPelo;
		super.setEspecie("Gato");
	}
	
	@Override
	public boolean ehAdulto() {
		if(super.estaVivo) 
			return super.getIdade() >= 1;
		return false;
	}
	
	@Override
	public void emitirBarulho() {
		if(super.estaVivo) 
			System.out.println("Barulho do " + this.getEspecie());
		else System.out.println("Animal "+this.getEspecie()+" Falecido");
	}
	
	// sobrescrita do metodo de acesso getEspecie
	@Override
	public String getEspecie()
	{
		return super.getEspecie();
	} 
}
