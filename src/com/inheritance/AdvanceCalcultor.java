package com.inheritance;

public class AdvanceCalcultor extends Calculator{
	
	@Override
	public void add(int x,int y) {
		
		super.add(x, y);
		System.out.println("Multiplication : "+(x*y));
		System.out.println("Division : "+(x/y));
		
	}

	public void add(int a,int b,int c) {
		
		System.out.println("Addition of 3 numbers :"+(a+b+c));
		
	}
	
	public static void main(String[] args) {
		
		AdvanceCalcultor ac = new AdvanceCalcultor();
		ac.add(24, 2);
	}
}
