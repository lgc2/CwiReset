package mod03Poo.aula02.exercicioProposto;

public class Mario {
	
	String nome;
	String nacionalidade;
	float altura;
				
	void imprimirCaracFisicas() {
		System.out.println("Caracteristicas f�sicas do Super Mario:");
		System.out.println("{Nome: '" + nome + "', Nacionalidade: '" + nacionalidade + 
				"', Altura: " + altura + "m}");
		System.out.println("");
	}
	
	void imprimirPoderes() {
		System.out.println("Alguns dos poderes do Super Mario:");
		System.out.println("For�a sobre-humana, super saltos, agilidade extrema, dentre outras.");
	}
}
