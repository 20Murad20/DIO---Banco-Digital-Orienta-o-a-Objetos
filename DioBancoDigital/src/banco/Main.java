package banco;

public class Main {
	
	public static void main(String[] args) {
		
		Cliente C1 = new Cliente();
		Cliente C2 = new Cliente();
		C1.setNome("Peter Benjamin Parker");
		C2.setNome("Anthony Edward Stark");
		
		ContaCorrente CC = new ContaCorrente(C1);
		ContaPoupanca CP = new ContaPoupanca(C2);
		
		
		CC.depositar(1000,true);
		CC.transferir(300, CP);
		CP.sacar(150,true);
		CC.Extrato();
		CP.Extrato();
	}

}
