package aula5;

public class Principal {
	public static void main(String[] args) {
		FabricaDeCarro fabrica = new Ford();
		System.out.println("Carro popular da Ford: " 
				+ fabrica.getCarroPopular().getDescricao());
		
		fabrica = new GM();
		System.out.println("Carro esportivo da GM: " 
				+ fabrica.getCarroEsportivo().getDescricao());
	}
}
