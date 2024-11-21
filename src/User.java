import java.util.HashMap;

public class User {
    private static User instance; // singleton pattern to prevent multiple instances
    private HashMap<String, String> users;

    private User(){
        users  = new HashMap<>();
    }

    public static User getInstance(){
        if(instance == null){
            instance = new User();
        }
        return instance;
    }


    public void createUser(String username, String password){
        try{

            if(username == null || username.trim().isEmpty()){
                throw new IllegalArgumentException("Username cannot be null"
                        + " or empty.");
            }

            if(password == null || password.trim().isEmpty()){
                throw new IllegalArgumentException("Password cannot be null"
                        + " or empty.");
            }

            if(users.containsKey(username)){
                throw new IllegalArgumentException("Username already exists!");
            }

            users.put(username, password);

        } catch(IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        } catch(Exception e){
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }

    public boolean authenticate(String username, String password){
        if(users.containsKey(username) && users.get(username).equals(password)){
            return true;
        }
        return false;
    }

    public void listUsers(){
        System.out.println("Registered Users: ");

        for(String username : users.keySet()){
            System.out.println(username);
        }
    }
}
