package aula6;

public class Motor implements Exibivel{

	private int potencia;
	private int cilindrada;
	
	@Override
	public void exibir() {
		System.out.println("potencia: " + potencia);
		System.out.println("cilindrada: " + cilindrada);
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
}
