import java.text.DecimalFormat;
import java.util.*;
import java.io.*;

public class Bußgeldberechnung {

    int where;
    String place;
    int maxSpeed;
    double userSpeed;
    double userSpeedEnd;
    double fine;
    double difference;
    int points;
    int forbidden;

    DecimalFormat dcf = new DecimalFormat("#,##0.00");

    public void input(){

        Scanner scn = new Scanner(System.in);
        System.out.print("Wo haben Sie die Geschwindigkeitsüberschreitung begangen?\n1: innerhalb geschlossener Ortschaften,\n2: ausserhalb geschlossener Ortschaften\nBitte geben Sie die entsprechende Kennziffer ein: ");
        where = scn.nextInt();
        System.out.print("\nWie hoch ist die erlaubte Geschwindigkeit (in km/h): ");
        maxSpeed = scn.nextInt();
        System.out.print("Wie schnell sind Sie gefahren? (in km/h) ");
        userSpeed = scn.nextInt();
        scn.close();
        
    }

    public void progress() {

        if(userSpeed <= 100) {

            userSpeedEnd = userSpeed - 3;

        } else {

            userSpeedEnd = userSpeed - (userSpeed * 0.03);

        }

        difference = userSpeedEnd - maxSpeed;
        
        if (where == 1) {

            place = "innerorts";

            if(difference <= 10) {
    
                fine = 30;
                points = 0;
                forbidden = 0;
    
            } else if(difference > 10 && difference <= 15) {
    
                fine = 50;
                points = 0;
                forbidden = 0;
    
            } else if(difference > 15 && difference <= 20) {
    
                fine = 70;
                points = 1;
                forbidden = 0;
    
            } else if(difference > 20 && difference <= 25) {
    
                fine = 115;
                points = 1;
                forbidden = 0;
    
            } else if(difference > 25 && difference <= 30) {
    
                fine = 180;
                points = 1;
                forbidden = 0;
    
            } else if(difference > 30 && difference <= 40) {
    
                fine = 260;
                points = 2;
                forbidden = 1;
    
            } else if(difference > 40 && difference <= 50) {
    
                fine = 400;
                points = 2;
                forbidden = 1;
    
            } else if(difference > 50 && difference <= 60) {
    
                fine = 600;
                points = 2;
                forbidden = 2;
    
            } else if(difference > 60 && difference <= 70) {
    
                fine = 700;
                points = 2;
                forbidden = 3;
    
            } else if(difference > 70) {
    
                fine = 800;
                points = 2;
                forbidden = 3;
    
            }
            
        } else {

            place = "außerorts";

            if(difference <= 10) {
    
                fine = 20;
                points = 0;
                forbidden = 0;
    
            } else if(difference > 10 && difference <= 15) {
    
                fine = 40;
                points = 0;
                forbidden = 0;
    
            } else if(difference > 15 && difference <= 20) {
    
                fine = 60;
                points = 0;
                forbidden = 0;
    
            } else if(difference > 20 && difference <= 25) {
    
                fine = 100;
                points = 1;
                forbidden = 0;
    
            } else if(difference > 25 && difference <= 30) {
    
                fine = 150;
                points = 1;
                forbidden = 0;
    
            } else if(difference > 30 && difference <= 40) {
    
                fine = 200;
                points = 2;
                forbidden = 1;
    
            } else if(difference > 40 && difference <= 50) {
    
                fine = 320;
                points = 2;
                forbidden = 1;
    
            } else if(difference > 50 && difference <= 60) {
    
                fine = 480;
                points = 2;
                forbidden = 1;
    
            } else if(difference > 60 && difference <= 70) {
    
                fine = 600;
                points = 2;
                forbidden = 2;
    
            } else if(difference > 70) {
    
                fine = 700;
                points = 2;
                forbidden = 3;
    
            }

        }

    }

    public void output(){

        System.out.println("Du musst " + fine + "Euro bezahlen, darfst " + forbidden + " Monate nicht fahren und du bekommst " + points + " Strafpunkte.");
    }

    public static void main(String[] args) {
        
        Bußgeldberechnung bg = new Bußgeldberechnung();
        bg.input();
        bg.progress();
        bg.output();

    }

}