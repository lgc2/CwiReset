package aprendizadoJava.aula10ArraysVetores;

import java.util.Arrays;
import java.util.Scanner;

public class Aula10Ex2 {

	public static void main(String[] args) {
		
		int[] idades = new int[10];
		int[] maiores = new int[10];
		int index = 0;
		
		Scanner in = new Scanner(System.in);
		
		for(int i = 0; i < idades.length; i++) {
			System.out.println((i + 1) + " --> Informe uma idade:");
			idades[i] = in.nextInt();
			
			if(idades[i] >= 18) {
				maiores[index] = idades[i];
				index++;
			}
		}
		
		for(int i = 0; i < idades.length; i++) {
			System.out.println("Idade " + (i + 1) + "--> " + idades[i]);
			System.out.println("");
		}		
		
		System.out.println(Arrays.toString(idades));
		System.out.println(Arrays.toString(maiores));
		System.out.printf("A quantidade de pessoas maiores de idade é %d", index);
		
		in.close();
	}

}
