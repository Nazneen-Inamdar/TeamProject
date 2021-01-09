package day1.AllInOne;
// Hospital Management
public class All_in_One {

	public static void main(String[] args) {
		
		int id1 = 101, id2=102, id3=103;
		
		/* Name of the patients
		 admitted in the hospital */
		
		String patient_name1="Varun Dhawan" ;
		String patient_name2="Alia Bhatt" ;
		String patient_name3=" Tiger Shroff" ;
		
		/* Types of diseases 
		 on which treatment is available */
		
		int fev=200;
		int cold=100;
		int typhoid=1000;
		
		int ch=5;
		 
		switch(ch)  {
	
		  		case 1:   
		  			 int id=102;
		  			 String name="Alia Bhatt";
		  			System.out.println("Patient has fever !! ");
				    System.out.println("Charges for fever are : " + (double)fev);

		  			
		  			if(id==id1 && name==patient_name1)
		             { 
			             System.out.println(name+"with id : "+id + " has fever");
		             }
		  
			      else if(id==id2 && name==patient_name2)
			         {
				   System.out.println(name+"with id : "+id + " has fever");
			         }
		  
			      else 
			      {
			    	  System.out.println(name+"with id : "+id + " has fever");
			      }
		  break;
		
		
	
	
	
		}
	
		}
	}	
	
	
	
	

	

