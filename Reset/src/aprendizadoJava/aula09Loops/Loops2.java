package aprendizadoJava.aula09Loops;

import java.util.Scanner;

public class Loops2 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		int num1 = in.nextInt();
		
		System.out.println("Informe o segundo número: ");
		int num2 = in.nextInt();
		
		if(num2 <= num1) {
			do {
				System.out.println("Segundo número inválido.");
				System.out.println("Informe o segundo número: ");
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
