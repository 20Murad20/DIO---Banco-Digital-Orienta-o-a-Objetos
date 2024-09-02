package banco;

public class Conta {
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	
	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}

	public void sacar(double valor, boolean mostrarMensagem)
	{	if (mostrarMensagem == true)
		{
			System.out.println("========================");
			System.out.println("Sacando " + valor);
		}
		this.saldo -= valor;
	}
	
	public void depositar(double valor, boolean mostrarMensagem)
	{	if (mostrarMensagem == true)
		{
			System.out.println("========================");
			System.out.println("Depositando " + valor);
		}
		this.saldo += valor;
	}
	
	public void transferir(double valor, Conta destino) 
	{	System.out.println("========================");
		sacar(valor,false);
		destino.depositar(valor,false);
		System.out.println("Transferindo " + valor + " Para " + destino.cliente.getNome());
	}
	
	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

}
