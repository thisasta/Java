import java.util.Scanner;

public class zinsberechnung {

    double interest;
    double capital;
    double time;
    double realInterest;

    double interestResult;
    double result;

    double roundDbl;

    public void input() {

        Scanner scn = new Scanner(System.in);
        
        System.out.println("Eingabe: ");
        System.out.print("\nKapital: ");
        capital = scn.nextDouble();
        System.out.print("\nZinssatz: ");
        interest = scn.nextDouble();
        System.out.print("\nZeit (In Jahre): ");
        time = scn.nextDouble();
        
    }

    public void process() {

        realInterest = 1 + (interest / 100);
        double interestResult = Math.pow(realInterest, time);
        result = capital * interestResult;
        roundDbl = Math.round(result*100.0)/100.0;
        
    }

    public void output() {

        System.out.println("Resultat: " + roundDbl + " Euro");
        
    }

    public static void main(String[] args) {
        
        zinsberechnung zn;
        zn = new zinsberechnung();

        zn.input();
        zn.process();
        zn.output();

    }
}