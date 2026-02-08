/**********************************************
* Main.java 
* John Young
* 
* Advanced Java Programming - BCIS 3342 - 021
* Unit 2 Assigment
* Due Date: February 2, 2025
* The main class for the AvergaeValue.java
***********************************************/
  
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner stdIn = new Scanner(System.in);
    
    String more = "y"; // More items value

    AverageValue avg = new AverageValue(); // Create an instance of AverageValue

    while (more.equals("y"))
      {
        avg.accumulate();
        do
          {
            System.out.print("More? (y/n): ");
            more = stdIn.nextLine();
            more = more.toLowerCase();
          } while (!more.equals("y") && !more.equals("n"));
      }
    avg.printAverage();
    
  }  // end main method

}  // end Main class