import java.util.Scanner;

public class KleinsteDreiZahlen {

    int smallest;
    int num1;
    int num2;
    int num3;

    public void input() {

        Scanner scn = new Scanner(System.in);
        
        System.out.print("Zahl 1: ");
        num1 = scn.nextInt();
        System.out.print("\nZahl 2: ");
        num2 = scn.nextInt();
        System.out.print("\nZahl 3: ");
        num3 = scn.nextInt();
        
    }

    public void process() {

        if (num1 < num3) {

            if (num1 < num2) {

                smallest = num1;
                
            }
            
        } else if (num2 < num1) {

            if (num2 < num3) {

                smallest = num2;
                
            }

        } else {

            smallest = num3;

        }
        
    }

    public void output() {

        System.out.println("Die kleinste Zahl ist: " + smallest);
        
    }
    
    public static void main(String[] args) {

        KleinsteDreiZahlen kdz;
        kdz = new KleinsteDreiZahlen();

        kdz.input();
        kdz.process();
        kdz.output();
        
    }
    
}
