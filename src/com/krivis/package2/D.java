package com.krivis.package2;

import com.krivis.package1.A;

public class D extends A {
	
	public static void main(String args[]) {
		A obj = new A();
		//System.out.println(obj.a);
		System.out.println(obj.b);
		//System.out.println(obj.c);
		D obj1 = new D();
		System.out.println(obj1.c);
		//System.out.println(obj.d);
		
	}

}
