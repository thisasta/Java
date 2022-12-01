
public class Main {

    String a = "Methoden sind cool.";
    boolean startsWithM;

    public void startsWith() {
        
        startsWithM = a.startsWith("C");
        System.out.println(startsWithM);

    }

    public static void main(String[] args) {
        
        Main main = new Main();
        main.startsWith();
        
    }

}