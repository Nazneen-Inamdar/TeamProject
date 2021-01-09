package day3.Practice;


class Example1 
{
    public static void main(String args[]) 
    {        
        EquateObj obj1 = new EquateObj();
        EquateObj obj2 = new EquateObj();
        obj1.name = "Nazneen";
        obj1.age = 22;
        obj1.id = 101;
        obj1.gender = 'F';
        
        obj2 = obj1;
        /*When we assign an object to another object of same type,
          all the elements of right side object gets copied to object
          on left side of equal to '=' operator.*/
        
        System.out.println(obj2.name);
    } 
}