package day3.Polymorphism.MethodOverriding;

public class TestAnimal {

	public static void main(String[] args) {
		Animal a1 = new Animal();
		
		Pig p1 = new Pig();
		
		Dog d1 = new Dog();
		
		a1.animalSound();
		p1.animalSound();
		d1.animalSound();
	}
}
