import java.util.Scanner;
import java.util.HashMap;

public class Unregistered extends MainData {
    public Unregistered(String name, int age, String login, int password) {
        super(name, age, login, password);
    }

    public void startReg(String name, int age, String login, int password) {

        DataBase dataBase = DataBase.getDataBase();
        MainData mainData = new MainData("", 0, "", 0);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        dataBase.name = scanner.nextLine();

        System.out.println("Enter your age: ");
        dataBase.age = scanner.nextInt();
        scanner.nextLine();

        dataBase.nameAgeBase.put(dataBase.name, dataBase.age);

        System.out.println("Enter your login: ");
        dataBase.login = scanner.nextLine();

        System.out.println("Enter your password: ");
        dataBase.password = scanner.nextInt();
//        scanner.nextLine();
        String parsePassword = Integer.toString(dataBase.password);

        dataBase.loginPasswordBase.put(dataBase.login, parsePassword);

        Main.main(null);
    }
}