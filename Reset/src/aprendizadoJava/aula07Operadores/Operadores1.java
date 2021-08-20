package aprendizadoJava.aula07Operadores;

import java.util.Scanner;

public class Operadores1 {
	
	private static double salarioMes(double valorHora, double horasTrabalhadasMes) {
		
		double salarioDoMes = valorHora * horasTrabalhadasMes;
		
		return salarioDoMes;
	}
	
	private static void imprimir(double salarioDoMes) {
		
		System.out.println("Seu salário neste mês foi de R$" + salarioDoMes + ".");
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Informe quanto você ganha por hora: ");
		double valorHora = in.nextDouble();
		
		System.out.println("Informe quantas horas você trabalhou no mês: ");
		double horasTrabalhadas = in.nextDouble();
		
		imprimir(salarioMes(valorHora, horasTrabalhadas));
		
		in.close();
				
	}

}
