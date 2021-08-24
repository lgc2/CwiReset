package mod03Poo.aula03.exercicioProposto;

public class MarioAula03 {
	
	private String nome;
	private String nacionalidade;
	private float altura;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
	public void setAltura(float altura) {
		this.altura = altura;
	}
				
	public void imprimirCaracFisicas() {
		System.out.println("Caracteristicas físicas do Super Mario:");
		System.out.println("{Nome: '" + this.nome + "', Nacionalidade: '" + nacionalidade + 
				"', Altura: " + altura + "m}");
		System.out.println("");
	}
	
	protected void imprimirPoderes() {
		System.out.println("Alguns dos poderes do Super Mario:");
		System.out.println("Força sobre-humana, super saltos, agilidade extrema, dentre outras.");
	}
}
