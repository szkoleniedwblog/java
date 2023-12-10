public class ReadOnly {

    private String name = "Darek";

    public String getName() {
       return name;
    }

    public void setName(String name) {
        // możemy tu zrobić szereg walidacji, które pilnują poprawności
        this.name = name;
    }

}
