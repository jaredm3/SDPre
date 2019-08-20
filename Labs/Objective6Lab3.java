public class Objective6Lab3 {
  public static void main(String[] args) {
    int counter = 1;
    String even = "even";
    String odd = "odd";
    String holder = "";

    while (counter <= 20) {
        if (counter%2 == 0) {
          holder = "even";
        }
        else {
          holder = "odd";
        }
      System.out.println(counter + " is " + holder);
      counter++;
    }
  }
}
