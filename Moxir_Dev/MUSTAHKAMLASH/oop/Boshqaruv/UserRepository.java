import java.util.ArrayList;
import java.util.Scanner;

public class UserRepository {
    public UserRepository() {
    }
    Scanner scanner = new Scanner(System.in);
    public void addUser(ArrayList<User> users){
        System.out.print("User Ismi -> ");
        String ism = scanner.next();
        System.out.print(ism+"-Idisi -> ");
        int id = scanner.nextInt();
        System.out.print("emailni Kiriting -> ");
        String mail = scanner.next();
        User user = new User(id,ism,mail);
        users.add(user);
    }
    public void removeUserById(ArrayList<User> users){
        System.out.print("O'chirmoqchi bolgan User Idisi -> ");
        int id = scanner.nextInt();
        boolean top = true;
        for(User u:users){
            if(u.getId()==id){
                System.out.println("Topildi!");
                users.remove(u.getId());
                top = false;
                break;
            }
        }
        if(top){
            System.out.println("Bunday Id Egasi Mavju emas!");
        }
    }
    public void findUserById(ArrayList<User> users){
        System.out.print("Qidirmoqchi Bo'lgan User Idisi -> ");
        int id = scanner.nextInt();
        boolean top = true;
        for(User u:users){
            if(u.getId()==id){
                System.out.println("Topildi!");
                System.out.println("Id: "+u.getId()+"-Ism: "+u.getName()+"-"+"Email: "+u.getEmail());
                top = false;
                break;
            }
        }
        if(top){
            System.out.println("Bunday Id Egasi Mavju emas!");
        }
    }
    public void getAllUsers(ArrayList<User> users){
        for(User u:users){
            System.out.println("Id: "+u.getId()+"-Ism: "+u.getName()+"-"+"Email: "+u.getEmail());
        }
    }

}
