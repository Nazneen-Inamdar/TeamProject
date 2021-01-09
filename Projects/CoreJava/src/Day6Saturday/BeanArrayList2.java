package Day6Saturday;
// Arohi- Car

public class BeanArrayList2 
{
	private int CarNo;
	private String CarName;
	private int CarPrice;
	
	public BeanArrayList2()
	{
		
	}

	public BeanArrayList2(int CarNo, String CarName, int CarPrice) {
		super();
		this.CarNo = CarNo;
		this.CarName = CarName;
		this.CarPrice = CarPrice;
	}

	public int getCarNo() {
		return CarNo;
	}

	public void setCarNo(int CarNo) {
		this.CarNo = CarNo;
	}

	public String getCarName() {
		return CarName;
	}

	public void setCarName(String CarName) {
		this.CarName = CarName;
	}

	public int getCarPrice() {
		return CarPrice;
	}

	public void setCarPrice(int CarPrice) {
		this.CarPrice = CarPrice;
	}

	@Override
	public String toString() {
		return "Car [CarNo=" + CarNo + ", CarName=" + CarName + ", CarPrice=" + CarPrice + "]";
	}
	
	

}

