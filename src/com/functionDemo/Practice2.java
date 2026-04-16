package com.functionDemo;

//import java.util.function.Consumer;
import java.util.function.Function;

public class Practice2 {
	
	public static void main(String[] args) {
		
		
		Function<Integer, Integer> f = (a)->{
			
			return a;
		};
		
		System.out.println(f.apply(10));
		
		
	}

}




//class Hello{
//	
//}
//class Hii{
//	
//}
//class Hm{
//	
//}
//class Bank{
//	
//}