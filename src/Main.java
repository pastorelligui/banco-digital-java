
public class Main {
		public static void main(String[] args) {
			
			Cliente guilherme = new Cliente();
			guilherme.setNome("Guilherme Pastorelli");
			
			Conta cc = new ContaCorrente(guilherme);
			Conta poupanca = new ContaPoupanca(guilherme);
			
			cc.depositar(100);
			cc.transferir(100, poupanca);
			
			
			cc.imprimirExtrato();
			poupanca.imprimirExtrato();
		}
}
