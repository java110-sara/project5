//author: Sara Russert
//date: 20 February 2024
//file: FractionDemo.java

import java.util.Scanner;

public class FractionDemo {
   public static void main(String[] args) {
      // vars for two fractions
      int num1, num2, den1, den2;
      
      // create scanner object
      Scanner keyboard = new Scanner(System.in);
      
      // get integers for f1
      System.out.print("Enter the numerator of the first fraction:  ");
      num1 = keyboard.nextInt();
      System.out.print("Enter the denominator of the first fraction:  ");
      den1 = keyboard.nextInt();
      
      // get integers for f2
      System.out.print("Enter the numerator of the second fraction:  ");
      num2 = keyboard.nextInt();
      System.out.print("Enter the denominator of the second fraction:  ");
      den2 = keyboard.nextInt();
      
      // instantiate the two fractions
      Fraction f1 = new Fraction(num1, den1);
      Fraction f2 = new Fraction(num2, den2);
      
      // display the two fractions
      System.out.println("f1 == " + f1.toString());
      System.out.println("f2 == " + f2.toString());
      
      // display getDouble of fractions
      System.out.printf(f1.toString() + " == %.4f\n", f1.getDouble());
      System.out.printf(f2.toString() + " == %.4f\n", f2.getDouble());
      
      // multiply the two fractions and store the product in f3
      Fraction f3 = f1.multiply(f2);
      
      // display f3
      System.out.println(f1.toString() + " * " + f2.toString() + " == " + f3.toString());
      
      // divide the two fractions and store the product in f3
      f3 = f1.divide(f2);
      
      // display f3
      System.out.println(f1.toString() + " / " + f2.toString() + " == " + f3.toString());
      
      // add the two fractions and store the product in f3
      f3 = f1.add(f2);
      
      // display f3
      System.out.println(f1.toString() + " + " + f2.toString() + " == " + f3.toString());
      
      // subract the two fractions and store the product in f3
      f3 = f1.subtract(f2);
      
      // display f3
      System.out.println(f1.toString() + " - " + f2.toString() + " == " + f3.toString());
      
   }
}