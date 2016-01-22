public class StackException extends Exception {
   public StackException(){
       super();
   }
    
   public StackException(int i){
      super(">STACK FULL\n>STACK MAX SIZE: " + i);
   }
}
