import java.util.Scanner;

public class Grundrechenarten {

    double num1;
    double num2;
    int type;
    double numSolution;
    String solution;

    public void input() {

        System.out.println("******************************************");
        System.out.println("\tGrundrechenarten");
        System.out.println("******************************************");
        System.out.println("\nZahleneingabe:");
        System.out.println("------------------------------------------");

        Scanner scn = new Scanner(System.in);

        System.out.print("Bitte geben Sie die 1. Zahl ein: ");
        num1 = scn.nextDouble();
        System.out.print("\nBitte geben Sie die 2. Zahl ein: ");
        num2 = scn.nextDouble();
        System.out.println("\nAuswahl:");
        System.out.println("------------------------------------------");
        System.out.print("Welche Grundrechenart möchten Sie auswählen:");
        System.out.println("\n1. Addition\n2. Subtraktion\n3. Multiplikation\n4. Division");
        System.out.print("Eingabe Auswahl: ");
        type = scn.nextInt();

        scn.close();

    }

    public void process() {

        switch (type) {
            case 1:
                
                numSolution = num1 + num2;
                solution = num1 + " + " + num2 + " = " + numSolution;
                break;

            case 2:
                
                numSolution = num1 - num2;
                solution = num1 + " - " + num2 + " = " + numSolution;
                break;
            
            case 3:
                
                numSolution = num1 * num2;
                solution = num1 + " x " + num2 + " = " + numSolution;
                break;

            case 4:
                
                numSolution = num1 / num2;
                solution = num1 + " / " + num2 + " = " + numSolution;
                break;

            default:

                solution = "Irgendwas lief schief.";
                break;
        }

    }

    public void output(){

        System.out.println("\nAusgabe Ergebnis:");
        System.out.println("------------------------------------------");
        System.out.println(solution);

            
    }

    public static void main(String[] args) {
        
        Grundrechenarten g = new Grundrechenarten();
        g.input();
        g.process();
        g.output();

    }

}