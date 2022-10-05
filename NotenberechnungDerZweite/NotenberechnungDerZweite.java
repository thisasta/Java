import java.util.Scanner;

public class NotenberechnungDerZweite{

    double max;
    double avd;
    double per;
    int marks;
    boolean err;
    
    public void input() {

        Scanner scn = new Scanner(System.in);
        System.out.println("maximale Pukteanzahl: ");
        max = scn.nextDouble();
        System.out.println("erreichte Punkteanzahl: ");
        avd = scn.nextDouble();

        scn.close();

    }

    public void process() {

        per = avd / max * 100;

        if(per >= 95) {

            marks = 15;

        } else if(per >= 90 && per < 95) {

            marks = 14;

        } else if(per >= 85 && per < 90) {

            marks = 13;

        } else if(per >= 80 && per < 85) {

            marks = 12;

        } else if(per >= 75 && per < 80) {

            marks = 11;

        } else if(per >= 70 && per < 75) {

            marks = 10;

        } else if(per >= 65 && per < 70) {

            marks = 9;

        } else if(per >= 60 && per < 65) {

            marks = 8;

        } else if(per >= 55 && per < 60) {

            marks = 7;

        } else if(per >= 50 && per < 55) {

            marks = 6;

        } else if(per >= 45 && per < 50) {

            marks = 5;

        } else if(per >= 40 && per < 45) {

            marks = 4;

        } else if(per >= 33 && per < 40) {

            marks = 3;

        } else if(per >= 27 && per < 33) {

            marks = 2;

        } else if(per >= 20 && per < 27) {

            marks = 1;

        } else if(per >= 0 && per < 20) {

            marks = 0;

        } else {

            err = true;

        }

    }

    public void output() {

        if (err) {

            System.out.println("Irgendwas ist falsch gelaufen.");
    
        } else {

            System.out.println("Du hast " + per + "%, dh. " + marks + " Punkte erreicht");

        }
        
    }
    
    public static void main(String[] args) {
        
        NotenberechnungDerZweite nb = new NotenberechnungDerZweite();

        nb.input();
        nb.process();
        nb.output();

    }

}