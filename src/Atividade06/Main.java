package Atividade06;

public class Main {

	public static void main(String[] args) {
		ContaBancaria cb1 = new ContaBancaria("Zask", 500.99);
		
		cb1.consultarSaldo();
		System.out.println("\n");
		cb1.depositar(200);
		System.out.println("\n");
		cb1.consultarSaldo();
		System.out.println("\n");
		cb1.sacar(500);
		System.out.println("\n");
		cb1.consultarSaldo();
	}

}
