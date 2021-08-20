package aprendizadoJava.aula10ArraysVetores;

import java.util.Scanner;

public class Aula10Ex1 {

	public static void main(String[] args) {

		int[] valores = new int[5];
		int[] valoresMultiplicados = new int[5];
				
		Scanner in = new Scanner(System.in);
		
		for(int i = 0; i < valores.length; i++) {
			
			System.out.println("Informe o " + (i + 1) + "º valor:");
			valores[i] = in.nextInt();
		}
		
		for(int i = 0; i < valores.length; i++) {
			
			valoresMultiplicados[i] = valores[i] * 2;
		}
		
		for(int i = 0; i < valores.length; i++) {
			System.out.println("Valor " + (i + 1) + ": " + valores[i]);
			System.out.println("Valor dobrado " + (i + 1) + ": " + valoresMultiplicados[i]);
			System.out.println("");
		}
		
		in.close();
	}

}
