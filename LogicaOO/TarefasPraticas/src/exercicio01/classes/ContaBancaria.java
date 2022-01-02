package exercicio01.classes;

import exercicio01.interfaces.ContaBancariaInterface;

public abstract class ContaBancaria implements ContaBancariaInterface {
	
	protected String numero;
	protected double saldo;
	protected Agencia agencia;
	
	protected void setNumero(String numero) {
		this.numero = numero;
	}
	
	protected String getNumero() {
		return numero;
	}
	
	protected double verSaldo() {
		return saldo;
	}
	
	public ContaBancaria(String numero, Agencia agencia){
		saldo = 0;
		this.agencia = agencia;
		this.numero = numero;
	}
	
	
	@Override
	public final void sacar(double valor) {
		if (saldo >= valor) {
			saldo -= valor;
		}
	}
	
	@Override
	public void depositar(double valor) {
		saldo += valor;
	}
}
