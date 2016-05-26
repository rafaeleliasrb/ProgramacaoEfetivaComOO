package aula1;

public class TestePincel {
	public static void main(String[] args) {
		Pincel pincel1 = new Pincel();
		pincel1.cor = "Azul";
		pincel1.forma = "Cilíndrico";
		pincel1.tamannho = 10;
		pincel1.riscar("POO");
		
		Pincel pincel2 = new Pincel();
		pincel2.cor = "Vermelho";
		pincel2.riscar("Java");
		System.out.println(pincel2.obterCor());
	}
}
