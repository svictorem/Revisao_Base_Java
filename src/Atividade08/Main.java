package Atividade08;

public class Main {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("Victor Em", "Gerente Chefe", 5500.99);
		
		f1.exibirDados();
		System.out.println("\n");
		f1.aumentarSalario(10.0);
		System.out.println("\n");
		f1.exibirDados();
	}

}
