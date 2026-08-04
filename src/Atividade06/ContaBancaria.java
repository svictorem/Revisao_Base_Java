package Atividade06;

public class ContaBancaria {
	String titular;
	double saldo;
	
	public ContaBancaria(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}
	
	public double depositar(double valor) {
		if(valor > 0) {
			saldo += valor;
			System.out.println("Deposito de R$ " + valor + " realizado com sucesso!");
		}else {
			System.out.println("Valor Invalido!");
		}
		return valor;
	}
	
	public double sacar(double valor) {
		if(valor > 0 && valor <= saldo) {
			saldo -= valor;
			System.out.println("Saque de R$ " + valor + " realizado com sucesso!");
		}else {
			System.out.println("Saldo Inválido!");
		}
		return valor;
	}
	
	public void consultarSaldo() {
		System.out.println("Saldo atual: " + saldo);
	}
}
