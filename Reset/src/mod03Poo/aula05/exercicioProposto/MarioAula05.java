package mod03Poo.aula05.exercicioProposto;

public class MarioAula05 {
	
	private String nome;
	private int idade;
	private float altura;
	private int estamina;
	
	public MarioAula05() {
		this.nome = "Mario Bros";
		this.idade = 40;
		this.estamina = 100;
		this.altura = 1.50f;
	}
	
	public MarioAula05(String nome, int idade, float altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.estamina = 100;
	}
	
	public void perderEstamina() {
		if(getEstamina() < 10) {
			setEstamina(0);
		} else {
			setEstamina(getEstamina() - 10);
		}
	}
	
	public void ganharEstamina() {
		if(getEstamina() > 95) {
			setEstamina(100);
		} else {
			setEstamina(getEstamina() + 5);
		}
	}
	
	public void crescer() {
		setAltura(getAltura() * 2);
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
