import java.text.DecimalFormat;
import java.util.Scanner;

public class Schwimmbad {

    int day;
    char moreDays;
    boolean followingDays;
    double price;
    double day1 = 4.5;
    double day2 = 6;
    double day3 = 7;
    double dayRemaining = 8;
    static boolean what;
    int rly;

    DecimalFormat df = new DecimalFormat("#,##0.00");

    public void input(){

        Scanner scn = new Scanner(System.in);
        System.out.println("An welchem Tag bist du im Schwimmbad");
        day = scn.nextInt();
        System.out.println("Willst du die darauffolgenden Tage auch da sein? (j/n)");
        moreDays = scn.next().charAt(0);

    }

    public void berechnePreis(){

        if(moreDays == 'j' || moreDays == 'J') {

            followingDays = true;
            rly = 1;

        } else if (moreDays == 'N' || moreDays == 'n') {

            followingDays = false;

            
        }

        switch (day) {
            case 1: 

                price = day1;
                switch (rly) {
                    case 1:
                        
                        price += day2 + day3 + (dayRemaining * 4);
                        break;
                
                    default:
                        break;
                }

            case 2:
                
                price = day2;
                switch (rly) {
                    case 1:
                        
                        price += day3 + (dayRemaining * 4);
                        break;
                
                    default:
                        break;
                }
                break;

            case 3:
                
                price = day3;
                switch (rly) {
                    case 1:
                        
                        price += (dayRemaining * 4);
                        break;
                
                    default:
                        break;
                }
                break;

            case 4:
                
                price = dayRemaining;
                switch (rly) {
                    case 1:
                        
                        price += (dayRemaining * 3);
                        break;
                
                    default:
                        break;
                }
                break;
                
            case 5:
                
                price = dayRemaining;
                switch (rly) {
                    case 1:
                        
                        price += (dayRemaining * 2);
                        break;
                
                    default:
                        break;
                }
                break;

            case 6:
                
                price = dayRemaining;
                switch (rly) {
                    case 1:
                        
                        price += (dayRemaining * 1);
                        break;
                
                    default:
                        break;
                }
                break;
                
            case 7:
                
                price = dayRemaining;
                break;
        
            default:
                what = true;
                break;
        }

        

    }

    public void output() {

        if (what) {

            System.out.println("An den Tagen haben wir geschlossen");
            
        } else {

            System.out.println("Dich kostet es: " + df.format(price) + "Euro");

        }
        
    }

    public static void main(String[] args) {
        
        Schwimmbad s = new Schwimmbad();

        s.input();
        s.berechnePreis();
        s.output();

    }
    
}