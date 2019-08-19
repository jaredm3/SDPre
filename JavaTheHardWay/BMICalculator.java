import java.util.Scanner;

public class BMICalculator {
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

     System.out.println( "Your BMI is " + bmi );
   }
 }
