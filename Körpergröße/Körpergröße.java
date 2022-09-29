import java.util.Scanner;

public class Körpergröße {

    double Oberschenkel;
    int Alter;
    boolean männlich = false;
    boolean weiblich = false;
    int geschlecht;

    double length;
    double overAge;

    public void input() {

        Scanner scn = new Scanner(System.in);

        System.out.println("Eingabe: ");
        System.out.print("Länge der Oberschenkel: ");
        Oberschenkel = scn.nextDouble();
        System.out.print("\nIhr Alter: ");
        Alter = scn.nextInt();

        System.out.print("\nmännlich(0) oder weiblich(1)");
        geschlecht = scn.nextInt();

    }

    public void process() {

        if (geschlecht == 0) {

            männlich = true;

        } else if(geschlecht == 1) {

            weiblich = true;

        } else {

            System.out.println("Bitte nur die 0 oder 1 tippen! (Bitte das Programm neustarten)");

        }

        if (männlich == true) {

            length = Oberschenkel * 2.238 + 0.69089;

            if (Alter >= 31){
                length = length - 0.06 * (Alter - 30);
            }

        } else if (weiblich == true) {

            length = Oberschenkel * 2 + 0.61417;

            if (Alter >= 31){
                length = length - 0.06 * (Alter - 30);
            }

        }

    }

    public void output() {

        System.out.println("\nDu bist wahrscheinlich " + length + "m groß");

    }

    public static void main(String[] args) {
        
        Körpergröße kg;
        kg = new Körpergröße();

        kg.input();
        kg.process();
        kg.output();

    }

}