package br.com.treinaweb.encapsulamento.exercicio;

public class Paciente {

	private String nome;
	private String sobrenome;
	private int idade;
	private String sexo;
	private String telefone;
	private String endereco;
	
	public void setNome(String nome) { this.nome = nome; }
	public String getNome() { return this.nome; }
	
	public void setIdade(int idade) { this.idade= idade; }
	public int getIdade() { return this.idade; }
	
	public void setSexo(String sexo) { this.sexo = sexo; }
	public String getSexo() { return this.sexo; }
	
	public void setTelefone(String telefone) { this.telefone = telefone; }
	public String getTelefone() { return this.telefone; }
	
	public void setEndereco(String endereco) { this.endereco = endereco; }
	public String getEndereco() { return this.endereco; }	
	
	
	public void buscarConsultas() {
		// {...}
	}
	public void cancelarConsultas() {
		// {...}
	}
	public void marcar() {
		// {...}
	}
	public void remarcar() {
		// {...}
	}
}
