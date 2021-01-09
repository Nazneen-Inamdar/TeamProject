package day4.Interfaces.Combined;

public class Architect extends Human implements MathGenius, Artist {

	@Override
	public void draw() {
		System.out.println("Architect can draw very well");
		
	}

	@Override
	public void calculate() {
		System.out.println("Architect is very good in calculations");
		
	}
	}
