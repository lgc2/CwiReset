package aprendizadoJava.aula09Loops;

import java.util.Scanner;

public class Loops4 {
	
	public static void tabuada(int numEscolhido) {
		
		System.out.println("Tabuada do " + numEscolhido + ":");
		for (int i = 1; i < 11; i++) {
			int tabuada = numEscolhido * i;
			System.out.println(numEscolhido + " x " + i + " = " + tabuada);
			
		}
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Qual o número entre 1 e 10 você deseja ver a tabuada?");
		System.out.println("Digite o número desejado:");
		int numEscolhido = in.nextInt();
		
		tabuada(numEscolhido);
		
		in.close();
	}

}
