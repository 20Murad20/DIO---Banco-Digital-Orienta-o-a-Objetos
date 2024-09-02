package banco;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	public void Extrato() {
		System.out.println("========================");
		System.out.println("Extrato Da Conta Poupança");
		System.out.println(saldo);
		System.out.println(agencia);
		System.out.println(numero);
		System.out.println(cliente.getNome());
	}
}
