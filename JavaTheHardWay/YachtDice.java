public class YachtDice {
    public static void main( String[] args ) {
       int r1, r2, r3, r4, r5, r6; //added a sixth dice
       boolean allSame;
      // for fun  int counter = 0;

       do {
           r1 = 1 + (int)(Math.random()*6);
           r2 = 1 + (int)(Math.random()*6);
           r3 = 1 + (int)(Math.random()*6);
           r4 = 1 + (int)(Math.random()*6);
           r5 = 1 + (int)(Math.random()*6);
           r6 = 1 + (int)(Math.random()*6);
           System.out.print("\nYou rolled: " + r1 + " " + r2 + " ");
           System.out.println(r3 + " " + r4 + " " + r5);
           showDice(r1);
           showDice(r2);
           showDice(r3);
           showDice(r4);
           showDice(r5);
           showDice(r6);
           //counter++;    for fun
           //added r6 to allSame
           allSame = ( r1 == r2 && r2 == r3 && r3 == r4 && r4 == r5 && r5 == r6 );

         } while ( ! allSame );
        System.out.println("The Yacht!!");
        //System.out.println("It took: " + counter + " tries! ");    for fun
      }

      public static void showDice( int roll ) {
           System.out.println("+---+");

           if(roll==1){
               System.out.println("|   |");
               System.out.println("| o |");
               System.out.println("|   |");
            }
            else if(roll==2){
                     System.out.println("|o  |");
                     System.out.println("|   |");
                     System.out.println("|  o|");
            }
            else if(roll==3){
                     System.out.println("|o  |");
                     System.out.println("| o |");
                     System.out.println("|  o|");
            }
            else if(roll==4){
                     System.out.println("|o o|");
                     System.out.println("|   |");
                     System.out.println("|o o|");
            }
            else if(roll==5){
                     System.out.println("|o o|");
                     System.out.println("| o |");
                     System.out.println("|o o|");
            }
            else if(roll==6){
                     System.out.println("|o o|");
                     System.out.println("|o o|");
                     System.out.println("|o o|");
            }
      System.out.println("+---+");
  }
}
