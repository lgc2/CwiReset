package aprendizadoJava.aula07Operadores;

import java.util.Scanner;

public class Operadores1 {
	
	private static double salarioMes(double valorHora, double horasTrabalhadasMes) {
		
		double salarioDoMes = valorHora * horasTrabalhadasMes;
		
		return salarioDoMes;
	}
	
	private static void imprimir(double salarioDoMes) {
		
		System.out.println("Seu sal�rio neste m�s foi de R$" + salarioDoMes + ".");
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Informe quanto voc� ganha por hora: ");
		double valorHora = in.nextDouble();
		
		System.out.println("Informe quantas horas voc� trabalhou no m�s: ");
		double horasTrabalhadas = in.nextDouble();
		
		imprimir(salarioMes(valorHora, horasTrabalhadas));
		
		in.close();
				
	}

}
