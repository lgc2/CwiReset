package mod03Poo.aula06.exercicioProposto;

public class PrincipalAula06 {

	public static void main(String[] args) {
		
		System.out.println("Teste para ver se o mario inicializa os novos atributos");
		MarioAula06 mario1 = new MarioAula06();
		mario1.imprimirCaracFisicas();
        System.out.println("---");
		
        System.out.println("Teste para ver se o mario reinicia a estamina após revigorar");
        MarioAula06 mario2 = new MarioAula06();
        mario2.imprimirCaracFisicas();
        mario2.perderEstamina(); // desconta 10
        mario2.perderEstamina(); // desconta 10
        mario2.imprimirCaracFisicas();
        mario2.revigorar();
        mario2.imprimirCaracFisicas();
        System.out.println("---");
        
        System.out.println("Teste para ver se o mario atualiza a quantidade de moedas após a coleta");
        MarioAula06 mario3 = new MarioAula06();
        mario3.imprimirCaracFisicas();
        mario3.coletarMoedas();
        mario3.coletarMoedas();
        mario3.coletarMoedas();
        mario3.imprimirCaracFisicas();
        System.out.println("---");
        
        System.out.println("Teste para ver se o mario ganha uma vida a cada 10 moedas coletadas");
        MarioAula06 mario4 = new MarioAula06();
        mario4.imprimirCaracFisicas();
        mario4.coletarMoedas();
        mario4.coletarMoedas();
        mario4.coletarMoedas();
        mario4.coletarMoedas();
        mario4.coletarMoedas();
        mario4.coletarMoedas();
        mario4.coletarMoedas();
        mario4.coletarMoedas();
        mario4.coletarMoedas();
        mario4.coletarMoedas();
        mario4.imprimirCaracFisicas();
        mario4.coletarMoedas();
        mario4.coletarMoedas();
        mario4.coletarMoedas();
        mario4.coletarMoedas();
        mario4.coletarMoedas();
        mario4.coletarMoedas();
        mario4.coletarMoedas();
        mario4.coletarMoedas();
        mario4.coletarMoedas();
        mario4.coletarMoedas();
        mario4.imprimirCaracFisicas();
        System.out.println("---");
        
        System.out.println("Teste para ver se o mario perde uma vida após morrer");
        MarioAula06 mario5 = new MarioAula06();
        mario5.imprimirCaracFisicas();
        //coletar 10 moedas para ganhar mais uma vida
        mario5.coletarMoedas();
        mario5.coletarMoedas();
        mario5.coletarMoedas();
        mario5.coletarMoedas();
        mario5.coletarMoedas();
        mario5.coletarMoedas();
        mario5.coletarMoedas();
        mario5.coletarMoedas();
        mario5.coletarMoedas();
        mario5.coletarMoedas();
        //verificando se ganhou uma vida
        mario5.imprimirCaracFisicas();
        //morrer
        mario5.morrer();
        //verificando se perdeu uma vida
        mario5.imprimirCaracFisicas();
        System.out.println("---");
        
        System.out.println("Teste para ver se o mario reinicia a estamina após morrer e ainda possuir vida");
        MarioAula06 mario6 = new MarioAula06();
        mario6.imprimirCaracFisicas();
        //coletar 10 moedas para ganhar mais uma vida
        mario6.coletarMoedas();
        mario6.coletarMoedas();
        mario6.coletarMoedas();
        mario6.coletarMoedas();
        mario6.coletarMoedas();
        mario6.coletarMoedas();
        mario6.coletarMoedas();
        mario6.coletarMoedas();
        mario6.coletarMoedas();
        mario6.coletarMoedas();
        //perder estamina
        mario6.perderEstamina();
        //verificando se ganhou uma vida e se atualizou a estamina
        mario6.imprimirCaracFisicas();
        //morrer
        mario6.morrer();
        //verificando se perdeu uma vida e se reiniciou a estamina
        mario6.imprimirCaracFisicas();
        System.out.println("---");
        
        System.out.println("Teste para ver se o mario mantém a quantidade de vidas em 0 após morrer 2 vezes");
        MarioAula06 mario7 = new MarioAula06();
        mario7.imprimirCaracFisicas();
        mario7.morrer();
        mario7.morrer();
        mario7.imprimirCaracFisicas();
        System.out.println("---");
        
	}

}
