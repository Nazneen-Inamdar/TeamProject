package day4.ArrayList;

import java.util.*;

public class Example7 {

 // ArrayList of salaries (int)
public static void main(String[] args) {
ArrayList<Integer> salariesList = new ArrayList<Integer>();
salariesList.add(15000);
salariesList.add(16000);
salariesList.add(10000);
salariesList.add(5000);

//Collections.sort(salariesList);-->used to sort the arrayList
//Collections.reverse(salariesList); --> just reverses the ArrayList in descending order
Collections.sort(salariesList, Collections.reverseOrder()); //sorts and reverses the list

for(int x:salariesList) {
System.out.println(x);
}
}
}
