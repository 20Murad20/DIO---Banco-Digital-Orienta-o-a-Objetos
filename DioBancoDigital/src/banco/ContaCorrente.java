package banco;

public class ContaCorrente extends Conta{

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	public void Extrato() {
		System.out.println("========================");
		System.out.println("Extrato Da Conta Corrente");
		System.out.println(saldo);
		System.out.println(agencia);
		System.out.println(numero);
		System.out.println(cliente.getNome());
	}
	
}
