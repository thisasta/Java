<<<<<<< HEAD
import java.util.*;
import java.math.*;

public class BodyMassIndex {

    double bmi;
    double height;
    double weight;
    String bmiErgebnis;

    public void input() {

        Scanner sc = new Scanner(System.in);
        System.out.print("\nBitte geben Sie Ihr Gewicht ein: ");
        weight = sc.nextDouble();
        System.out.print("\nBitte geben Sie Ihre Körpergröße ein: ");
        height = sc.nextDouble();

    }

    public void process() {

        bmi = weight / Math.pow(height, 2);

        if (bmi < 19) {

            bmiErgebnis = "Untergewicht";

        } else if (bmi > 25) {

            if (bmi > 30) {

                bmiErgebnis = "starkes Übergewicht";
                
            } else {

                bmiErgebnis = "Übergewicht";

            }

        } else {

            bmiErgebnis = "Normalgewicht";

        }
        
    }

    public void output() {

        System.out.println("\n\nDein BMI beträgt: " + bmi);
        System.out.println("Sie haben " + bmiErgebnis);
        
    }

    public static void main(String[] args) {
        
        BodyMassIndex bmi1;
        bmi1 = new BodyMassIndex();

        bmi1.input();
        bmi1.process();
        bmi1.output();

    }
    
=======
import java.util.*;
import java.math.*;

public class BodyMassIndex {

    double bmi;
    double height;
    double weight;
    String bmiErgebnis;

    public void input() {

        Scanner sc = new Scanner(System.in);
        System.out.print("\nBitte geben Sie Ihr Gewicht ein: ");
        weight = sc.nextDouble();
        System.out.print("\nBitte geben Sie Ihre Körpergröße ein: ");
        height = sc.nextDouble();

    }

    public void process() {

        bmi = weight / Math.pow(height, 2);

        if (bmi < 19) {

            bmiErgebnis = "Untergewicht";

        } else if (bmi > 25) {

            if (bmi > 30) {

                bmiErgebnis = "starkes Übergewicht";
                
            } else {

                bmiErgebnis = "Übergewicht";

            }

        } else {

            bmiErgebnis = "Normalgewicht";

        }
        
    }

    public void output() {

        System.out.println("\n\nDein BMI beträgt: " + bmi);
        System.out.println("Sie haben " + bmiErgebnis);
        
    }

    public static void main(String[] args) {
        
        BodyMassIndex bmi1;
        bmi1 = new BodyMassIndex();

        bmi1.input();
        bmi1.process();
        bmi1.output();

    }
    
>>>>>>> d7d0393e3179c461a9fc074cb97ff38993107e3d
}