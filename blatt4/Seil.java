class Seil {
   private double laenge;

   Seil(double laenge) {
      this.laenge = laenge;
   }
   
   void halbiere() {
      laenge /= 2;
   }
   
   double gibLaenge() {
      return laenge;
   }
}
