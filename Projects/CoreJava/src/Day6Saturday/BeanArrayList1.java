package Day6Saturday;

// Noorul - Smartphone
	public class BeanArrayList1 {

		String name;
		int price;
		
		
		public BeanArrayList1(String name, int price) {
			super();
			this.name = name;
			this.price = price;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		@Override
		public String toString() {
			return "BeanArrayList1 [name=" + name + ", price=" + price + "]";
		}
		
		
	}



