package Atividade02;

public class Carro {
	String modelo;
	String marca;
	int ano;
	
	public Carro(String modelo, String marca, int ano) {
		this.modelo = modelo;
		this.marca = marca;
		this.ano = ano;
	}
	
	public void exibirInformacoes() {
		System.out.println("Modelo: " + modelo);
		System.out.println("Marca: " + marca);
		System.out.println("Ano: " + ano);
	}
}
