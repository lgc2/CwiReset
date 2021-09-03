package mod03Poo.aula09Part2.exercicioProposto;

public class PrincipalAula09 {

	public static void main(String[] args) {
		
		// Tentando instanciar um objeto do tipo Personagem, mas não é possível porque a classe é abstrata. Por isso, a linha está comentada.
        //Personagem personagem = new Personagem("Mario", 40, 1.60);
        
        // Criando o personagem Mario
        Mario mario = new Mario("Mario", 40, 1.60f);

        // Criando o personagem Luigi
        Luigi luigi = new Luigi("Luigi", 37, 1.80f);

        // Criando o personagem Yoshi
        Yoshi yoshi = new Yoshi("Yoshi", 94, 0.85f);

        // Teste para verificar se o Mario monta no Yoshi
        mario.imprimeMontadoYoshi();
        mario.montarNoYosh(yoshi);
        mario.imprimeMontadoYoshi();

        // Teste para verificar se o Luigi voa
        luigi.voar();

        // Teste para verificar se a velocidade do yoshi aumenta a cada 2 frutas comidas
        System.out.println("Velocidade atual: " + yoshi.getVelocidade());
        yoshi.comerFruta();
        System.out.println("Velocidade atual: " + yoshi.getVelocidade());
        yoshi.comerFruta();
        System.out.println("Velocidade atual: " + yoshi.getVelocidade());
        yoshi.comerFruta();
        yoshi.comerFruta();
        System.out.println("Velocidade atual: " + yoshi.getVelocidade());		
        
	}

}
