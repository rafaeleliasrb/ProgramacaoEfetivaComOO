package aula5;

public class GM implements FabricaDeCarro{

	@Override
	public Carro getCarroPopular() {
		CarroPopular celta = new Celta();
		return celta;
	}

	@Override
	public Carro getCarroEsportivo() {
		CarroEsportivo camaro = new Camaro();
		return camaro;
	}
}
