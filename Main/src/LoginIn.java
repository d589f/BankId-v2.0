import java.util.Scanner;

public class LoginIn extends MainData{

    public LoginIn(String name, int age, String login, int password) {
        super(name, age, login, password);
    }

    DataBase dataBase = DataBase.getDataBase();



    public void loginIn(String login, int password){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your login: ");
        String login1 = scanner.nextLine();

        System.out.println("Enter your password: ");
        int password1 = scanner.nextInt();
        String password2 = Integer.toString(password1);

        if (login1.equals(admin) && password1 == 1556){
            Admin admin = new Admin();
            System.out.println("Welcome, administrator!");
            admin.checkUsers();
        }else if (dataBase.loginPasswordBase.containsKey(login1) && dataBase.loginPasswordBase.get(login1).equals(password2)){
            System.out.println("Welcome!");
        }else {
            System.out.println("Invalid login or password!");
        }
    }
}
