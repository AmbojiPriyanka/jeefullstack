package com.javadayone;
import java.util.Scanner;
   class SumOfCubes {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);      
		int number =sc.nextInt();
		int remainder=0, sum=0,mul=1;
        while(number%10!=0){
        	remainder=number%10;
        	mul=remainder*remainder*remainder;
        	sum=sum+mul;
        	number=number/10;
        }
        	System.out.println(sum);
        }
	}

