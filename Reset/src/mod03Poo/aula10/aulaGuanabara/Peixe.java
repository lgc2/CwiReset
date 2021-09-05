package mod03Poo.aula10.aulaGuanabara;

public class Peixe extends Animal {
	
	private String corEscama;
	
	public void soltarBolha() {
		System.out.println("Soltando bolhas");
	}

	@Override
	public void locomover() {
		System.out.println("Nadando");		
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo algas");		
	}

	@Override
	public void emitirSom() {
		System.out.println("Peixe não emite som");		
	}

	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
	
}
