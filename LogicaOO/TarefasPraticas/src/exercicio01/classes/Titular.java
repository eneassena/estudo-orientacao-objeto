package exercicio01.classes;
 

public class Titular {
	
	private String nome;
	private String sobrenome;
	private String cpf;
	private ContaBancaria contaBancaria;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public Titular(String nome, String sobrenome, String cpf, ContaBancaria cc) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
		this.contaBancaria = cc;
	}
	
	
	public void contaSacar(double valor) {
		contaBancaria.sacar(valor);
	}
	
	public void contaDepositar(double valor) {
		contaBancaria.depositar(valor);
	}
	
	
	public void extrato() {
		System.out.println("Seu Saldo eh: ");
		System.out.println(this.contaBancaria.verSaldo());
	}
}
