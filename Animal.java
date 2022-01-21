/**
 * 
 * 
 * @author     Liao, Jiahui
 * @assignment ICS 111 Final Exam
 * @date       08/14/20
 * @bugs       I hope I am the only bug visible.
 */

public class Animal {
   private String name = "";
   private String type = "";
   
   /**
    * Constructs an Animal object
    *
    * @param   name  The name of the animal
    * @param   type  The type/breed of the animal
    */
   public Animal(String name, String type) {
      this.name = name;
      this.type = type;
   }
   
   //** Accessor Methods */
   public String getName() {
      return this.name = name;
   }
   public String getType() {
      return this.type = type;
   }
   
   //** Mutator Methods */
   public void setName(String newName) throws AnimalException{
      if (newName.length() >= 1) {
         this.name = newName;
      } 
      else {
         AnimalException ae = new AnimalException();
         ae.setMessage(newName + " doesn't seem to be a name, though?");
         throw ae;
      }
   }
   public void setType(String newType) throws AnimalException{
      if (newType.length() >= 3) {
         this.type = newType;
      }
      else {
         AnimalException ae = new AnimalException();
         ae.setMessage(newType + " ?.. That doesn't sound correct..");
         throw ae;
      }
   }
   /** 
    * Returns a printable string of the instance variables
    * For example, an object new Animal("Applebee", "bee");
    *    
    *    Name of Animal: Applebee
    *    Type of Animal: bee
    *
    * @return  output   A printable string of instance variables
    */
   public String toString() {
      String output = "";
      output += "Name of Animal: " + name;
      output += "\nType of Animal: " + type;
      return output;
   }
   
   public String pet() {
      String result = "";
       double num = (double)(Math.random() * 11);
      if (num <= 9.0) {
         result += "** " + name + " liked that! **";
         result += "\nuWAA so cute! ;;; Can I pet him again?";
         return result;
      }
      else {
         result += "** " + name + " tries to bite your hand.. yikes! **";
         result += "\nOh no D: ! Can I try to pet him again?";
         return result;
      }
   }
}