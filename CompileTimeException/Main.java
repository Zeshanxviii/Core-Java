package CompileTimeException;

public class Main {
    public static void main(String[] args) {
        int age=17;
        try {
            if (age<18){
               throw  new CompileTimeException("You are underAge");
            }
            else{
                System.out.println("You are eligible");
            }
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}
