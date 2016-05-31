package aula5;

public class Ford implements FabricaDeCarro{

	@Override
	public Carro getCarroPopular() {
		CarroPopular ka = new Ka(); 
		return ka;
	}

	@Override
	public Carro getCarroEsportivo() {
		CarroEsportivo mustang = new Mustang();
		return mustang;
	}

}
