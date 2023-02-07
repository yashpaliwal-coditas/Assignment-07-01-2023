package thirdweek;
import java.util.*;
public class Questionfive {
    public static void main(String args[]){
        int number1,number2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 integer values");
        number1=sc.nextInt();
        number2=sc.nextInt();
        if(number1>number2)
            System.out.println("number 1 is greater than number 2 with the value "+number1);
        else
            System.out.println("number 2 is greater than number 1 with the value "+number2);

//output:
//Enter 2 integer values
//        76
//        45
//        number 1 is greater than number 2 with the value 76

    }
}
