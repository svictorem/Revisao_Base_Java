package Atividade09;

public class Main {

	public static void main(String[] args) {
		ConversorTemperatura conversor = new ConversorTemperatura();
		
		double tempCelsius = 31.2;
		double tempFahrenheit = 77.9;
		
		double celsiusCalculado = conversor.celsiusParaFahrenheit(tempCelsius);
		double fahrenheitCalculado = conversor.fahrenheitParaCelsius(tempFahrenheit);
		
		System.out.printf("A temperatura %.1f Cº (Celsius) equivale a %.1f Fº (Fahrenheit)", tempCelsius, celsiusCalculado);
		System.out.printf("\nA temperatura %.1f Fº (Fahrenheit) equivale a %.1f Cº (Celsius)", tempFahrenheit, fahrenheitCalculado);

	}

}
