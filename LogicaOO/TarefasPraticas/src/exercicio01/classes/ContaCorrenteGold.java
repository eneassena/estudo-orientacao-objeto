package exercicio01.classes;

public class ContaCorrenteGold extends ContaBancaria  {

	public ContaCorrenteGold(String numero, Agencia agencia) {
		super(numero, agencia);
	}
	
	@Override
	public void depositar(double valor) {
		valor *= 3;
		super.saldo += valor;
	}
}
