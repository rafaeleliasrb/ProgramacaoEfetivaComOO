package aula4;

import java.util.Date;

public abstract class Rental {

	private String title;
	private Date rentDate;
	private Date dueDate;
	protected double rentalFee;
	
	public boolean isOverDue() {
		Date now = new Date();
		return dueDate.before(now);
	}
	
	public double getTotalFee() {
		return isOverDue() ? getTax()*rentalFee : rentalFee;
	}
	
	public abstract double getTax();
}
