import java.util.*;
import java.text.*;
import java.io.*;

public class Benzinverbrauch {
  
  double oldKilometerstand;
  double newKilometerstand;
  double gefahreneKilometer;
  double liter;
  double durchschnitt;
  double durchschnittRound;
  
  public void eingabe() {
         
    System.out.println("Eingabe: ");
    Scanner scn = new Scanner(System.in);
    System.out.print("\nBitte geben Sie den Kilometerstand beim letzten Tanken ein: ");
    oldKilometerstand = scn.nextDouble();   
    System.out.print("\nBitte geben Sie den aktuellen Kilometerstand ein:  ");
    newKilometerstand = scn.nextDouble();
    System.out.print("\nBitte geben Sie die Menge der getankten Liter Benzin ein: ");
    liter = scn.nextDouble();
    
  }
  
  public void verarbeitung() {
         
    gefahreneKilometer = newKilometerstand - oldKilometerstand;
    durchschnitt = 100 * liter / gefahreneKilometer;
    durchschnittRound = Math.round(durchschnitt * 100.0) / 100.0;
    
  }
  
  public void ausgabe() {
         
    System.out.println("\nAuswertung: ");
    System.out.println("Der durchschnittliche Benzinverbrauch beträgt " + durchschnittRound + " Liter pro gefahrene 100 Kilometer, wenn Sie " + gefahreneKilometer + " Kilometer gefahren sind und " + liter + " Liter getankt haben.");
    
  }
  
  public static void main(String[] args) {
         
    Benzinverbrauch bv;
    bv = new Benzinverbrauch();
    bv.eingabe();
    bv.verarbeitung();
    bv.ausgabe();
    
  }

  }

  /*
  Decimalformat formater = new Decimalformat("#.##");
  formatter.format(durchschnitt)
  */