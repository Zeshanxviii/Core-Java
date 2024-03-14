package AssignmentVaccine;

import java.util.Objects;

public class User extends Vaccine {
    User(int age, String nationality) {
        super(age, nationality);
    }

    @Override
    public void firstDose() {
        if((age >= 18) && (Objects.equals(nationality, "indian"))){
            System.out.println("Congratulation you are eligible for First Dose of Vaccine ");
            System.out.println("Kindly pay 250 ruppee");
            secondDose();
        }
        else{
            System.out.println("Oops !! Not eligible ");
        }
    }

    @Override
    public void secondDose() {
        System.out.println("Congratulation you are eligible of second dose");
    }
}
