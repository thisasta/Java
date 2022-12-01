import java.util.Scanner;

public class Mittelwertberechnung{

    int i = 1;
    String jn = "j";
    int num;

    public void input(){
        System.out.println("*****************************************************");
        System.out.println("\tMittelwertberechnung");
        System.out.println("*****************************************************");

        while (jn.equals("j")) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Bitte geben Sie die Zahl ein: ");
        num = scn.nextInt();
        System.out.print("Wollen Sie eine weitere Zahl eingeben? (J/N)");
        jn = scn.next();
        System.out.println(jn);
        i++;
        }
        
        
    }

    public static void main(String[] Args){

        Mittelwertberechnung mt = new Mittelwertberechnung();
        mt.input();

    }

}