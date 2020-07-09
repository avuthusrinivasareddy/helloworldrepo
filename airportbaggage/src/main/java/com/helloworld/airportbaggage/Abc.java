package com.subaru.tele.cloud.api;

class A {
	static {
		System.out.println("A");
	}
	
	{
		System.out.println("AA");
	}
} 

public class Abc extends A {
	static {
		System.out.println("B");
	}
	
	{
		System.out.println("BB");
	}
	
	public static void main(String args[]) {
		new Abc();
		
		new InnerChild().helloInner();
	}
	
}

class Outer {
	class Inner {
		private int i;
		Inner() {
			i = 10;
		}
		
		public void helloInner() {
			System.out.println("I am from Inner class");
			System.out.println("i value ="+i);
		}
	}
}

class InnerChild extends Outer.Inner {
	InnerChild() {
		new Outer().super();
	}
}
 
