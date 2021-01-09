package Day6Saturday;
// Aishwariya - Hospital
public class BeanArrayList3 {
	
	
		
		
		private int drID;
		private String drname;
		private int fees;
		
		public BeanArrayList3() {};
		
		
		public BeanArrayList3(int drID, String drname, int fees) {
			super();
			this.drID = drID;
			this.drname = drname;
			this.fees = fees;
		}
		public int getDrID() {
			return drID;
		}
		public void setDrID(int drID) {
			this.drID = drID;
		}
		public String getDrname() {
			return drname;
		}
		public void setDrname(String drname) {
			this.drname = drname;
		}
		public int getFees() {
			return fees;
		}
		public void setFees(int fees) {
			this.fees = fees;
		}
		@Override
		public String toString() {
			return "HospitalBean [drID=" + drID + ", drname=" + drname + ", fees=" + fees + "]";
		}


	}



