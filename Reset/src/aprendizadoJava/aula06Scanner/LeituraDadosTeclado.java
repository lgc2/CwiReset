package aprendizadoJava.aula06Scanner;

import java.util.Scanner;

public class LeituraDadosTeclado {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		/*		
		System.out.println("Digite seu nome completo: ");
		String nomeCompleto = in.nextLine();
		System.out.println("Seu nome completo � " + nomeCompleto + ".");
		
		System.out.println("Digite a sua idade: ");
		int idade = in.nextInt();
		System.out.println("Sua idade � " + idade);
		
		System.out.println("Digite sua altura: ");
		double altura = in.nextDouble();
		System.out.println("A sua altura � " + altura);
		*/
		
		System.out.println("Digite o seu primeiro nome, idade, quantidade de filhos, altura e se tem pet: ");
		String primeiroNome = in.next();
		int idade = in.nextInt();
		short qtdeFilhos = in.nextShort();
		double altura = in.nextDouble();
		boolean temPet = true;
		
		System.out.println("Voc� digitou as seguintes informa��es: ");
		System.out.println("Primeiro nome: " + primeiroNome);
		System.out.println("Sua idade: " + idade);
		System.out.println("Voc� tem " + qtdeFilhos + " filhos");
		System.out.println("Voc� mede " + altura + "m de altura");
		System.out.println("Voc� tem pet: " + temPet);
			
	}

}
