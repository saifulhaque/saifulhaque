package com.usa.learningjava;

public class birds  {

      public void nicebirds() {
    	  System.out.println("red bird");
    	  
      }
      public static void uglybirds() {
    	  System.out.println("black bird");
      }
public static int richbirds() {
	System.out.println("white bird");
	return 0;
}
public static void main(String[] args) {
	birds call = new birds();
	call.nicebirds();
	birds.uglybirds();
	birds.richbirds();
			
}
}
