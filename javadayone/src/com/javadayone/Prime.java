package com.javadayone;

import java.util.Scanner;

public class Prime {
   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   int number= sc.nextInt();
	   int flag=0;
	   for(int i=2;i<number;i++) {
		   flag=0;
		   for(int j=2;j<number;j++) {
			   if(i%j==0 && i!=j) {
				   flag++;
				   break;
			   }
		   }
		   if(flag==0) {
			   System.out.println(i);
		   }
	   }

	}

}
