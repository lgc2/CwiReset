package mod03Poo.aula02.exercicioProposto;

public class Principal {

	public static void main(String[] args) {
		
		Mario mario = new Mario();
		
		mario.nome = "Mario";
		mario.nacionalidade = "Italiano";
		mario.altura = 1.60f;
		
		mario.imprimirCaracFisicas();
		mario.imprimirPoderes();
	}

}
