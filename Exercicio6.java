package fundamentos;

import java.util.Scanner;

public class Exercicio6 {
	
//	Resolucao da equacao de segundo grau
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Equacao: ax² + bx + c = 0");
		
		System.out.println("\nDigite o valor de A: ");
		int a = entrada.nextInt();
		
		System.out.println("\nDigite o valor de B: ");
		int b = entrada.nextInt();
		
		System.out.println("\nDigite o valor de C: ");
		int c = entrada.nextInt();
		
		int delta = (b * b) - (4 * a * c);
		
		System.out.printf("\nSua equacao e: %dx² + %dx + %d = 0", a, b, c);
		
		System.out.println("\nO deltae: " + delta);
		
		double x1 = (-b + Math.sqrt(delta)) / (2 * a);
		
		System.out.printf("O x1 da equacao e: %.2f", x1);
		
		double x2 = (-b - Math.sqrt(delta)) / (2 * a);
		
		System.out.printf("\nO x2 da equacao e: %.2f", x2);
		
		entrada.close();
	}
}
