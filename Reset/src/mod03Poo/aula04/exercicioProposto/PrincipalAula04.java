package mod03Poo.aula04.exercicioProposto;

public class PrincipalAula04 {

	public static void main(String[] args) {
		
		MarioAula04 mario = new MarioAula04();
		mario.imprimirCaracFisicas();
		mario.imprimirPoderes();
		
		System.out.println("********************************************************************");
		
		MarioAula04 mario2 = new MarioAula04("Mariozin", 45, 1.55f);		
		mario2.imprimirCaracFisicas();
		mario2.imprimirPoderes();
		
		System.out.println("********************************************************************");
		
		MarioAula04 mario3 = new MarioAula04("Mariozin", 40, 1.55f);
		mario3.imprimirCaracFisicas();
		mario3.setNome("Super Mário Bros");
		mario3.setIdade(62);
		mario3.imprimirCaracFisicas();
		mario3.imprimirPoderes();		
	}

}
