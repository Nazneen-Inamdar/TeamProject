package day4.InnerClass;

import day4.InnerClass.OuterClass.InnerClass;

public class TestInnerClass {

	public static void main(String[] args) {
		OuterClass outerClass = new OuterClass();
		System.out.println(outerClass.x);
		InnerClass innerClass = outerClass.new InnerClass();
		System.out.println(innerClass.y);
		}
}
