package exercicio01.classes;

public class ContaCorrenteFlex extends ContaBancaria {

	public ContaCorrenteFlex(String numero, Agencia agencia) {
		super(numero, agencia);
	}
	
	@Override
	public void depositar(double valor) {
		valor *= 2;
		super.saldo += valor; 
	}
}
