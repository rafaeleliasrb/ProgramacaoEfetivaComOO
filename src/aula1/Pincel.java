package aula1;

public class Pincel {
	int tamannho;
	String forma;
	String cor;
	
	public Pincel() {
		this(12, "Cilíndrico", "Preto");
	}
	
	public Pincel(int tamannho, String forma, String cor) {
		super();
		this.tamannho = tamannho;
		this.forma = forma;
		this.cor = cor;
	}

	public void riscar(String texto) {
		System.out.println("Riscando " + texto + "com a cor " + cor);
	}
	
	public String obterCor() {
		return cor;
	}
}