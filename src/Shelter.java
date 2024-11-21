import java.util.*;

public class Shelter {
    private static int nextId = 1;
    private int shelterID;
    private String shelterName;
    private HashMap<Integer, Pet> pets = new HashMap<>();
    private ArrayList<adoptionForm> forms = new ArrayList<>();


    public Shelter(String shelterName){
        this.shelterID = nextId++;
        this.shelterName = shelterName;
    }


    public void setShelterName(String name){
        this.shelterName = name;
    }

    public String getShelterName(){
        return shelterName;
    }

    public void addPet(Pet pet) {
        pets.put(pet.getID(), pet);
    }

    public void printAllPets() {
        if (pets.isEmpty()) {
            System.out.println("The shelter has no pets at the moment.");
            return;
        }

        System.out.println("Pets in the shelter:");
        for (Pet pet : pets.values()) {
            System.out.println(pet);  // Calls pet.toString() to print pet details
        }
    }

    // adding adoptionForm instance/object into forms. but since we have a constructor
    // we need to pass those params to then add adoptionForm
    public void submitAdoptionForm(String user, Pet pet){

        if(pets.containsKey(pet.getID())){
            forms.add(new adoptionForm(user, pet));
            System.out.println("Adoption form submitted successfully for: "
                    + pet.getName());
        } else {
            System.out.println("Pet not found in shelter");
        }
    }

    public void reviewForms(){
        for(adoptionForm form : forms){
            if(form.getStatus().equals("Pending")){
                System.out.print(form);
            }
        }
    }

    public void processForm(int formId, boolean approve){
        for(adoptionForm form : forms){
            if(form.getFormId() == formId){
                if(approve){
                    form.approve();
                    pets.remove(form.getPet().getID());
                } else {
                    form.reject();
                }
                return;
            }
        }
        System.out.println("Form not found");
    }
}
