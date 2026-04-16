package com.genericDemo2;

import java.util.Arrays;
import java.util.Iterator;

public interface Test <T,U>{

	void show(T t, U u);
	
	public static void main(String[] args) {
		
		
		Test <Integer,String> t =(a,b)->{
			
			System.out.println(a+b);
		};
		t.show(05, " Rushi");
		
		
		Test <Integer,Float> t2=(a,b)->{
			
			System.out.println(a-b);
		};
		
		t2.show(25, 2.5f);
		
		
		//void show(Integer,String[]);
		
		Test <Integer, String[] >t3=(i,j)->{
			
			System.out.println(i);
			System.out.println(Arrays.toString(j));
//			for(String str:j) {
//				System.out.println(str);
//			}
				
		};
		t3.show(101, new String[] {"Rushi,Vitthal,Sangha,Utkarsh"});

	}
	
	}
