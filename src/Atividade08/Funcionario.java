package Atividade08;

public class Funcionario {
	String nome, cargo;
	double salario;
	
	public Funcionario(String nome, String cargo, double salario) {
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
	}
	
	public double aumentarSalario(double percentual) {
		salario += salario * (percentual / 100);
		System.out.println("Aumento de " + percentual + " aplicado com sucesso!");
		return percentual;
	}
	
	public void exibirDados() {
		System.out.println("Nome: " + nome);
		System.out.println("Cargo: " + cargo);
		System.out.printf("Salario: %.2f", salario);
	}
}
