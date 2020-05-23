package com.krivis.package1;

public class B {
	
	public static void main(String args[]) {
		
		A obj = new A();
		//System.out.println(obj.a); //private variables cant be accessed
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(obj.d);
	}

}
