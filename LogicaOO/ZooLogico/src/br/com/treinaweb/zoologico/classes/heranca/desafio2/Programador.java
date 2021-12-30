package br.com.treinaweb.zoologico.classes.heranca.desafio2;


/* 
 * Contenha uma propriedade privada linguagem textual; ok
 * A proprieade deve ser iniciada no construtor da classe; ok 
 * Sobrescreva o método showInfo() da superclasse; ok
 * Exiba os dados do "Programador". ok
 * */


public class Programador extends Pessoa {
	private String linguagem;
	
	public String getLinguagem() {
		return linguagem;
	}	
	
	public void setLinguagem(String linguagem) {
		this.linguagem = linguagem;
	}
	
	public Programador(String nome, int idade, String linguagem) {
		super(nome, idade);
		this.setLinguagem(linguagem);
	}
	
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println(linguagem);
	}
	
}
