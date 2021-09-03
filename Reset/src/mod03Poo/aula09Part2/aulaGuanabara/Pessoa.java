package mod03Poo.aula09Part2.aulaGuanabara;

public abstract class Pessoa {
	
	private String nome;
	private int idade;
	private String sexo;
	
	public final void fazerAniversario() {
		this.setIdade(this.getIdade() + 1);
		System.out.println("Parab�ns!!!");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Dados [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + "]";
	}
			
}
