import java.util.HashMap;


public class DataBase extends MainData{

    HashMap<String, Integer> nameAgeBase = new HashMap<>();
    HashMap<String, String> loginPasswordBase = new HashMap<>();


    private static DataBase dataBase;

    private DataBase(String name, int age, String login, int password) {

        super(name, age, login, password);

    }
    public static DataBase getDataBase() {
        if(dataBase == null){
            dataBase = new DataBase("", 0, "", 0);
        }
        return dataBase;
    }

}
