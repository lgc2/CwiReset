package aprendizadoJava.aula07Operadores;

import java.util.Scanner;

public class Operadores {
	
	private static int tamanhoArray;
	
	private static double[] numeros;
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de números que se deseja calcular a média: ");
		tamanhoArray = in.nextInt();
		
		numeros = new double[tamanhoArray];
		
		/*
		System.out.println("Digite o primeiro número: ");
		double num1 = in.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		double num2 = in.nextDouble();
		
		double soma = num1 + num2;
		
		System.out.println("A soma dos números é " + soma + ".");
		*/
		double soma = 0;
		int i = 0;
		while(i < tamanhoArray) {
			System.out.println("Digite o " + (i + 1) + "º número: ");
			numeros[i] = in.nextDouble();
			
			soma += numeros[i];	
			
			i++;
		}
		
		double mediaAritmetica = soma / numeros.length;
		
		System.out.println("A média aritmética é: " + mediaAritmetica + ".");
		
		in.close();
	}

}
