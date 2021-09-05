package mod03Poo.aula10Part2.aulaGuanabara;

public class Cachorro extends Lobo {

	@Override
	public void emitirSom() {
		System.out.println("LatindoOooOooOoo!");
	}
	
	public void reagir(String frase) {
		if("toma comida".equals(frase) || "Ol�".equals(frase)) {
			System.out.println("Abanar e Latir");
		} else {
			System.out.println("Rosnar");
		}		
	}
	
	public void reagir(int hora, int min) {
		if(hora < 12) {
			System.out.println("Abanar");
		} else if(hora >= 18) {
			System.out.println("Ignorar");
		} else {
			System.out.println("Abanar e Latir");
		}		
	}
	
	public void reagir(boolean dono) {
		if(dono) {
			System.out.println("Abanar");
		} else {
			System.out.println("Rosnar e Latir");
		}		
	}
	
	public void reagir(int idade, float peso) {
		if(idade < 5) {
			if(peso < 10) {
				System.out.println("Abanar");
			} else {
				System.out.println("Latir");
			}
		} else {
			if(peso < 10) {
				System.out.println("Rosnar");
			} else {
				System.out.println("Ignorar");
			}
		}
	}
}
