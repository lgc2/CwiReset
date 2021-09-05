package mod03Poo.aula10.aulaGuanabara;

public class Aula10 {
	
	public static void main(String[] args) {
		//Animal n = new Animal();
		Mamifero m = new Mamifero();
		Reptil r = new Reptil();
		Peixe p = new Peixe();
		Ave a = new Ave();
		Canguru c = new Canguru();
		Cachorro k = new Cachorro();
		Cobra cobra = new Cobra();
		Tartaruga tartaruga = new Tartaruga();
		Goldfish peixeDourado = new Goldfish();
		Arara arara = new Arara();
		
		System.out.println("Mamífero:");
		m.locomover();
		m.alimentar();
		m.emitirSom();
		System.out.println("");
		
		System.out.println("Canguru:");
		c.locomover();
		c.alimentar();
		c.emitirSom();
		c.usarBolsa();
		System.out.println("");
		
		System.out.println("Cachorro:");
		k.locomover();
		k.alimentar();
		k.emitirSom();
		System.out.println("");
		
		System.out.println("Réptil:");
		r.locomover();
		r.alimentar();
		r.emitirSom();
		System.out.println("");
		
		System.out.println("Cobra:");
		cobra.locomover();
		cobra.alimentar();
		cobra.emitirSom();
		System.out.println("");
		
		System.out.println("Tartaruga:");
		tartaruga.locomover();
		tartaruga.alimentar();
		tartaruga.emitirSom();
		System.out.println("");
		
		System.out.println("Peixe:");
		p.locomover();
		p.alimentar();
		p.emitirSom();
		System.out.println("");
		
		System.out.println("Ave:");
		a.locomover();
		a.alimentar();
		a.emitirSom();
		System.out.println("");
		
		
		
		
		
	}

}
