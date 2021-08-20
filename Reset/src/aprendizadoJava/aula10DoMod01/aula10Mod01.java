package aprendizadoJava.aula10DoMod01;

public class aula10Mod01 {
	private static String[] nomes = {"Rhoger", "Cléverson", "Gleysberto", "Nádio", "Rosiméri", "Regislane", "Agripino", "Wellison"};
	private static int[] idades = {69, 66, 58, 61, 60, 64, 59, 55};
	private static int[] temposDeTrabalho = {31, 29, 30, 26, 25, 24, 26, 29};
	
	private static boolean[] verificarAposentadoria(String nome) {
		boolean aposentadoria = false;
		boolean nomeNaLista = false;
		
		for(int i = 0; i < nomes.length; i++) {
		
			if(nome == nomes[i]) {
				nomeNaLista = true;
								
				if(idades[i] >= 65 || temposDeTrabalho[i] >= 30 || idades[i] >= 60 && temposDeTrabalho[i] >= 25) {
					aposentadoria = true;
				}
			} 			
		}
		
		boolean[] retorno = {aposentadoria, nomeNaLista};		
		return retorno;
	}
	
	private static void impressao(boolean aposentadoria, boolean nomeNaLista) {
				
		if (nomeNaLista) {
			if (aposentadoria) {
				System.out.println("Parabéns, já pode sair e férias eternas :)");
			} else {
				System.out.println("Infelizmente para você, ainda falta um tempo :(");
			}
		
		} else {
			System.out.println("Colaborador inválido :|");
		}
	}
	
	
	public static void main(String[] args) {
				
		String nome = "Rhoger";
		
		boolean[] verificadorAposentadoria = verificarAposentadoria(nome);
		impressao(verificadorAposentadoria[0], verificadorAposentadoria[1]);
				
	}
}
