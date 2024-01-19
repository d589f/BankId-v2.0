public class Admin{

    public void checkUsers(){
        DataBase dataBase = DataBase.getDataBase();
        System.out.println(dataBase.nameAgeBase);
        System.out.println(dataBase.loginPasswordBase);
    }

}
