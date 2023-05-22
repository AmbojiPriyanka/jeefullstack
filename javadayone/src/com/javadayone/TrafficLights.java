package com.javadayone;
import java.util.*;
public class TrafficLights {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String radioButtons =sc.next();
    switch(radioButtons) {
    case "red":
    	System.out.println("stop");
    	break;
    case "yellow":
    	System.out.println("ready");
    	break;
    case "green":
    	System.out.println("go");
    	break;
    	default:
    		System.out.println("no traffic");
      }
   }

}
