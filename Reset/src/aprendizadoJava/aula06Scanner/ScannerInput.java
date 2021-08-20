package aprendizadoJava.aula06Scanner;

import java.util.Scanner;

public class ScannerInput {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		String nome = in.nextLine();
		
		System.out.println("Sou aluno do Level 1 do CWI Reset! Me chamo " + 
		nome + ".");
		
		in.close();
	}

}
