package fundamentos;

import java.util.Scanner;

public class Exercicio5 {

//	 Calculo da area de um triangulo
	
	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);
		 
		 System.out.println("Digite a base: ");
		 double base = entrada.nextDouble();
		 
		 System.out.println("Digite a altura: ");
		 double altura = entrada.nextDouble();
		 
		 double area = (altura * base) / 2;
		 
		 System.out.println("A area e de: " + area);
		 
		 entrada.close();
	}
}
