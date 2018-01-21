package com.usa.paracticejava;

public class Animal {
	
	
	
	//void
	//static void
	//static non void
	
	
	public void salary() {
		System.out.println("hello world");
		
		
	}
	
	
	public static void income () {
		System.out.println("hello all");	
	}
	
	public static int getsalary() {
		System.out.println("hi");	
		return 0;
		
		
	}
	
	public static void main(String[] args) {
		
		Animal obj=new Animal();
		obj.salary();
		
		Animal.getsalary();
		Animal.income();
		
	}
	

}
