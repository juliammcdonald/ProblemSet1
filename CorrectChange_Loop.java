import java.util.Scanner;
/**
 * FILE NAME: CorrectChange_Loop.java
 * WHO: Julia McDonald
 * WHEN: September 5, 2017
 * WHAT: Class that makes change for a user-provided amount using the fewest number of bills
 *       and/or coins. This version contains a makeChangeWithOneDenomination() method that
 *       uses a loop.
 *                Implements the makeChangeWithOneDenomination() method
 */
public class CorrectChange_Loop{
  /**
   * Reads user input to determine amount of money and makes change using the 
   * makeChangeWithOneDenomination() method
   **/
  public static void main( String[] args ){
    Scanner in = new Scanner( System.in );
    System.out.println( "How much money do you want to make change for?" );
    double dTotal = in.nextDouble();
    int total = (int)(dTotal * 100);
    
    String[] dNames = { " $20 bills", " $10 bills", " $5 bills", " $1 bills", " quarters", 
      " dimes", " nickels", " pennies" };
    int[] denom = { 2000, 1000, 500, 100, 25, 10, 5, 1 };
    
    System.out.println( "We can make change for $" + dTotal + " using:" );
    
    for( int i = 0; i < dNames.length; i++ ){
      total = makeChangeWithOneDenomination( total, dNames[ i ], denom[ i ] );
      if( total == 0 )
        break;
    }
  }
  /**
   * Computes how many occurrences of the specified denomination ("denomination") should 
   * be used when making change for the specified amount of cents ("total").
   * 
   * @param total - represents the amount of money in cents that we want to make change for
   * @param denominationName - represents the name of the bill or coins
   * @param denomination - represents the amount of cents in a particular bill or coin
   * @return int - the remaining of amount of cents that we still need to make change for
   **/
  public static int makeChangeWithOneDenomination( int total, String denominationName, 
                                                  int denomination){
    int numBills = 0;
    while( total - denomination >= 0 )
    {
      total -= denomination;
      numBills++;
    }
    if( numBills != 0 )
      System.out.println( numBills + denominationName );
    return total;
  }
}