package mod03Poo.aula10.aulaGuanabara;

public abstract class Animal {
	// Atributos de animal
	protected double peso;
	protected int idade;
	protected int membros;
	
	// M?todos de animal
	public abstract void locomover();	
	public abstract void alimentar();	
	public abstract void emitirSom();

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getMembros() {
		return membros;
	}

	public void setMembros(int membros) {
		this.membros = membros;
	}

}
