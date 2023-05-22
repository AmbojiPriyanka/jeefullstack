package com.javadayone;
import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter n to find the nth value in Fibonacci sequence:");
	int n = input.nextInt();
	System.out.println("Non-recursive Fibonacci:"+fibNonRecursive(n));
	System.out.println("recursive Fibonacci:"+fibRecursive(n));
}		
   public static int fibNonRecursive(int n) {
	if(n<=1) {
		return n;
	}
	int fib=1;
	int prevFib=1;
	
	for(int i=2;i<n;i++) {
		int temp=fib;
		fib +=prevFib;
		prevFib=temp;
	}
	return fib;
} 
   public static int fibRecursive(int n) {
	   if(n<=1) {
		   return n;
	   }
	   return fibRecursive(n-1)+fibRecursive(n-2);
   }
}
