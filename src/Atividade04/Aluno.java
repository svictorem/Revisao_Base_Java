package Atividade04;

public class Aluno {
	String nome;
	double nota1, nota2;
	
	public Aluno(String nome, double nota1, double nota2) {
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}
	
	public double calcularMedia() {
		return (nota1 + nota2) / 2;
	}
	
	public void verificarSituacao() {
		double media = calcularMedia();
		
		System.out.println("\n--- SITUAÇÃO DO ALUNO ---");
		System.out.println("Nome: " + nome);
		System.out.println("Média: " + media);
		
		if (media >= 6.0) {
            System.out.println("Situação: APROVADO");
        } else if (media >= 5.0) {
            System.out.println("Situação: RECUPERAÇÃO");
        } else {
            System.out.println("Situação: REPROVADO");
        }
        System.out.println("-------------------------");
	}
}
