//author: Sara Russert
//date: 20 February 2024
//file: Fraction.java

public class Fraction {
   // private fields for numerator and denominator
   private int num;
   private int denom;
   
   // constructor
   public Fraction(int n, int d) {
      // set attributes to given integer values
      num = n;
      setDenom(d);
      this.reduce();
      this.adjustSign();
   }
   
   // setter for num
   public void setNum(int n) {
      num = n;
   }
   
   /**
    setDenom
    setter for denom state, prevents a zero as the fraction denominator
    @param1 int d
    @return void
   */
   public void setDenom(int d) {
      // don't allow the denom to be set to zero
      if (d != 0)
         denom = d;
      else {
         // inform user that zero is not permitted and set denom to 1
         System.out.println("For Fraction: " + this.toString() + ":");
         System.out.println("Denominator cannot be zero; denominator value is being reset to one.");
         denom = 1;
         System.out.println("The Fraction is now: " + this.toString());
      }
   }
   
   // getter for num
   public int getNum() {
      return num;
   }
   
   // getter for denom
   public int getDenom() {
      return denom;
   }
   
   
   /**
    multiply
    multiplies two fractions and returns a new resulting fraction
    @param1 Fraction f2
    @return Fraction
   */
   public Fraction multiply(Fraction f2) {
      // declar vars for new fraction values
      int newNum, newDenom;
      
      // get the new num by multipling the two nums
      newNum = this.getNum() * f2.getNum();
      
      // same for denominator
      newDenom = this.getDenom() * f2.getDenom();
      
      // instantiate new fraction with new values
      return new Fraction(newNum, newDenom);
   }
   
   // returns fraction in string format
   public String toString() {
      // var for new string
      String strFraction;
      
      if (denom == 1)
         strFraction = "( " + num + " )";
      else
         strFraction = "( " + num + " / " + denom + " )";
      
      return strFraction;
   }
   
   /**
     gcd
     method to compute the greatest common denominator
     @param1 int a - first integer
     @param2 int b - second integer
     @return int - the gcd of the two ints
   */
   public static int gcd(int a, int b) {
      // declare local var for remainder
      int remainder = 0;
      
      // use while loop to determine gcd of a and b
      while (b != 0) {
         remainder = a % b;
         a = b;
         b = remainder;
      }
      
      // return the value of a
      return a;
   }
   
   
   /**
    getDouble
    returns the floating-point representation of the fraction
    no params
    @return double - fp rep of the fraction
   */
   public double getDouble() {
      // turn denominator into a double so we get a double result
      int denomInt; 
      denomInt = this.getDenom();
      double denominator = Double.valueOf(denomInt);
      // return num/denom
      return getNum()/denominator;
   }
   
   
   /**
    reduce
    returns the floating-point representation of the fraction
    no params
    @return void
   */
   public void reduce() {
      // update the num and denom in state by dividing both by gcd
      int gcdValue = gcd(this.getNum(),this.getDenom());
      num /= gcdValue;
      denom /= gcdValue;
   }
   
   
   /**
    adjustSign
    modifies the signs of the numerator and/or denominator
    no params
    @return void
   */
   public void adjustSign(){
      int n = getNum();
      int d = getDenom();
      
      // if num and denom are neg numbers or if only denom is negative
      // swap the signs of the num and denom
      if ((n < 0 && d < 0) || d < 0) {
         num = -n;
         denom = -d;
      } 
   }
   
   
   /**
    divide
    divides two fractions and returns a new resulting fraction
    @param1 Fraction f2
    @return Fraction
   */
   public Fraction divide(Fraction f2) {
      // declar vars for new fraction values
      int newNum, newDenom;
      
      // (a*d)/(b*c)
      newNum = this.getNum() * f2.getDenom();
      
      newDenom = this.getDenom() * f2.getNum();
      
      // instantiate new fraction with new values
      return new Fraction(newNum, newDenom);
   }
   
    /**
    add
    adds two fractions and returns a new resulting fraction
    @param1 Fraction f2
    @return Fraction
   */
   public Fraction add(Fraction f2) {
      // declar vars for new fraction values
      int newNum1, newNum2, newDenom, totalNum;
      int f1Denom = this.getDenom();
      int f2Denom = f2.getDenom();
      
      // ((a*d)+(b*c))/(b*d)
      newNum1 = this.getNum() * f2Denom;
      
      newNum2 = f1Denom * f2.getNum();
      
      newDenom = f1Denom * f2Denom;
      
      totalNum = newNum1 + newNum2;
      
      // instantiate new fraction with new values
      return new Fraction(totalNum, newDenom);
   }
   
   /**
    subtract
    subtracts two fractions and returns a new resulting fraction
    @param1 Fraction f2
    @return Fraction
   */
   public Fraction subtract(Fraction f2) {
      // declar vars for new fraction values
      int newNum1, newNum2, newDenom, totalNum;
      int f1Denom = this.getDenom();
      int f2Denom = f2.getDenom();
      
      // ((a*d)-(b*c))/(b*d)
      newNum1 = this.getNum() * f2Denom;
      
      newNum2 = f1Denom * f2.getNum();
      
      newDenom = f1Denom * f2Denom;
      
      totalNum = newNum1 - newNum2;
      
      // instantiate new fraction with new values
      return new Fraction(totalNum, newDenom);
   }
   
}