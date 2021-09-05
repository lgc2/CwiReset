package mod03Poo.aula10Part2.exercicioProposto;

public class Mario extends Personagem {

	private Yoshi yoshi;
	
	public Mario(String nome, int idade, float altura) {
		super(nome, idade, altura);
	}	
	
	public void montarNoYosh(Yoshi yoshi) {
		this.yoshi = yoshi;
	}
	
	public void imprimeMontadoYoshi() {
		if(this.yoshi != null) {
			System.out.println("Mário está montado no Yoshi.");
		} else {
			System.out.println("Mário não está montado no Yoshi.");
		}
	}

	@Override
	public void crescer() {
		this.setAltura(this.getAltura() * 1.50f);		
	}
	
	

}
