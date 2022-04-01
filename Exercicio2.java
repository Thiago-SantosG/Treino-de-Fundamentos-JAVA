package fundamentos;

import java.util.Scanner;

public class Exercicio2 {

	// Conversão de celsius para fahrenheit
	
		public static void main(String[] args) {
			
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("Digite a temperatura em fahrenheit: ");
			double fahrenheit = entrada.nextDouble();
			
			double conversao = (fahrenheit - 32) * 5.0/9.0;
			
			System.out.println("Valor em Celsius: " + conversao);
			
			entrada.close();
		}
}
