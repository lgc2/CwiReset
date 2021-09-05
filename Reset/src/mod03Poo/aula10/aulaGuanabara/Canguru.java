package mod03Poo.aula10.aulaGuanabara;

public class Canguru extends Mamifero {
	
	public void usarBolsa() {
		System.out.println("Usando Bolsa");
	}

	@Override
	public void locomover() {
		//super.locomover();
		System.out.println("Saltando");
	}
}
