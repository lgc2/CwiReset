package aprendizadoJava.aula09Loops;

import java.util.Scanner;

public class Loops3ComArray {
	
	private static double[] numeros;
	
	private static int tamanhoNumeros = 5;
	
	public static void main(String[] args) {
		numeros = new double[tamanhoNumeros];
		
		Scanner in = new Scanner(System.in);
		
		for(int i = 0; i < numeros.length; i++) {
			
			System.out.println("Informe o " + (i + 1) + "º" + " número: ");
			numeros[i] = in.nextDouble(); 
		}
		
		double maior = numeros[0];
		int indiceDoMaior = 0;
		
		for(int index = 0; index < numeros.length; index++) {
			if(numeros[index] > maior) {
				maior = numeros[index];
				indiceDoMaior = index;				
			}
		}
		
		System.out.println("O " + (indiceDoMaior + 1) + "º número é o maior: " + maior + "!" );		
	
		in.close();
	}
}
