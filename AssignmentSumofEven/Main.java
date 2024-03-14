package AssignmentSumofEven;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

    int sum=0;
    ArrayList<Integer> nums = new ArrayList<>();
    nums.add(2);
    nums.add(5);
    nums.add(8);
    nums.add(10);
    nums.add(15);

    for(Integer n : nums ){
        if(n%2==0){
            System.out.println(n);
            sum=sum+n;
        }
    }
        System.out.println("Sum of all even integer are "+ sum);


    }
}
