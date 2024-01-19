import lombok.Data;
@Data
public class MainData {

        public String admin = "admin";
        public String name;
        public int age;
        public String login;
        public int password;


    public MainData(String name, int age, String login, int password) {
        this.name = name;
        this.age = age;
        this.login = login;
        this.password = password;
    }
}
