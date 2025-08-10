import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        UserRepository servis = new UserRepository();
        servis.addUser(list);
        servis.addUser(list);
        servis.addUser(list);
        servis.removeUserById(list);
        servis.findUserById(list);
        servis.getAllUsers(list);
    }
}
