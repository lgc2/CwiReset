package mod03Poo.aula05.aulaGuanabara;

public class ContaBanco {
	
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	public ContaBanco() {
		this.saldo = 0;
		this.status = false;
	}
	
	public void estadoAtual() {
		System.out.println("------------------------------------");
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: " + this.getStatus());
	}

	public void abrirConta(String tipo) {
		this.tipo = tipo;
		this.status = true;
		
		if("CC".equals(tipo)) {
			this.saldo = 50.00f;
		} else if("CP".equals(tipo)) {
			this.saldo = 150.00f;
		}
		System.out.println("Conta aberta com sucesso!");
	}
	
	public void fecharConta() {
		if(this.saldo > 0) {
			System.out.println("Conta com dinheiro.");
		} else if(this.saldo < 0) {
			System.out.println("Conta em débito");
		} else {
			this.status = false;
			System.out.println("Conta fechada com sucesso!");
		}
		
	}
	
	public void depositar(float valor) {
		if(this.getStatus()) {
			this.setSaldo(this.getSaldo() + valor);
			System.out.println("Depósito realizado com sucesso na conta de " + this.getDono());
		} else {
			System.out.println("Impossível depositar.");
		}		
	}
	
	public void sacar(float valor) {
		if(this.getStatus()) {
			if(this.getSaldo() >= valor) {
				this.setSaldo(this.getSaldo() - valor);
				System.out.println("Saque realizado na conta de " + this.getDono());
			} else {
				System.out.println("Saldo insuficiente.");
			}
		} else {
			System.out.println("Impossível sacar.");
		}
	}
	
	public void pagarMensal() {
		float mensalidade = 0.0f;
		
		if(this.getTipo().equals("CC")) {
			mensalidade = 12.00f;
		} else if(this.getTipo().equals("CP")) {
			mensalidade = 20.00f;
		}
		
		if(this.getStatus()) {
			if(this.getSaldo() >= mensalidade) {
				this.setSaldo(getSaldo() - mensalidade);
				System.out.println("Mensalidade paga com sucesso por " + this.getDono());
			} else {
				System.out.println("Saldo insuficiente.");
			}
		} else {
			System.out.println("Impossível pagar.");
		}		
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
}
