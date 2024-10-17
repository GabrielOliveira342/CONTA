//class main 
public class main {

	public main (String[] args) {
		
		Conta conta = new Conta (1000.00); //instanciando a class
		
		conta.consultarSaldo();
		conta.depositar(500.0); //adicionando o valor 
		conta.sacar(200.0); // adicionando o valor do saque 

		conta.consultarSaldo(); //exibir o saldo com a taxa
		conta.consultarSaldo();
		conta.consultarSaldo();
		conta.consultarSaldo();
	}

}

