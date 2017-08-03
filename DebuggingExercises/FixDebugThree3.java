// This application gets a user's name and displays a greeting
import java.util.Scanner;
public class FixDebugThree3 {
   private static String name;

   public static void main(String args[]) {
      getName();
      displayGreeting(name);
   }
   public static String getName() {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter name >>> ");
      name = input.next();
      return name;
   }
   public static void displayGreeting(String name) {
      System.out.println("Hello, " + name + "!");
   }
}
