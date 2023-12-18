package com.junit.demo;


public class Calculator {
		  
		 public double multiply(double a, double b) {
		  return a * b;
		 }
		  
		 public double divide(double a, double b) { 
		  if(b == 0) {
		   throw new ArithmeticException();
		  }
		  return a / b;
		 }

		 public double sum(double a, double b) {return a + b;}

	     public double substract(double a, double b) {
			 if (b > a) {
				 throw new ArithmeticException();
			 }
			 return a - b;
		 }

		 public double factorial(double a) {
			 if (a == 0) return 1;
			 else if (a < 0) throw new ArithmeticException();
			 else {
					for (double i = a-1; i > 1; i--) {
						a = a * i;
					}
					return a;
			 }
		 }

}
