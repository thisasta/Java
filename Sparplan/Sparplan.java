import java.util.*;

//Funktioniert nicht

public class Sparplan {

    double capital;
    double interestRate;
    double investmentDuration;
    double interest;
    double finalCapital;
    
    public void input() {

        Scanner scn = new Scanner(System.in);

        System.out.print("Bitte geben Sie Ihr Kapital ein: ");
        capital = scn.nextDouble();
        System.out.print("\nBitte geben Sie den Zinssatz ein: ");
        interestRate = scn.nextDouble(); 
        System.out.println("\nBitte geben Sie die Anlagedauer (in Jahren) ein: ");
        investmentDuration = scn.nextDouble();

        scn.close();

    }

    public void process(){

        interestRate = 1 + interestRate / 100;
        finalCapital = capital + capital * Math.pow(interestRate, investmentDuration);


    }

    public void output() {

        System.out.println("Endkapital: " + finalCapital);
        System.out.println("Zinsen: " + (finalCapital - capital));
        
        
    }

    public static void main(String[] args) {

        char i = 'j';

        Sparplan sp = new Sparplan(); 

     while (i == 'j'){
    
    sp.input();
    sp.process();
    sp.output();

    Scanner sc = new Scanner(System.in);

    System.out.println("Willst du nochmal? (j/n)");
    
    i = sc.next().charAt(0);

        }
    }
}