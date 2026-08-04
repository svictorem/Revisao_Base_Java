package Atividade07;

public class Retangulo {
	double base, altura;
	
	public Retangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public double calcularArea(){
		return base * altura;
	}

	public double perimetro() {
		return 2 * (base + altura);
	}
}