import java.util.HashMap;

public class ShelterSystem {
    private HashMap<String, Admin> admins = new HashMap<>();

    public void registerAdmin(String username, String password, Shelter shelter){
        Admin admin = new Admin(username, password, shelter);
        admins.put(username, admin);
    }

    public Shelter login(String username, String password){
        Admin admin = admins.get(username);

        if(admin != null && admin.checkPassword(password)){
            System.out.println("Login successful!");
            return admin.getShelter();
        } else {
            System.out.println("Login Failed. Please try again.");
            return null;
        }
    }

}
