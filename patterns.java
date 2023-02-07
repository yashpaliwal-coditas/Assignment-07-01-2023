package thirdweek;

public class patterns {
    public void patternone(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        for(char i='F';i>='A';i--){
            for(char j='A';j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for(char i='A';i<='F';i++){
            for(char j='A';j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }
    public void patterntwo(){
        for(int i=5;i>=1;i--){
            for(int j=5;j>i;j--){
                System.out.print("  ");
            }
            for(int k=i*2-1;k>=1;k--){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        for(char i='A';i<='F';i++){
            for(char j='A';j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for(char i='E';i>='A';i--){
            for(char j='A';j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }


    }
    public void patternthree(){
        System.out.println();
        System.out.println();
        for(int i=1;i<=4;i++){
            for(int j=4;j>=i;j--){
                System.out.print("  ");
            }
            for(int k=1;k<=i*2-1;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=5;i>=1;i--){
            for(int j=5;j>i;j--){
                System.out.print("  ");
            }
            for(int k=i*2-1;k>=1;k--){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=1;i<=6;i++){
            char ch='A';
            for(int j=1;j<=i;j++){

                    System.out.print(ch++);

            }
            ch--;
            for(int k=2;k<=i;k++){
                System.out.print(--ch);
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        patterns obj1=new patterns();
        obj1.patternone();
        obj1.patterntwo();
        obj1.patternthree();
        // output:
//*
//* *
//* * *
//* * * *
//* * * * *
//
//        A B C D E F
//        A B C D E
//        A B C D
//        A B C
//        A B
//        A
//        A
//        A B
//        A B C
//        A B C D
//        A B C D E
//        A B C D E F
//
//
//* * * * * * * * *
//  * * * * * * *
//    * * * * *
//      * * *
//        *
//
//        A
//        A B
//        A B C
//        A B C D
//        A B C D E
//        A B C D E F
//        A B C D E
//        A B C D
//        A B C
//        A B
//        A
//
//
//        *
//      * * *
//    * * * * *
//  * * * * * * *
//* * * * * * * * *
//  * * * * * * *
//    * * * * *
//      * * *
//        *
//
//        A
//        ABA
//        ABCBA
//        ABCDCBA
//        ABCDEDCBA
//        ABCDEFEDCBA
//
//        Process finished with exit code 0
    }
}
