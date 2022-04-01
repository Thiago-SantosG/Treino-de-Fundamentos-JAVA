package fundamentos;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu peso: ");
		double peso = entrada.nextDouble();
		
		System.out.println("Digite sua altura: ");
		double altura = entrada.nextDouble();
	
		double imc = peso / (altura * altura);
		
		System.out.printf("Seu IMC e: %.2f %n%n ", imc);
		
		String classificacao = imc <= 18.5 ? 
				"Magreza." : 
					imc >= 40.0 ? 
							"Obesidade Grave" : "Normal";
		
		System.out.println("Voce apresenta sinais de:  " + classificacao);
		
		entrada.close();
	}
}
