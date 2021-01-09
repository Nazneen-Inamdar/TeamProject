package day3.Beans;

public class Hospital {
	
	private int bill_no;
	private String patient_name;
	private char test_res;
	private double billing_amount;
	private String disease;
	private int patient_age;
	
	public Hospital()
	{
		
	}
	
	
	
	public Hospital(int bill_no, String patient_name, char test_res, double billing_amount, String disease, int patient_age) {
		super();
		this.bill_no = bill_no;
		this.patient_name = patient_name;
		this.test_res = test_res;
		this.billing_amount = billing_amount;
		this.disease = disease;
		this.patient_age = patient_age;
	}

	@Override
	public String toString() {
		return "Hospital [bill_no=" + bill_no + ", patient_name=" + patient_name + ", test_res=" + test_res
				+ ", billing_amount=" + billing_amount + ", disease=" + disease +", patient_age = "+patient_age+ "]";
	}



	public int getBill_no() {
		return bill_no;
	}
	public void setBill_no(int bill_no) {
		this.bill_no = bill_no;
	}
	public String getPatient_name() {
		return patient_name;
	}
	public void setPatient_name(String patient_name) {
		this.patient_name = patient_name;
	}
	public char getTest_res() {
		return test_res;
	}
	public void setTest_res(char test_res) {
		this.test_res = test_res;
	}
	public double getBilling_amount() {
		return billing_amount;
	}
	public void setBilling_amount(double billing_amount) {
		this.billing_amount = billing_amount;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}



	public int getPatient_age() {
		return patient_age;
	}



	public void setPatient_age(int patient_age) {
		this.patient_age = patient_age;
	}
	
	
	
	
	
	
	

}
