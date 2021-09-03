package mod03Poo.aula09Part2.exercicioProposto;

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
			System.out.println("M�rio est� montado no Yoshi.");
		} else {
			System.out.println("M�rio n�o est� montado no Yoshi.");
		}
	}
	
	/*public void setYoshi(Yoshi yoshi) {
		this.yoshi = yoshi;
	}*/	

}
