package mod03Poo.aula03.aulaGuanabara;

import mod03Poo.aula03.aulaGuanabara.CanetaAula03;

public class Aula03 {

	public static void main(String[] args) {
		
		CanetaAula03 c1 = new CanetaAula03();
		c1.modelo = "BIC cristal";
		c1.cor = "Azul";
		//c1.ponta = 0.5f;
		c1.carga = 80;
		//c1.tampada = false;
		c1.destampar();
		c1.status();
		c1.rabiscar();
				

	}

}
