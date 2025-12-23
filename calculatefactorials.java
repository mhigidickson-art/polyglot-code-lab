package kama;
import java.util.Scanner;
public class FactorialOfNumbers {
	public static long calculateFactorial(int number){
		if(number == 0|| number == 1) {
				return 1;
		}
		
			return number*calculateFactorial(number-1);	
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.println("Enter positive Number:");
		int number = input.nextInt();
		long result = calculateFactorial(number);
		System.out.println("factorial of " + number + "is:" +result);
	}

}
