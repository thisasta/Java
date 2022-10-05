import java.util.Scanner;

public class NotenberechnungDerZweite{

    int max;
    int avd;
    int per;
    int marks;
    
    public void input() {

        Scanner scn = new Scanner(System.in);
        System.out.println("maximale Pukteanzahl: ");
        max = scn.nextInt();
        System.out.println("erreichte Punkteanzahl: ");
        avd = scn.nextInt();

    }

    public void process() {

        per = avd / max * 100;

        if(per > 95) {

            marks = 15;

        }

    }

}