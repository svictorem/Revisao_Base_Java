package Atividade10;

public class Livro {
	String titulo, autor;
	int isbn;
	boolean disponivel;
	
	public Livro(String titulo, String autor, int isbn) {
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		this.disponivel = true;
	}
	
	public void emprestar() {
		if(disponivel) {
			disponivel = false;
			System.out.println("Empréstimo do Livro " + titulo + " realizado com sucesso!");
		}else {
			System.out.println("O livro " + titulo + " está indeiponivel para empréstimo!");
		}
	}
	
	public void devolver() {
		if(!disponivel) {
			disponivel = true;
			System.out.println("Devolução do livro " + titulo + " realizada com sucesso!");
		}else {
			System.out.println("O livro já se encontra na biblioteca, então não tem como devolver!");
		}
	}
	
	public void exibir() {
		String status = disponivel ? "Disponível para empréstimo" : "Emprestado";
        
        System.out.println("\n--- DETALHES DO LIVRO ---");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + isbn);
        System.out.println("Status: " + status);
        System.out.println("-------------------------");
	}
}
