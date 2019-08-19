import java.util.Scanner;

public class RudeQuestions {
  public static void main( String[] args ) {
     String name;
     int age;
     double weight, income;
     // new var
     String nickName;

     Scanner keyboard = new Scanner(System.in);

     System.out.print( "Hello. What is your name? " );
     name = keyboard.next();
     // new question
     System.out.print( "Hi, " + name + ". What is your nick-name? " );
     nickName = keyboard.next();

     System.out.println("Wow! " + nickName + " is really embarrasing!");

     System.out.print("How old are you? " );
     age = keyboard.nextInt();

     System.out.println( "So you're " + age + ", eh? That's not very old." );
     System.out.print( "How much do you weigh, " + name + "? " );
     weight = keyboard.nextDouble();

     System.out.println( weight + "! Better keep that quiet!!" );
     System.out.print("Finally, what's your income, " + name + "? " );
     income = keyboard.nextDouble();

     System.out.print( "Hopefully that is " + income + " per hour" );
     System.out.println( " and not per year!" );
     System.out.print( "Well, thanks for answering my rude questions, " );
     System.out.println( name + "." );
   }
}
/* 1) If you enter an int when it is looking for a double it will not blow up!
   2) If a numerical value is entered it will not blow up & will be turned into
      a string!
   3) I can't get the 1st question to blow up because it is converted into a string,
      but everything else blows up by entering a different var type. (except int for double)
   4) add new question & display
*/
