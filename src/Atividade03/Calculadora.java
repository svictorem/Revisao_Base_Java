package Atividade03;

public class Calculadora {

	public static void main(String[] args) {
		double somar (double a, double b ) {
			return a + b;
		}
		double subtrair (double a, double b) {
			return a - b;
		}
		double multiplicar (double a, double b) {
			return a * b;		
		}
        double dividir( double a, double b) {
        	if (b != 0) {
        		return a / b;
        	} else {
        		System.out.println ("Não é possivel dividir por zero.");
        		return 0;
        	}
        }
	}

}
