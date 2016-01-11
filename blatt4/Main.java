class Main {
   public static void main(String[] args) {
      Seil seil = new Seil(42);
      System.out.println(seil.gibLaenge());
      Seil seil2 = new Seil(10);
      seil2.halbiere();
      System.out.println(seil2.gibLaenge());
      
   }
}
