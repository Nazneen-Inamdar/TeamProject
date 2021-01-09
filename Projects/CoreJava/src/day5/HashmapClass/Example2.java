package day5.HashmapClass;
//Map is an interface which is implemented by HashMap
import java.util.*;
public class Example2 {

 public static void main(String[] args) {
Map<String, String> State_cities = new HashMap<String, String>();

State_cities.put("Maharashtra","Pune"); // adds key value pair to HashMap
State_cities.put("Gujrat","Vadodara");
State_cities.put("Telangana","Hydrabad");
State_cities.put("Maharashtra","Sangli");
State_cities.put("Noida","Delhi"); 
System.out.println(State_cities);
}
}
