package Atidade01;

public class Main {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Ana Kelley", 30, 1.55);
		Pessoa p2 = new Pessoa("Victor", 31, 1.74);
		
		p1.exibirDados();
		System.out.println("\n");
		p2.exibirDados();
	}

}
