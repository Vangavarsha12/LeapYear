import java.util.Scanner;

public class Leapyear {
   public Leapyear() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter a year: ");
      int var2 = var1.nextInt();
      if ((var2 % 4 != 0 || var2 % 100 == 0) && var2 % 400 != 0) {
         System.out.println("" + var2 + " is not a leap year.");
      } else {
         System.out.println("" + var2 + " is a leap year.");
      }

      var1.close();
   }
} 
    

