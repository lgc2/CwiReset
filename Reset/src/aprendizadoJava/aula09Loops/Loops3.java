package aprendizadoJava.aula09Loops;

import java.util.Scanner;

public class Loops3 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double numero;
		double maior = Double.MIN_VALUE;
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Informe um número:");
			numero = in.nextDouble();
			
			if(numero > maior) {
				maior = numero;
			}
		}
		
		System.out.println("O maior número é " + maior);
		
		/*
		System.out.println("Informe o primeiro número: ");
		double num1 = in.nextDouble();
		
		System.out.println("Informe o segundo número: ");
		double num2 = in.nextDouble();
		
		System.out.println("Informe o terceiro número: ");
		double num3 = in.nextDouble();
		
		System.out.println("Informe o quarto número: ");
		double num4 = in.nextDouble();
		
		System.out.println("Informe o quinto número: ");
		double num5 = in.nextDouble();
		
		double maior = num1;
		
		if(num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5) {
			System.out.println("O maior número é " + num2 + "!");
		} else if(num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5) {
			System.out.println("O maior número é " + num3 + "!");
		} else if(num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5) {
			System.out.println("O maior número é " + num4 + "!");
		} else if(num5 > num1 && num5 > num2 && num5 > num3 && num5 > num4) {
			System.out.println("O maior número é " + num5 + "!");
		} else {
			System.out.println("O maior número é " + num1 + "!");
		}
		*/
		
		in.close();		
	}
}
