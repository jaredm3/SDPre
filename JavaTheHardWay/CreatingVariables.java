public class CreatingVariables {
  public static void main(String[] args) {
    int x, y, age, limbs;
    double seconds, e, checking, weight;
    String firstName, lastName, title, nickName, hobby;

    x = 10;
    y = 400;
    age = 39;
    limbs = 4;

    seconds = 4.71;
    e = 2.71828182845904523536;
    checking = 1.89;
    weight = 170.45;

    firstName = "Graham";
    lastName = "Mitchell";
    title = "Mr.";
    nickName = "fast";
    hobby = "eating";

    System.out.println("The variable x contains " + x);
    System.out.println("The value " + y + " is stored in the variable y.");
    System.out.println("The experiment took " + seconds + " seconds.");
    System.out.println("A favorite irrational # is Euler's number: " + e );
    System.out.println("Hopefully you have more than $" + checking + "!") ;
    System.out.println("My name's " + title + " " + firstName + lastName);
    System.out.println("I have " + limbs + " limbs. I weight " + weight + "lbs.");
    System.out.println("My nickname is " + nickName + " and I enjoy " + hobby + ".");
  }
}
