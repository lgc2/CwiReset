package aprendizadoJava.aula09Loops;

import java.util.Scanner;

public class Loops3 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double numero;
		double maior = Double.MIN_VALUE;
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Informe um n�mero:");
			numero = in.nextDouble();
			
			if(numero > maior) {
				maior = numero;
			}
		}
		
		System.out.println("O maior n�mero � " + maior);
		
		/*
		System.out.println("Informe o primeiro n�mero: ");
		double num1 = in.nextDouble();
		
		System.out.println("Informe o segundo n�mero: ");
		double num2 = in.nextDouble();
		
		System.out.println("Informe o terceiro n�mero: ");
		double num3 = in.nextDouble();
		
		System.out.println("Informe o quarto n�mero: ");
		double num4 = in.nextDouble();
		
		System.out.println("Informe o quinto n�mero: ");
		double num5 = in.nextDouble();
		
		double maior = num1;
		
		if(num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5) {
			System.out.println("O maior n�mero � " + num2 + "!");
		} else if(num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5) {
			System.out.println("O maior n�mero � " + num3 + "!");
		} else if(num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5) {
			System.out.println("O maior n�mero � " + num4 + "!");
		} else if(num5 > num1 && num5 > num2 && num5 > num3 && num5 > num4) {
			System.out.println("O maior n�mero � " + num5 + "!");
		} else {
			System.out.println("O maior n�mero � " + num1 + "!");
		}
		*/
		
		in.close();		
	}
}
