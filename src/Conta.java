
//class conta 
class Conta {
	
	private double saldo; 
	private int consultas; 
//construtores e o parametro 
public Conta (double saldoInicial) {
		this.saldo = saldoInicial;
		this.consultas = 0;
	}
//metodo para depositar 
public void depositar (double valor) {
	if (valor > 0) {
		double taxa = valor * 0.01; //aplica o valor da taxa
		saldo += (valor - taxa);
		System.out.println("Deposito de R$ "+ valor + "realizado com sucesso.");
	} else {
		System.out.println("Valor de deposito invalido");
	}
}
//metodo para sacar 
public void sacar (double valor) {
		double taxa = valor * 0.005; //atribuindo a taxa 
		double valorTotal = valor + taxa; // somando a taxa 
		
		if (valor > 0 && saldo >= valorTotal) {
			saldo -=valorTotal;	
			System.out.println("Saque de R$ "+ valor + "realizado com sucesso");
		} else {
			System.out.println("Saldo insuficiente");
		}
}
//metodo para consultar o saldo 
public void consultarSaldo () {
		consultas++;
		
		if (consultas % 5 == 0) { //if para visualiar o saldo com a taxa 
			saldo -= 0.10;
			System.out.println("Consulta de saldo realizada, Taxa de R$ 0,10 cobrada");
		} else {
			System.out.println("Consulta de saldo realizada");
		}
		System.out.println("Saldo atual: R$ "+saldo );
}

}