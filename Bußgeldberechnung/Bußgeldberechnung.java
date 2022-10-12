import java.util.*;

public class Bußgeldberechnung {

    int where;
    int maxSpeed;
    int userSpeed;

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

}