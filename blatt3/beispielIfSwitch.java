public class Test{
   public static void main(String[] args){
      // Der Aufruf *.length gibt bei einem Array die Laenge des Arrays zurueck
      int argsLaenge = args.length;
      System.out.println("Laenge des args-Arrays: "+ argsLaenge);
      
      System.out.println();
      System.out.println("Ausgabe der if-Anweisung:");
      // Wenn die Laenge des Arrays gleich 0 ist...
      if (argsLaenge == 0){
         // ... tue dies.
         System.out.println("Keine Parameter uebergeben!");
      // Ansonsten, wenn Laenge des Arrays gleich 1 ist...
      } else if(argsLaenge == 1){
         // ... tue dies.
         int x = Integer.parseInt(args[0]);
         int y = x + 1;
         System.out.println(x + " + 1 = " + y);
      // Falls kein vorheriger Fall passte, ...
      } else {
         // tue dies.
         System.out.println(argsLaenge + " Parameter uebergeben.");
      }
      
      System.out.println();
      System.out.println("Ausgabe der switch-Anweisung:");
      // Tue unterschiedliche Dinge in Abghaengigkeit von argsLaenge.
      switch (argsLaenge){
         // Wenn argsLaenge gleich 0 ist:
         case 0:  System.out.println("Keine Parameter uebergeben!");
                  break;
         // Wenn argsLaenge gleich 1 ist:
         case 1:  int x = Integer.parseInt(args[0]);
                  int y = x + 1;
                  System.out.println(x + " + 1 = " + y);
                  break;
         // Wenn kein vorheriger Fall gepasst hat:
         default: System.out.println(argsLaenge + " Parameter uebergeben.");
      }
   }
}
