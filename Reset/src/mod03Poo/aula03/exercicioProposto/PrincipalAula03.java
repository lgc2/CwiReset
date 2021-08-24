package mod03Poo.aula03.exercicioProposto;

public class PrincipalAula03 {

	public static void main(String[] args) {
		
		MarioAula03 mario = new MarioAula03();
		
		//mario.nome = "Mario";
		mario.setNome("Mário");
		//mario.nacionalidade = "Italiano";
		mario.setNacionalidade("Italiano");
		//mario.altura = 1.60f;
		mario.setAltura(1.65f);
		
		mario.imprimirCaracFisicas();
		mario.imprimirPoderes();
	}

}
