import java.util.*;

public class AdditionZweierZahlen{
       double Summand1;
       double Summand2;
       double Summe;
       
       
       public void eingabe() {
              Scanner zahl1 = new Scanner(System.in); 
              System.out.print("Bitte geben Sie die 1. Zahl ein: ");    
              Summand1 = zahl1.nextDouble();
              
              Scanner zahl2 = new Scanner(System.in);
              System.out.print("\nBitte geben sie die 2. Zahl ein: ");
              Summand2 = zahl2.nextDouble();

       }
  
       public void verarbeitung() {
              Summe = Summand1 + Summand2;         
       }
  
       private void ausgabe() {
               System.out.println("\nAusgabe Ergebnis: ");
               System.out.println(Summand1 + " + "  + Summand2 + " = " + Summe);
              
       }
  
       public static void main(String[] arg) {
    
              AdditionZweierZahlen azz1;
              azz1  = new AdditionZweierZahlen();
              
              System.out.println("*****************************************");
              System.out.println("\t Addition zweier Zahlen");
              System.out.println("***************************************** \n");
    
              azz1.eingabe();
              azz1.verarbeitung();
              azz1.ausgabe();
                  
       }

  }