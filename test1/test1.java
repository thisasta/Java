import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class test1 {

    int n;
    int no;
    int score = 0;
    int i = 0;

    public void input(){

        do {

            Scanner scn = new Scanner(System.in);
            System.out.println("Welche Zahl? (unter 5)");
            Random rnd = new Random();
            n = scn.nextInt();
            no = rnd.nextInt(5);

            System.out.println("Deine Zahl lautet: " + n);
            System.out.println("Die Gegenzahl wird ausgelost...");

            if(n == no) {

                System.out.println("Du hast gewonnen! Deine Zahl: " + n + "\t CPU Zahl: " + no);
                score += 1;
                System.out.println("Deine Punktezahl: " + score);
                System.out.println("Willst du weiter machen? Ja = 1, Nein = 2");
                i = scn.nextInt();

            } else {

                System.out.println("Du hast verloren! Deine Zahl: " + n + "\t CPU Zahl: " + no);
                score -= 1;
                if (score < 0) {

                    score = 0;

                }
                System.out.println("Deine Punktezahl: " + score);
                System.out.println("Willst du weiter machen? Ja = 1, Nein = 2");
                i = scn.nextInt();

            }

        }while (i == 1);

    }

    public static void main(String[] args) {

        test1 test = new test1();
        test.input();

    }

}
