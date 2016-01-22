import java.util.Scanner;
public class IntStack {
   
   private int[] stack = new int[3];
   private int pntr = 0;

   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      IntStack intStack = new IntStack();
      String s;
      
      while(!(s = scan.next()).equals("exit")){
         if(s.equals("pop")){
            try{
               s = ">POP: " + Integer.toString(intStack.pop());
            } catch(StackException se){
               s = ">EMPTY";
            }
            System.out.println(s);
         } else if(s.equals("push")){
            try{
               intStack.push(scan.nextInt());
               s = ">STACK SIZE: " + intStack.getSize();
            } catch(StackException se){
               s = se.getMessage();
            }
            System.out.println(s);
         }
      }
   }
   
   public int pop() throws StackException{
      if(pntr==0){
         throw new StackException();
      }
      return stack[--pntr];
   }
   
   public void push(int x) throws StackException {
      if(pntr == stack.length){
         throw new StackException(pntr);
      }
      stack[pntr++] = x;
   }
   
   public int getSize(){
      return pntr;
   }
}