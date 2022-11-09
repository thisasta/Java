import java.util.HashMap;

public class IDandPasswords {

    HashMap<String,String> logininfo = new HashMap<String, String>();

    IDandPasswords() {

        logininfo.put("Joe", "Mama");
        logininfo.put("Candice", "nuts");
        logininfo.put("Mama", "mia");

    }

    protected HashMap getLoginInfo(){

        return logininfo;

    }

}
