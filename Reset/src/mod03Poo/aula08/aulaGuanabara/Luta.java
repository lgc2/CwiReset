package mod03Poo.aula08.aulaGuanabara;

import java.util.Random;

public class Luta {
	
	private Lutador desafiado; // tipo abstrato de dado
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;
	
	public void marcarLuta(Lutador l1, Lutador l2) {
		if(l1.getCategoria().equals(l2.getCategoria()) && 
				l1 != l2) {
			this.aprovada = true;
			this.desafiado = l1;
			this.desafiante = l2;
		} else {
			this.aprovada = false;
			this.desafiado = null;
			this.desafiante = null;
		}
	}
	
	public void lutar() {
		if(this.aprovada) {
			System.out.println("### DESAFIADO ###");
			this.desafiado.apresentar();
			System.out.println("### DESAFIANTE ###");
			this.desafiante.apresentar();
			
			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3); // 0 1 2
			System.out.println("===== RESULTADO DA LUTA ===== ");
			
			switch (vencedor) {
			case 0: // empate
				this.desafiado.empatarLuta();
				this.desafiante.empatarLuta();
				System.out.println("O desafiado " + this.desafiado.getNome() + " e o desafiante " +
				this.desafiante.getNome() + " empataram!");				
				break;
			
			case 1: // desafiado vence
				this.desafiado.ganharLuta();
				this.desafiante.perderLuta();
				System.out.println("O desafiado " + this.desafiado.getNome() + " é o vencedor!");				
				break;
				
			case 2: // desafiante vence
				this.desafiado.perderLuta();
				this.desafiante.ganharLuta();
				System.out.println("O desafiante " + this.desafiante.getNome() + " é o vencedor!");				
				break;						
			}
			System.out.println("=============================");
		} else {
			System.out.println("Luta não pode acontecer.");
		}
	}
	
	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}
	
	public Lutador getDesafiado() {
		return this.desafiado;
	}
	
	public Lutador getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	public int getRounds() {
		return rounds;
	}

	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

	public boolean getAprovada() {
		return aprovada;
	}

	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}	

}
