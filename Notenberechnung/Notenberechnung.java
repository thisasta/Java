import java.util.*;
import java.text.*;
import java.lang.*;
import java.io.*;

public class Notenberechnung{
  
  int noteEins;
  int noteZwei;
  int noteDrei;
  int noteVier;
  int noteFünf;
  int noteSechs;
  double anzahlSchüler;
  double notendurchschnitt;
  double roundDbl;
  
  public void eingabe() {
  
         Scanner scn1 = new Scanner(System.in);
         System.out.print("Bitte geben Sie die Anzahl der Note 1 ein: ");
         noteEins = scn1.nextInt();
    
         Scanner scn2 = new Scanner(System.in);
         System.out.print("Bitte geben Sie die Anzahl der Note 2 ein: ");
         noteZwei = scn2.nextInt();
    
         Scanner scn3 = new Scanner(System.in);
         System.out.print("Bitte geben Sie die Anzahl der Note 3 ein: ");
         noteDrei = scn3.nextInt();
    
         Scanner scn4 = new Scanner(System.in);
         System.out.print("Bitte geben Sie die Anzahl der Note 4 ein: ");
         noteVier = scn4.nextInt();
    
         Scanner scn5 = new Scanner(System.in);
         System.out.print("Bitte geben Sie die Anzahl der Note 5 ein: ");
         noteFünf = scn5.nextInt();
    
         Scanner scn6 = new Scanner(System.in);
         System.out.print("Bitte geben Sie die Anzahl der Note 6 ein: ");
         noteSechs = scn6.nextInt();
  
    }
  
  public void verarbeitung() {
    
         anzahlSchüler = noteEins + noteZwei + noteDrei + noteVier + noteFünf + noteSechs;
         notendurchschnitt = (1 * noteEins + 2 * noteZwei + 3 * noteDrei + 4 * noteVier + 5 * noteFünf + 6 * noteSechs) / anzahlSchüler; 
         roundDbl = Math.round(notendurchschnitt * 100.0) / 100.0;    
    
  }
  
  public void ausgabe() {
  
         System.out.println("\nAuswertung:");
         System.out.println("Insgesamt haben " + anzahlSchüler + " Schüler an der Klassenarbeit teilgenommen. \n");
         System.out.println("Note 1: " + noteEins + " Schüler");
         System.out.println("Note 2: " + noteZwei + " Schüler");
         System.out.println("Note 3: " + noteDrei + " Schüler");
         System.out.println("Note 4: " + noteVier + " Schüler");
         System.out.println("Note 5: " + noteFünf + " Schüler");
         System.out.println("Note 6: " + noteSechs + " Schüler");
         
         System.out.println("\nDer Notendurchschnitt beträgt: " + roundDbl + ".");
    
  }
  
  public static void main(String[] args) {
  
         Notenberechnung nb;
         nb = new Notenberechnung();       
         nb.eingabe();
         nb.verarbeitung();
         nb.ausgabe();
  }

  }