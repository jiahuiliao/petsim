public class AnimalException extends Exception {
   
   /** Message that outputs when the exception happens */
   private String message = "";
   
   /**
    * Constructs an exception
    */
   public AnimalException() {
      // Empty Constructor
   }
   
   /** Accessor/get method*/
   public String getMessage() {
      return this.message;
   }   
   
   /** Mutator/set method*/
   public void setMessage(String newMessage) {
      this.message = newMessage;
   }
   
}