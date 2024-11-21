public class Admin {
    private String username;
    private String password;
    private Shelter shelter;

    public Admin(String username, String password, Shelter shelter){
        this.username = username;
        this.password = password;
        this.shelter = shelter;
    }

    public String getUsername(){
        return username;
    }

    public boolean checkPassword(String userInputPassword){
        return password.equals(userInputPassword);
    }

    public Shelter getShelter(){
        return shelter;
    }
}
