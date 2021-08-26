package mod03Poo.aula05.exercicioProposto;

public class PrincipalAula05 {

	public static void main(String[] args) {
		
		System.out.println("Teste para ver se Mario perde estamina");
		MarioAula05 mario1 = new MarioAula05();
		mario1.imprimirCaracFisicas();
		mario1.perderEstamina();
		mario1.imprimirCaracFisicas();
		System.out.println("---");
		
		System.out.println("Teste para ver se Mario ganha estamina");
		MarioAula05 mario2 = new MarioAula05();
		mario2.imprimirCaracFisicas();
		mario2.perderEstamina();
		mario2.perderEstamina();
		mario2.ganharEstamina();
		mario2.imprimirCaracFisicas();
		System.out.println("---");
		
		System.out.println("Teste para ver se Mario mantém a estamina em 100 após o acréscimo deste valor");
		MarioAula05 mario3 = new MarioAula05();
		mario3.imprimirCaracFisicas();
		mario3.ganharEstamina();
		mario3.ganharEstamina();
		mario3.imprimirCaracFisicas();
		System.out.println("---");
		
		System.out.println("Teste para ver se o Mario mantém a estamina em 0 após o desconto até um valor menor que zero");
		MarioAula05 mario4 = new MarioAula05();
		mario4.imprimirCaracFisicas();
        mario4.perderEstamina(); // desconta 10
        mario4.perderEstamina(); // desconta 10
        mario4.perderEstamina(); // desconta 10
        mario4.perderEstamina(); // desconta 10
        mario4.perderEstamina(); // desconta 10
        mario4.perderEstamina(); // desconta 10
        mario4.perderEstamina(); // desconta 10
        mario4.perderEstamina(); // desconta 10
        mario4.perderEstamina(); // desconta 10
        mario4.perderEstamina(); // desconta 10
        mario4.imprimirCaracFisicas();
        mario4.perderEstamina(); // desconta 10
        mario4.perderEstamina(); // desconta 10
        mario4.imprimirCaracFisicas();
        System.out.println("---");
        
        System.out.println("Teste para ver se o Mario cresce");
        MarioAula05 mario5 = new MarioAula05();
        mario5.imprimirCaracFisicas();
        mario5.crescer();
        mario5.imprimirCaracFisicas();
        System.out.println("---");
        
	}

}
