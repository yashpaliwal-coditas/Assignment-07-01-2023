package thirdweek;

import java.util.*;
public class Questionseven {
    public void weekday(){
        String week[]={"Monday","Tuesday","Wednessday","Friday","Saturday","Sunday"};
        for(int i=0;i<week.length;i++){
            System.out.print(week[i] +" ");
        }
        System.out.println();

    }

    public void skipweekday(){
        String week[]={"Monday","Tuesday","Wednessday","Thursday","Friday","Saturday","Sunday"};
        Date d=new Date();
        int todayweek= d.getDay();
        for(int i=0;i<week.length;i++){
            if(todayweek-1!=i)
                System.out.print(week[i] +" ");
        }
        System.out.println();

    }
    public void skipday(){

        Date d=new Date();
        int todaydate= d.getDate();
        for(int i=1;i<=30;i++){
            if(todaydate+1==i)
                break;
            System.out.print(i+" ");
        }
        System.out.println();

    }
    public static void main(String arrgs[]){
        Questionseven obj=new Questionseven();
        obj.weekday();
        obj.skipweekday();
        obj.skipday();
        // output
//        Monday Tuesday Wednessday Friday Saturday Sunday
//        Monday Wednessday Thursday Friday Saturday Sunday
//        1 2 3 4 5 6 7
    }
}
