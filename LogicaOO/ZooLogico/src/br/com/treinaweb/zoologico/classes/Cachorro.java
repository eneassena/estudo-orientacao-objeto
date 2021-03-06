package br.com.treinaweb.zoologico.classes;

 
public class Cachorro extends Animal {
	
	public Cachorro(String nome, int totalPatas, int idade) {
		super(nome, totalPatas, idade);
		super.setEspecie("Cachorro");
	}
	
	public Cachorro(String nome) {
		super(nome);
		super.setEspecie("Cachorro");
	}

	@Override
	public void emitirBarulho() {
		if(super.estaVivo)
			System.out.println("Barulho do Cachorro");
		else System.out.println("Animal "+this.getEspecie()+" Falecido");
	}
	
	@Override
	public boolean ehAdulto() {
		if(super.estaVivo)
			return super.getIdade() >= 1;
		return false; 
	}
	
	@Override
	public void morrer() {
		/* Evitando sobre escrita de m?todos
		 * Se na superclasse  o metodo morrer estiver na 
		 * sua assinatura a palavra chave final o metodo n?o poder? ser
		 * reescrita
		 * */
		estaVivo = false;
	}
}
