package aprendizadoJava.aula08Condicionais1;

import java.util.Scanner;

public class Condicionais2 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite um n�mero de 1 a 7: ");
		int numDiaSemana = in.nextInt();
		
		switch (numDiaSemana) {
		case 1:
			System.out.println("Domingo");			
			break;
			
		case 2:
			System.out.println("Segunda-feira");			
			break;
		
		case 3:
			System.out.println("Ter�a-feira");			
			break;
			
		case 4:
			System.out.println("Quarta-feira");			
			break;
			
		case 5:
			System.out.println("Quinta-feira");			
			break;
			
		case 6:
			System.out.println("Sexta-feira");			
			break;
			
		case 7:
			System.out.println("S�bado");			
			break;

		default:
			System.out.println("Valor inv�lido!");
			break;
		}
		
		in.close();
	}

}
