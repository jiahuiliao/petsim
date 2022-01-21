// Imports classes necessary to run program (e.g. scanner for user input)
import java.util.*;
/**
 * Program has user create an Animal class with input to name and type
 * User can pet the animal until satisfied
 * 
 * @author     Liao, Jiahui
 * @assignment ICS 111 Final Exam
 * @date       08/14/20
 * @bugs       Wasn't able to continously let user input name/type
 *             until valid :(( 
 */

public class LiaoJiahuiFINAL {
   public static void main (String[] args) throws AnimalException{
      
      // Creates scanner class for user input
      Scanner input = new Scanner(System.in);
      
      // Variables used in program
      String tryName = "";
      String tryType = "";
      int user = 0;
      
      // Exclamation! Program starts
      System.out.println("Wow! You got a pet!?!?");
      
      // Large try/catch used to catch thrown AnimalException(s)
      try {
         // Creates Animal class for user to alter
         Animal baby = new Animal("name", "type");
         System.out.println("What kind of animal is your pet?");
         // Stores input into tryType, which is then used to set newType
         tryType = input.nextLine();
         if (tryType.length() < 1) {
            while (tryType.length() < 1) {
               baby.setType(tryType);
               System.out.println("So.. what type is it actually?");
               tryType = input.nextLine();
            }
         }
         else {
            baby.setType(tryType);
            System.out.println("A " + baby.getType() + "?! That's so cool!");
            System.out.println("What is your " + baby.getType() + "'s name?");
            // Stores input into tryName, which is then used to set newName
            tryName = input.nextLine();
            if (tryName.length() < 3) {
               while (tryName.length() < 3) {
                  baby.setName(tryName);
                  System.out.println("Cmon now.. What's its real name?");
                  tryName = input.nextLine();
               }
            }
            else {
               baby.setName(tryName);
               System.out.println(baby.getName() + "! So cute! Can I pet him?");
               System.out.println("(Press 1 for yes or 2 for no)");
               // Asks user input if they want to pet!
               user = input.nextInt();
               // Nestled statements to continuously ask if the user wants to pet
               if (user == 1) {
                  while (user == 1) {
                     System.out.println(baby.pet());
                     System.out.println("(Press 1 for yes or 2 for no)");
                     user = input.nextInt();
                        if (user == 2) {
                           System.out.println("\nAh, alrighty. It was nice meeting " + baby.getName() + "!");
                        }
                        else {
                           System.out.println("D: Please enter 1 or 2!");
                        }
                  }
               }
               // Exits the program if the user does not want to pet
               else if (user == 2) {
                  System.out.println("\nAh, alrighty. It was nice meeting " + baby.getName() + "!");
               }
               // Executes code if user does not enter 1 or 2
               else {
                  System.out.println("D: Please enter 1 or 2!");
                  System.out.println("Why dont you try again?");
                  System.out.println("(Press 1 for yes or 2 for no)");
                  user = input.nextInt();
               }
            }
         }   
      }
      // Catches thrown AnimalExceptions in the case of name or type
      // does not have the valid set length
      catch (AnimalException ae) {
         System.out.println(ae.getMessage());
      }
   }
}