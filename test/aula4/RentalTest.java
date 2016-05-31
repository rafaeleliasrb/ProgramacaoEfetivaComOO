package aula4;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class RentalTest {

	@Test
	public void overDueTest() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_MONTH, 29);
		Date dataAtraso = calendar.getTime();
		
		Rental book = new BookRental();
		Rental movie = new MovieRental();
		fail("Not yet implemented");
	}

}
