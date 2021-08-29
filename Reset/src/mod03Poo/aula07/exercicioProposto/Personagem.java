package mod03Poo.aula07.exercicioProposto;

public class Personagem {
	
	private String nome;
	private int idade;
	private float altura;
	private int estamina;
	private int moedasColetadas;
	private int qtdeVidas;
	
	public Personagem(String nome, int idade, float altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.estamina = 100;
		this.moedasColetadas = 0;
		this.qtdeVidas = 1;
	}
	
	public void saltar() {
		if("Mario".equals(this.nome)) {
			System.out.println("Pulou " + (0.5 * this.altura) + "m");
		} else if("Luigi".equals(this.nome)) {
			System.out.println("Pulou " + (2 * this.altura) + "m");
		}
	}
	
	public void coletarMoedas() {
		this.moedasColetadas++;
		if(this.moedasColetadas % 10 == 0) {
			this.qtdeVidas++;
		}
	}
	
	public void morrer() {
		if(this.estamina > 0) {
			this.estamina = 0;
		}
		
		this.qtdeVidas -= 1;
		if(this.qtdeVidas < 0) {
			this.qtdeVidas = 0;
		} else {
			this.revigorar();
		}		
	}
	
	public void revigorar() {
		this.estamina = 100;
	}
	
	public void perderEstamina() {
		if(this.estamina < 10) {
			this.estamina = 0;
		} else {
			this.estamina = this.estamina - 10;
		}
	}
	
	public void ganharEstamina() {
		if(this.estamina > 95) {
			this.estamina = 100;
		} else {
			this.estamina = this.estamina + 5;
		}
	}
	
	public void crescer() {
		this.altura = this.altura * 2;
	}

	public void imprimirCaracFisicas() {
		System.out.println("{Nome: '" + this.nome + "', Idade: " + this.idade + 
				", Estamina: " + this.estamina + ", Altura: " + this.altura + "m, "
						+ "Moedas coletadas: " + this.moedasColetadas + 
						", Quantidade de vidas: " + qtdeVidas + "}");		
	}
	
	protected void imprimirPoderes() {
		System.out.println("Alguns dos poderes do Super Mario:");
		System.out.println("Força sobre-humana, super saltos, agilidade extrema, dentre outras.");
	}
}
