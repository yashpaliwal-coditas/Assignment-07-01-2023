package thirdweek;

import java.util.Scanner;

public class Questionsix {
    public static void main(String args[]) {
        int age1, age2,age3,young,old;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ages 3 persons");
        age1 = sc.nextInt();
        age2 = sc.nextInt();
        age3 = sc.nextInt();
        if(age1>age2 && age1>age3){
            old=age1;
            if(age2>age3)
                young=age3;
            else
                young=age2;
        }
        else if(age2>age1 && age2>age3){
            old=age2;
            if(age1>age3)
                young=age3;
            else
                young=age1;
        }
        else {
            old=age1;
            if(age2>age1)
                young=age1;
            else
                young=age2;
        }
        System.out.println("Oldest is "+old+" youngest is "+young);


        //OUTPUT:
//        Enter ages 3 persons
//        43
//        65
//        22
//        Oldest is 65 youngest is 22
    }
}
