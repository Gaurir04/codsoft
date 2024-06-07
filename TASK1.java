//student grade project for codsoft

import java.util.*;

public class student_grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter student name:");
        String name = sc.next();

        System.out.println("enter how many subject you have:");
        float no_sub = sc.nextInt();

        int marks = 0, sum = 0;
        String grade;
        for (int i = 1; i <= no_sub; i++) {
            System.out.println("enter the subject marks out of 100:");
            marks = sc.nextInt();
            sum += marks;
            System.out.println("total marks:" + sum);

        }

         double avg= (sum/no_sub);
        System.out.println("the average percentage is:"+avg);

        if(avg<=100 && avg >=75){
            grade = "A";
            System.out.println("your grade is:"+grade);
        }
        else if(avg <=74 && avg >=65){
            grade = "B";
            System.out.println("your grade is:"+grade);
        }
        else if(avg <=64 && avg >=45){
            grade = "C";
            System.out.println("your grade is:"+grade);
        }
        else if(avg <=44){
            grade = "D";
            System.out.println("your grade is:"+grade);
        }
        else{
            System.out.println("you are failed!!!");
        }


    }
}
