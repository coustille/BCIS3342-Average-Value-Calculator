/*************************************************************
* AverageValue.java
* John Young
* 
* Advanced Java Programming - BCIS 3342 - 021
* Unit 2 Assigment
* Due Date: February 2, 2025
* This class represents average value.
*************************************************************/

import java.util.Scanner;

public class AverageValue {
  private double cumulativeValue = 0.0;
  private int count = 0;

  // Output the average value
  public void printAverage() {
    System.out.println("Average value = " + this.cumulativeValue / this.count);
  } // end printAverage method
  // *************************************************************

  // Accumulate the average value.
  public void accumulate() {
    double MIN = 0.5;  // Minimum value
    double MAX = 5.0;  // Maximum value
    this.count++;
    System.out.print("Item Number " + this.count + ": ");
    this.cumulativeValue += inputValue(MIN, MAX);
  } // end method accumulate
  // *************************************************************

  // Input a value from the user.
  private double inputValue(double MIN, double MAX) {
    Scanner stdIn = new Scanner(System.in);
    double value = 0.0;
    do {
      System.out.print("Enter value (" + MIN + " < value < " + MAX + "): ");
      value = stdIn.nextDouble();
    } while (value < MIN || value > MAX);
    return value;
  } // end inputValue method
} // end AverageValue class