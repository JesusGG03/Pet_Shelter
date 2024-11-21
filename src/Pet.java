import java.util.ArrayList;

public class Pet {
    private static int nextId = 1;
    private int id;
    private String name;
    private int age;
    private String species;
    private String breed;
    private ArrayList<String>health = new ArrayList();
    private String adoptStatus;


    public Pet(String name, int age, String species, String breed) {
        this.id = nextId++;  // Assign current ID and increment for the next pet
        this.name = name;
        this.age = age;
        this.species = species;
        this.breed = breed;
        this.adoptStatus = "Available";  // Default status
    }

    public int getID(){
        return id;
    }



    public void setName(String newName){
        this.name = newName;
    }

    public String getName(){
        return name;
    }



    public void setAge(int newAge){
        this.age = newAge;
    }

    public int getAge(){
        return age;
    }



    public void setSpecies(String newSpecies){
        this.species = newSpecies;
    }

    public String getSpecies(){
        return species;
    }



    public void setBreed(String newBreed){
        this.breed = newBreed;
    }

    public String getBreed(){
        return breed;
    }



    public void setAdoptStat(String newAdoptStat){
        this.adoptStatus = newAdoptStat;
    }



    public String getAdoptStat(){
        return adoptStatus;
    }


    public void setHealth(String condition){
        health.add(condition);
    }




    public String getHealth(){

        return health.isEmpty() ? "No health conditions." : String.join(", ", health);
    }

    public void printHealth(){
        for(int i = 0; i < health.size(); i++){
            System.out.println(i + ". " + health.get(i));
        }
    }


    public String updateHealth(){



        return health.isEmpty() ? "No health conditions." : String.join(", ", health);
    }



    public String toString(){
        return "ID: "+ getID() + ", Name: " + getName() + ", Species: "+ getSpecies() +
                ", Breed: " + getBreed() + ", Health Conditions: "+ getHealth() + ", Status: " + getAdoptStat();
    }

}
