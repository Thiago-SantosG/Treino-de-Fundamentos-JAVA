package fundamentos;

import java.util.Scanner;

public class Exercicio4 {
	
//	Calculo de valor ao quadrado e ao cubo
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("DIgite o valor: ");
		double valor = entrada.nextDouble();
		
		double quadrado = Math.pow(valor, 2);
		
		double cubo = Math.pow(valor, 3);
		
		System.out.println("O valor ao quadrado e: " + quadrado + "\n O valor ao cubo e: " + cubo);
		
		entrada.close();
	}
}
