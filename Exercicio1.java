package fundamentos;

import java.util.Scanner;

public class Exercicio1 {

// Conversão Fahrenheit para Celsius
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Digite a atual temperatura de sua cidade: ");
		double celsius = entrada.nextDouble();
		
		double conversao = ( celsius - 32 ) / 1.8;
		
		System.out.print("Valor em Farenheit: " + conversao);
	
		
		entrada.close();
	}
}
