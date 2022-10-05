import java.util.*;
import java.text.*;

public class Schaltjahr {

    int year;
    String result;

    public void input() {

        Scanner scn = new Scanner(System.in);
        System.out.print("Welches Jahr? ");
        year = scn.nextInt();
        
    }

    public void process() {

        if (year % 4 == 0 && year % 100 != 0){

            result = "ein Schaltjahr";

        } else if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {

            result = "Schaltjahr";

        } else {

            result = "kein Schaltjahr";

        }
        
    }

    public void output() {

        System.out.println(result);
        
    }

    public static void main(String[] args) {
        
        Schaltjahr j;
        j = new Schaltjahr();

        j.input();;
        j.process();
        j.output();

    }

}