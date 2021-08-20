package aprendizadoJava.aula08Condicionais1;

import java.util.Scanner;

public class Condicionais1 {
	
	private static double[] notas;
	
	private static int tamanhoNotas = 4;
	
	public static void main(String[] args) {
		notas = new double[tamanhoNotas];
				
		Scanner in = new Scanner(System.in);
		
		System.out.println("Informe a nota 1: ");
		notas[0] = in.nextDouble();
		
		System.out.println("Informe a nota 2: ");
		notas[1] = in.nextDouble();
		
		System.out.println("Informe a nota 3: ");
		notas[2] = in.nextDouble();
		
		System.out.println("Informe a nota 4: ");
		notas[3] = in.nextDouble();
		
		double media = (notas[0] + notas[1] + notas[2] + notas[3]) / notas.length;
		System.out.println("A média é " + media + ".");
		
		if(media < 7) {
			System.out.println("Aluno reprovado.");
		} else if(media < 10) {
			System.out.println("Aluno aprovado.");
		} else {
			System.out.println("Aluno aprovado com louvores.");
		}
		
		in.close();		
	}

}
