package mod03Poo.aula10Part2.exercicioProposto;

public class Luigi extends Personagem {
	
	public Luigi(String nome, int idade, float altura) {
		super(nome, idade, altura);
	}

	public void voar() {		
		System.out.println("Luigi está voando!");
	}

	@Override
	public void crescer() {
		this.setAltura(this.getAltura() * 1.75f);
	}

}
