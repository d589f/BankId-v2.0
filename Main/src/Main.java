import java.util.Scanner;

public class Main extends MainData{

    public Main(String name, int age, String login, int password) {
        super(name, age, login, password);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Do you have an account? (yes/no): ");
        String answer = scanner.nextLine();
        
        if(answer.equalsIgnoreCase("yes")){
            LoginIn loginIn = new LoginIn("", 0, "", 0);
            loginIn.loginIn(null, 0);
        }else if (answer.equalsIgnoreCase("no")) {
            Unregistered unregistered = new Unregistered("", 0, "", 0);
            unregistered.startReg("", 0, "", 0);
        }else{
            System.out.println("Invalid answer!");
        }
    }
}
