import java.util.Scanner;

public class Objective4Lab4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int inputNum;

    System.out.println("Please enter a number: ");
    inputNum = scanner.nextInt();

    if (inputNum%2 == 1) {
      System.out.println("The number is odd");
    }
    else {
      System.out.println("The number is even");
    }
  }
}
