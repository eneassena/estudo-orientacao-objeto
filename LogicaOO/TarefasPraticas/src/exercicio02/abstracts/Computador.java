package exercicio02.abstracts;

public abstract class Computador {
	
	protected String nome;
	protected double preco;
	protected String dataFabricacao;
	private Boolean ligado = false;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getDataFabricacao() {
		return dataFabricacao;
	}
	public void setDataFabricacao(String dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}
	
	public Computador(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public Computador(String nome, double preco, String dataFabricacao) {
		this.nome = nome;
		this.preco = preco;
		this.dataFabricacao = dataFabricacao;
	}
	
	
	public void ligar() {
		ligado = true;
	}
	
	public void desligar() {
		ligado = false;
	}
	
	public Boolean estaLigado() {
		return ligado;
	}
	
	public void acessarInternet() {
		System.out.println("conectado a internet...");
	}
	
	
	public String toString() {
		return "\nNome: " + nome
				+ ", Preço: " + preco 
				+ ", Data de Fabricação: " + dataFabricacao;
	}
}
