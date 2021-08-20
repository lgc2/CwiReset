package aprendizadoJava.aula09Loops;

import java.util.Scanner;

public class Loops1 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		boolean statusNota;
			
		do {
			statusNota = true;
			
			System.out.println("Informe o valor da nota (0 a 10): ");
			double nota = in.nextDouble();
			
			if(nota >= 0 && nota <= 10) {
				System.out.println("Nota " + nota);
			} else {
				statusNota = false;
				System.out.println("Nota inválida. Digite novamente.");
			}
			
		} while (statusNota == false);
		
		in.close();
	}

}
