import java.util.Scanner;
/**
 * determine if a number the user inputs is even or odd
 * @author Gavin
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create a scanner for user input
    Scanner input = new Scanner(System.in);
    
    // prompt the user for a number
    System.out.print("Please enter a number:");

    // get the number from the user
    int number = input.nextInt();

    int EVEN_NUMBER = 0;

    int remainder = number%2;
    
    // determine if the number is even or odd    
    if(remainder==EVEN_NUMBER){
      // tell them if the number is even
      System.out.print(number + "is an even number");
    } else {
      // or if the number is odd
      System.out.println(number + "is an odd number"); 
    }
    
  }
}
