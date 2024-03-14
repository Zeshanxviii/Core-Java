package AssignmentVaccine;

public abstract class Vaccine {
    int age;
    String nationality;

    public Vaccine(int age, String nationality) {
        this.nationality=nationality;
        this.age=age;
    }


    public abstract void firstDose();
    public abstract void secondDose();


}
