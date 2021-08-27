package mod03Poo.aula06.aulaGuanabara;

public class ControleRemoto implements Controlador {
	
	//Atributos
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	//M�todos especiais
	public ControleRemoto() {
		this.volume = 50;
		this.ligado = true;
		this.tocando = false;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public boolean getLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public boolean getTocando() {
		return tocando;
	}

	public void setTocando(boolean tocando) {
		this.tocando = tocando;
	}

	//M�todos abstratos
	@Override
	public void ligar() {
		this.setLigado(true);		
	}

	@Override
	public void desligar() {
		this.setLigado(false);		
	}

	@Override
	public void abrirMenu() {
		if(this.getLigado()) {
			System.out.println("-----MENU-----");
			System.out.println("Est� ligado? " + this.getLigado());
			System.out.println("Est� tocando? " + this.getTocando());
			System.out.print("Volume: " + this.getVolume());
			for(int i = 10; i <= this.getVolume(); i += 10) {
				System.out.print("|");
			}
			System.out.println("");
		} else {
			System.out.println("Imposs�vel acessar MENU com a TV desligada.");
		}		
	}

	@Override
	public void fecharMenu() {
		System.out.println("Fechando Menu...");		
	}

	@Override
	public void maisVolume() {
		if(this.getLigado()) {
			this.setVolume(this.getVolume() + 5);
			if(this.getVolume() > 100) {
				this.setVolume(100);
			}
		} else {
			System.out.println("Imposs�vel alterar volume com TV desligada.");
		}
	}

	@Override
	public void menosVolume() {
		if(this.getLigado()) {
			this.setVolume(this.getVolume() - 5);
			if(this.getVolume() < 0) {
				this.setVolume(0);
			}
		} else {
			System.out.println("Imposs�vel alterar volume com TV desligada.");
		}
	}

	@Override
	public void ligarMudo() {
		if(this.getLigado() && this.getVolume() > 0) {
			this.setVolume(0);
		}		
	}

	@Override
	public void desligarMudo() {
		if(this.getLigado() && this.getVolume() == 0) {
			this.setVolume(50);
		}		
	}

	@Override
	public void play() {
		if(this.getLigado() && !(this.getTocando())) {
			this.setTocando(true);
		} else if (!(this.getLigado())) {
			System.out.println("TV desligada!");
		}
	}

	@Override
	public void pause() {
		if(this.getLigado() && this.getTocando()) {
			this.setTocando(false);
		} else if(!(this.getLigado())) {
			System.out.println("TV desligada!");
		}
	}
	
}
