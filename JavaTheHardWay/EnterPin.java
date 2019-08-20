import java.util.Scanner;

public class EnterPin {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int pin, entry;
    String password, passwordEntry;

    pin = 12345;
    password = "elf";

    System.out.println("WELCOME TO THE BANK OF JAVA");
    //new code, ask user for password
    System.out.print("ENTER YOUR PASSWORD: ");
    passwordEntry = keyboard.nextLine();

    while (!password.equals(passwordEntry)) {
      System.out.println("\nINCORRECT PASSWORD. TRY AGAIN.");
      System.out.print("ENTER YOUR PASSWORD: ");
      passwordEntry = keyboard.nextLine();
    }

    System.out.print("ENTER YOUR PIN: ");
    entry = keyboard.nextInt();

    while (entry != pin) {
      System.out.println("\nINCORRECT PIN. TRY AGAIN.");
      System.out.print("ENTER YOUR PIN: ");
      entry = keyboard.nextInt();
    }
    System.out.println("\nPIN & PASSWORD ACCEPTED. YOUR ACCOUNT BALANCE IS $425.17");
  }
}
