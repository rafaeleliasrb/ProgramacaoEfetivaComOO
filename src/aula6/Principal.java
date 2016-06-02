package aula6;

public class Principal {

	public static void main(String[] args) {
		Veiculo mercedao = new Caminhao(5.0, 3.0, 10.5, "AAA-5555", 4645L, 2010, 3000, 100.0, 150000, 3);
		Veiculo ecoRosa = new CarroPasseio("Rosa", "EcoSport", "ORV-5555", 45612l, 2014, 1500, 120.0, 60000, 5);
		
		mercedao.exibir();
		Peca peca1 = new Peca();
		Peca peca2 = new Peca();
		mercedao.incluirPeca(peca1);
		mercedao.incluirPeca(peca2);
		
		ecoRosa.exibir();
		ecoRosa.incluirPeca(peca1);
	}
}
