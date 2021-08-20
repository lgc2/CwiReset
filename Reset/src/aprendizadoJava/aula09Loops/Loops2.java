package aprendizadoJava.aula09Loops;

import java.util.Scanner;

public class Loops2 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero: ");
		int num1 = in.nextInt();
		
		System.out.println("Informe o segundo n�mero: ");
		int num2 = in.nextInt();
		
		if(num2 <= num1) {
			do {
				System.out.println("Segundo n�mero inv�lido.");
				System.out.println("Informe o segundo n�mero: ");
				num2 = in.nextInt();
			} while(num2 <= num1);
		}
		
		int incremento = ++num1;
		do {
			System.out.println(incremento);
			incremento++;
		} while (incremento < num2);
	
		in.close();
	}
	

}
