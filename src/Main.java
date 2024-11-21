public class Main {
    public static void main(String[] args) {
        Shelter shelter = new Shelter("Statesville Shelter");
        User user = User.getInstance();

        // Create some pet objects and add them to the shelter
        Pet pet1 = new Pet("Buddy", 3, "Dog", "Labrador");
        Pet pet2 = new Pet("Whiskers", 2, "Cat", "Persian");

        shelter.addPet(pet1);
        shelter.addPet(pet2);

        // Print all pets in the shelter
        shelter.printAllPets();


        String username = "Username";
        String password = "Password";


        user.createUser(username, password);


        user.listUsers();

        if(user.authenticate(username, password)){
            System.out.println("Login Successfule");
        } else {
            System.out.println("Login Failed");
        }

        adoptionForm adoptform = new adoptionForm(username, pet1);

        System.out.println(adoptform.toString());
    }
}