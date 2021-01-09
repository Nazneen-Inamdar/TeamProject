package Day6Saturday;


//filename Main.java 
class Point { 
	protected int x, y; 

	public Point(int _x, int _y) 
	{ 
		x = _x; 
		y = _y; 
	} 
} 

public class Main { 
	public static void main(String args[]) 
	{ 
		Point p = new Point(0, 0); 
		System.out.println("x = " + p.x + ", y = " + p.y); 
	} 
} 

