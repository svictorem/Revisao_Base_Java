package Atidade01;

public class Pessoa {
	String nome;
	int idade;
	double altura;
	
	public Pessoa(String nome, int idade, double altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}
	
	public void exibirDados() {
		System.out.println("Nome: " + nome);
		System.out.println("idade: " + idade);
		System.out.println("altura: " + altura);
		
	}

}
