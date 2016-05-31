package aula4;

public class MovieRental extends Rental{
	private int classification;

	@Override
	public double getTax() {
		return 1.3;
	}
}
