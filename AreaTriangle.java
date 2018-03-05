import java.util.*;
/**
 * FILE NAME: AreaTriangle.java
 * WHO: Julia McDonald and Lincy Shen
 * WHEN: September 8, 2017
 * WHAT: Class that finds the area of a user-defined triangle and determines whether or not
 *       that triangle is isosceles
 *                Implements the getArea() and isIsosceles() methods
 */
public class AreaTriangle{
  /**
   * This main prompts for and accepts user input, calls helper methods, and prints the
   * area of the triangle and whether or not it is isosceles.
   */
  public static void main( String[] args ){
    double sideA;
    double sideB;
    double sideC;
    
    Scanner sc = new Scanner( System.in );
    System.out.print( "Enter the length of the first side of the triangle: " );
    sideA = sc.nextDouble();
    
    System.out.print( "Enter the length of the second side of the triangle: " );
    sideB = sc.nextDouble();
    
    System.out.print( "Enter the length of the third side of the triangle: " );
    sideC = sc.nextDouble();
    
    if( sideA + sideB <= sideC || sideB + sideC <= sideA || sideA + sideC <= sideB ){
      System.out.println( "Invalid input" );
      return;
    }
    
    if( isIsosceles( sideA, sideB, sideC ) ){
      System.out.println( "Triangle is isosceles." );
    } else {
      System.out.println( "Triangle is NOT iscosceles." );
    }
    
    System.out.println( "The area of the triangle is " + getArea( sideA, sideB, sideC ) );
  }
  /**
   * This method finds the area of a given triangle using Heron's formula.
   * 
   * @param sideA: the first side of the triangle
   * @param sideB: the second side of the triangle
   * @param sideC: the third side of the triangle
   * 
   * @return double: the area of the triangle with side lengths sideA, sideB, and sideC
   */
  public static double getArea( double sideA, double sideB, double sideC ){
    double s = ( sideA + sideB + sideC ) / 2;
    return Math.sqrt( s * ( s - sideA ) * ( s - sideB ) * ( s - sideC ));
  }
  /**
   * This method determines whether or not a triangle is isosceles.
   * 
   * @param sideA: the first side of the triangle
   * @param sideB: the second side of the triangle
   * @param sideC: the third side of the triangle
   * 
   * @return boolean: represents whether or not the triangle has at least two 
   *  congruent side lengths
   */
  public static boolean isIsosceles( double sideA, double sideB, double sideC ){
    return ( sideA == sideB ) || ( sideB == sideC ) || ( sideA == sideC );
  }
}