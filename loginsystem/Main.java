public class Main {

    public static void main(String[] args) {

        IDandPasswords idAndPasswords = new IDandPasswords();



        LoginPage logInPage = new LoginPage(idAndPasswords.getLoginInfo());

    }

}
