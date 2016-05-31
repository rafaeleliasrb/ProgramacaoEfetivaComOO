package aula4;

public class BookRental extends Rental{
	private String author;

	@Override
	public double getTax() {
		return 1.2;
	}
}
