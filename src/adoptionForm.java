public class adoptionForm {
    private static int nextId = 1;
    private int formId;
    private String user;
    private Pet pet;
    private String status;

    public adoptionForm(String user, Pet pet){
        this.formId = nextId++;
        this.user = user;
        this.pet = pet;
        this.status = "Pending";
    }

    public int getFormId(){
        return formId;
    }

    public String getUser(){
        return user;
    }

    public Pet getPet(){
        return pet;
    }

    public String getStatus(){
        return status;
    }

    public void approve(){
        this.status = "Approved";
    }

    public void reject(){
        this.status = "Rejected";
    }

    @Override
    public String toString(){
        return "AdoptionForm{" +
                "Form ID=" + formId +
                ", User=" + user +
                ", Pet=" + pet.getName() +
                ", Status='" + status + '\'' +
                '}';
    }
}
