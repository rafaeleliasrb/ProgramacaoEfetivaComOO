package aula6;

public class Peca implements Exibivel{

	private static int qntPecas;
	private int codigo;
	private String descricao;
	private String marca;
	
	public Peca() {
		qntPecas++;
	}
	
	@Override
	public void exibir() {
		System.out.println("codigo: " + codigo);
		System.out.println("descricao: " + descricao);
		System.out.println("marca: " + marca);
	}

	public int getQntPecas() {
		return Peca.qntPecas;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public static void setQntPecas(int qntPecas) {
		Peca.qntPecas = qntPecas;
	}
}
