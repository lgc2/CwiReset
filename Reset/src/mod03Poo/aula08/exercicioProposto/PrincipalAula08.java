package mod03Poo.aula08.exercicioProposto;

public class PrincipalAula08 {

	public static void main(String[] args) {
		
		Personagem jogador1 = new Personagem("Mario", 40, 1.60f);
        
        Personagem jogador2 = new Personagem("Luigi", 40, 1.80f);
       
        Jogo jogo = new Jogo(jogador1, jogador2);
        jogo.imprimir();
        System.out.println("");
        jogo.jogar();
        
	}

}
