package mod03Poo.aula04.exercicioProposto;

public class MarioAula04 {
	
	private String nome;
	private int idade;
	private float altura;
	private int estamina;
	
	public MarioAula04() {
		this.nome = "Mario Bros";
		this.idade = 40;
		this.estamina = 100;
		this.altura = 1.50f;
	}
	
	public MarioAula04(String nome, int idade, float altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.estamina = 100;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public int getEstamina() {
		return estamina;
	}

	public void setEstamina(int estamina) {
		this.estamina = estamina;
	}

	public void imprimirCaracFisicas() {
		System.out.println("Caracteristicas físicas do Super Mario:");
		System.out.println("{Nome: '" + this.nome + "', Idade: " + this.idade + 
				", Estamina: " + this.estamina + ", Altura: " + this.altura + "m}");
		System.out.println("");
	}
	
	protected void imprimirPoderes() {
		System.out.println("Alguns dos poderes do Super Mario:");
		System.out.println("Força sobre-humana, super saltos, agilidade extrema, dentre outras.");
	}
}
