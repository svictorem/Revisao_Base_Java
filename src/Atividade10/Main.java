package Atividade10;

public class Main {

	public static void main(String[] args) {
		Livro l1 = new Livro("O Código Da Vinci", "Dan Brown", 978857);
		
		l1.exibir();
		l1.emprestar();
		
		l1.exibir();
		l1.emprestar();
		
		l1.devolver();
		l1.exibir();
	}

}
