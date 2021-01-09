package day3.Practice;
// Electricity Bill
public class PracticeBean {
	
	private String billing_name;
	private int billing_ID;
	private double billing_amount;
	
	protected PracticeBean()
	{
		
	}

	protected PracticeBean(String billing_name, int billing_ID, double billing_amount) {
	    this();
		this.billing_name = billing_name;
		this.billing_ID = billing_ID;
		this.billing_amount = billing_amount;
	}

	public String getbilling_name() {
		return billing_name;
	}

	public void setbilling_name(String billing_name) {
		this.billing_name = billing_name;
	}

	public int getbilling_ID() {
		return billing_ID;
	}

	public void setbilling_ID(int billing_ID) {
		this.billing_ID = billing_ID;
	}

	public double getBilling_amount() {
		return billing_amount;
	}

	public void setBilling_amount(double billing_amount) {
		this.billing_amount = billing_amount;
	}

	@Override
	public String toString() {
		return "PracticeBean [billing_name=" + billing_name + ", billing_ID=" + billing_ID + ", billing_amount="
				+ billing_amount + "]";
	}
	
	
	
	

}
