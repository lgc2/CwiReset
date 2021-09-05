package mod03Poo.aula10Part2.exercicioProposto;

public class PrincipalAula10 {

	public static void main(String[] args) {
		
		// Criando o personagem Mario
		Mario mario = new Mario("Mario", 40, 1.60f);

		// Criando o personagem Luigi
		Luigi luigi = new Luigi("Luigi", 37, 1.80f);

		// Criando o personagem Yoshi
		Yoshi yoshi = new Yoshi("Yoshi", 94, 0.85f);

		// Teste para ver quanto o Mario cresce
		mario.imprimirCaracteristicas();
		mario.crescer();
		mario.imprimirCaracteristicas();
		

		// Teste para ver quanto o Luigi cresce
		luigi.imprimirCaracteristicas();
		luigi.crescer();
		luigi.imprimirCaracteristicas();
		
		
		// Teste para ver quanto o Yoshi cresce
		yoshi.imprimirCaracteristicas();
		yoshi.crescer();
		yoshi.imprimirCaracteristicas();
		
		
		// Testando o método saltar e saltar obstáculo dos 3 personagens
		System.out.println("");
		luigi.saltar();
		mario.saltar();
		yoshi.saltar();
		
		luigi.saltar(2f);
		mario.saltar(3f);	
		yoshi.saltar(10f);
		        
	}

}
