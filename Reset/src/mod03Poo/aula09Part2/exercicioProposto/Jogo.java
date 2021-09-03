package mod03Poo.aula09Part2.exercicioProposto;

import java.util.Random;

public class Jogo {
	
	private Personagem jogador1;
	private Personagem jogador2;
	
	public Jogo(Personagem jogador1, Personagem jogador2) {
		this.jogador1 = jogador1;
		this.jogador2 = jogador2;
	}
	
	public void imprimir() {
		System.out.println("### Dados do Jogador 1 ###");
		this.jogador1.imprimirCaracteristicas();
		System.out.println("### Dados do Jogador 2 ###");
		this.jogador2.imprimirCaracteristicas();
	}
	
	public void jogar() {
		Random aleatorio = new Random();
		int repeticoesJog1 = aleatorio.nextInt(31);
		
		int repeticoesJog2 = aleatorio.nextInt(31);		
		
		for(int i = 0; i < repeticoesJog1; i++) {
			this.jogador1.coletarMoedas();
		}
		
		for(int j = 0; j < repeticoesJog2; j++) {
			this.jogador2.coletarMoedas();
		}
		
		System.out.println("O jogador 1 coletou " + repeticoesJog1 + " moedas.");
		System.out.println("O jogador 2 coletou " + repeticoesJog2 + " moedas.");
		
		this.jogador1.imprimirCaracteristicas();
		this.jogador2.imprimirCaracteristicas();		
	}
	

}
