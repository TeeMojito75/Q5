package com.junit.demo;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
 
public class CalculatorTest {

 private Calculator calc;

 @Before
 public void setUp() throws Exception {
  calc = new Calculator();
 }

 @After
 public void tearDown() throws Exception {
  calc = null;
 }

 @Test
 public void testMultiply() {
  double result = calc.multiply(2.5, 100);
  assertEquals(250, result, 0);
 }

 @Test
 public void testDivide() {
  double result = calc.divide(100, 10);
  assertEquals(10, result, 0);

 }

 @Test
 public void testDivideWithTolerance() {
  double result = calc.divide(345, 100);
  assertEquals(3.4, result, 0.1);
 }

 @Test
 public void testSum() {
  double result = calc.sum(33, 36);
  assertEquals(69, result, 0);
 }

 @Test
 public void testSubstractA() {
  double result = calc.substract(60, 29);
  assertEquals(31, result, 0);
 }

 @Test(expected = ArithmeticException.class)
 public void testSubstractB() {
  double result = calc.substract(29, 60);
 }

 @Test(expected = ArithmeticException.class)
 public void testDivideByZero() {
  calc.divide(100.5, 0);
 }

 @Test
 public void testFactorialBaseCase() {
  assertEquals(1,  calc.factorial(0), 0);
 }

 @Test
 public void testFactorialNormalCase() {
  assertEquals(3628800, calc.factorial(10), 0);
 }

 @Test(expected = ArithmeticException.class)
 public void testFactorialNegative() {calc.factorial(-5);}
}
