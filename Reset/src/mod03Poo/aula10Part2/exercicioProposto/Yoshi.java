package mod03Poo.aula10Part2.exercicioProposto;

public class Yoshi extends Personagem {
	
	private int qtdeFrutasComidas;
	private int velocidade;
	
	public Yoshi(String nome, int idade, float altura) {
		super(nome, idade, altura);
		this.qtdeFrutasComidas = 0;
		this.velocidade = 10;
	}	
	
	public int getVelocidade() {
		return velocidade;
	}
	
	public void comerFruta() {
		this.qtdeFrutasComidas++;
		
		if(this.qtdeFrutasComidas % 2 == 0) {
			this.velocidade = this.getVelocidade() * 2;
		}
	}

	@Override
	public void crescer() {
		this.setAltura(this.getAltura() * 1.1f);
	}

}
