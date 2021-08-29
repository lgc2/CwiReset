package mod03Poo.aula07.exercicioProposto;

public class PrincipalAula07 {

	public static void main(String[] args) {
		
		System.out.println("Teste para verificar a altura do salto do Mario");
        Personagem personagem = new Personagem("Mario", 40, 1.60f);
        personagem.imprimirCaracFisicas();
        personagem.saltar();
        System.out.println("---");

        System.out.println("Teste para verificar a altura do salto do Luigi");
        Personagem luigi = new Personagem("Luigi", 40, 1.80f);
        luigi.imprimirCaracFisicas();
        luigi.saltar();
        System.out.println("---");
        
	}

}
