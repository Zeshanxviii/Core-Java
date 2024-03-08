import java.util.Scanner;


public class Subject {
    double English;
    double Science;
    double Maths;
    double Comp;
    double Music;
    double totalMarks;
    double persent;
    Subject(){
        System.out.println("Grade Calculator in running -----------------------------X");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter English marks :");
        English = sc.nextInt();
        System.out.print("Enter Science marks :");
        Science = sc.nextInt();
        System.out.print("Enter Mathamatics marks :");
        Maths = sc.nextInt();
        System.out.print("Enter Computer marks :");
        Comp = sc.nextInt();
        System.out.print("Enter Music marks :");
        Music = sc.nextInt();
        sc.close();
        if(English>100||Maths>100||Science>100||Maths>100||Comp>100){
            System.out.println("Invalid input Enter correct marks");
            System.exit(0);
        }
        totalMarks = English+Science+Maths+Comp+Music;
    }

    double persent(){
        return persent=totalMarks/5;
    }
    void totalGrade(){
        if (totalMarks>165) {
            System.out.println("Congratulation Pass !! \nTotal Mark :"+totalMarks +"\nPersentage :"+persent());
        }
        else{
            System.out.println("Congratulation Fail !!! \nTotal Mark :"+totalMarks +"\nPersentage :"+persent());
        }
    }
    void fail(){
        if(English<33||Maths<33||Science<33||Maths<33||Comp<33){
            System.out.println("fail in subject");
            System.exit(0);
        }
    }
}
