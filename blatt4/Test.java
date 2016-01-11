class Test {
   
   int x = 31415;
   
   public static void main(String[] args) {
      int x = Integer.parseInt(args[0]);
      
      System.out.println("Ergebnis recFun: " + recFun(x));
      System.out.println("Ergebnis  itFun: " + itFun(x));
      
      Test t1 = new Test(42);
      Test t2 = new Test(1337);
      
      
      System.out.println("x von t1: " + t1.getX());
      System.out.println("x von t2: " + t2.getX());
      System.out.println("x von main: " + x);
      
   }
   
   public Test(int x) {
      this.x = x;
   }
   
   public int getX() {
      return this.x;
   }
   
   public static int recFun(int x) {
      int erg = 0;
      if(x > 0){
         erg = x + recFun(--x);
      }
      return erg;
   }
   
   
   public static int itFun(int x) {
      int erg = 0;
      while(x > 0){
         erg = erg + x--;
      } 
      return erg;
   }

}
