import java.util.Scanner;

public class BMICategories {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);

    double m, kg, bmi;
    double inches, feet, pounds, totalInches;

    System.out.print( "Your height (feet only): " );
    feet = keyboard.nextDouble();

    System.out.print( "Your height (inches only): " );
    inches = keyboard.nextDouble();

    System.out.print( "Your weight in pounds: " );
    pounds = keyboard.nextDouble();

    totalInches = (feet*12) + inches;
    m = totalInches/39.37;
    kg = pounds/2.205;

    bmi = kg / (m*m);

  System.out.print( "BMI category: " );
  if ( bmi < 15.0 ) {
      System.out.println( "very severely underweight" );
      }
  else if ( bmi <= 16.0 ) {
      System.out.println( "severely underweight" );
     }
  else if ( bmi < 18.5 ) {
      System.out.println( "underweight" );
      }
//This next if statement breaks the rank bc it doesnt include 'else'.
  if ( bmi < 25.0 ) {
      System.out.println( "normal weight" );
      }
  else if ( bmi < 30.0 ) {
      System.out.println( "overweight" );
      }
  else if ( bmi < 35.0 ) {
      System.out.println( "moderately obese" );
      }
  else if ( bmi < 40.0 ) {
      System.out.println( "severely obese" );
      }
    else {
        System.out.println( "very severely/\"morbidly\" obese" );
    }
  }
}
