import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    double fixum;
    double commissionRate0;
    double commissionRate1;
    double sales = 20000;
    double salesmanCosts;
    double salesRepresentativeCosts;
    String same;
    

    DecimalFormat df1 = new DecimalFormat("#,##0.00 EUR***");
    DecimalFormat df2 = new DecimalFormat("#,##0.00 EUR");

    public void input() {
        
        System.out.println("********************************************************************************************************");
        System.out.println("\tKostenvergleich Handelsvertreter/ Handlungsreisender");
        System.out.println("********************************************************************************************************");

        Scanner scn = new Scanner(System.in);

        System.out.print("\n\nFixum des Reisenden eingeben: ");
        fixum = scn.nextDouble();
        System.out.println("\nProvisionssatz des Handlungsreisenden eingeben: ");
        commissionRate0 = scn.nextDouble();
        System.out.println("\nProvisionssatz des Handelsvertreter eingeben: ");
        commissionRate1 = scn.nextDouble();
        scn.close();

    }

    public void process() {

        commissionRate0 = commissionRate0 / 100;
        
        commissionRate1 = commissionRate1 / 100;

        System.out.println("Umsatz\t\t\tKosten1\t\t\tKosten2");

        while (sales <= 500000) {

            salesmanCosts = fixum + (sales * commissionRate0);
            salesRepresentativeCosts = sales * commissionRate1;

            if (salesmanCosts < salesRepresentativeCosts) {

                System.out.println(df2.format(sales) + "\t\t" + df1.format(salesmanCosts) + "\t" + df2.format(salesRepresentativeCosts));
                
            } else if (salesmanCosts == salesRepresentativeCosts){

                System.out.println(df2.format(sales) + "\t\t" + df1.format(salesmanCosts) + "\t" + df1.format(salesRepresentativeCosts));
                same = df2.format(salesmanCosts);
                
            } else {

                System.out.println(df2.format(sales) + "\t\t" + df2.format(salesmanCosts) + "\t\t" + df1.format(salesRepresentativeCosts));

            }
            
            sales += 40000;

        }
        
    }

    public void output() {
        
        System.out.println("Bei einem Umsatz von " + same + " verdienen beide gleich viel.");
        
        fixum = 0;
        commissionRate0 = 0;
        commissionRate1 = 0;
        sales = 20000;
        salesmanCosts = 0;
        salesRepresentativeCosts = 0;;
        same = "";

    }

    public static void main(String[] args) {

        Main h = new Main();
        char yn;

        do {
            
        h.input();
        h.process();
        h.output();

        System.out.print("Antworte (j/n)");
        Scanner scn = new Scanner(System.in);
        yn = scn.next().charAt(0);
        scn.close();

        } while (yn == 'J' || yn == 'j');
        
        
        
    }
    
}
