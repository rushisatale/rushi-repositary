package nested_if;


public class Largest_3_num {
	
// 26.Write a program to find the largest of three numbers using nested if
	
	public static void main(String[] args) {
		
		 int a = 10;
	        int b = 20;
	        int c = 15;

	        if (a > b) {
	            if (a > c) {
	                System.out.println("Largest number is " + a);
	            } else {
	                System.out.println("Largest number is " + c);
	            }
	        } else {
	            if (b > c) {
	                System.out.println("Largest number is " + b);
	            } else {
	                System.out.println("Largest number is " + c);
	            }
	        }

   }
}
