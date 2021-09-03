package mod03Poo.aula09Part2.aulaGuanabara;

public class Bolsista extends Aluno {
	// Bolsista herda tudo de Aluno, e também herda tudo de Pessoa (ancestral de Bolsista)
	
	private float bolsa;
	
	public void renovarBolsa() {		
		
	}

	@Override
	public void pagarMensalidade() {
		System.out.println(this.getNome() + " é bolsista! Pagamento facilitado.");
	}

	public float getBolsa() {
		return bolsa;
	}

	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}	
	
}
