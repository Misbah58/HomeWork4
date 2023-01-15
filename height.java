package Homework4;

import java.util.Scanner;
/*Prompt the user to enter person heights in inches. Person should be classified as one of the following:
• short (under 60 inch)
• medium(between 60 -72 inch)
• tall (over 72 inch)*/

public class height {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("please enter your height");
        int height=scanner.nextInt();
        if(height<60){
            System.out.println("short");
        }else if(height>60&&height<=72){
            System.out.println("medium");
        }else{
            System.out.println("tall");
        }


    }

    public static class Task2 {
        public static void main(String[] args) {
            int day=8;
            switch (day){

                case 1:
                    System.out.println("it's a weekday");
                    break;
                case 2:
                    System.out.println("it's a weekday");
                    break;
                case 3:
                    System.out.println("it's a weekday");
                    break;
                case 4:
                    System.out.println("it's a weekday");
                    break;
                case 5:
                    System.out.println("it's a weekday");
                    break;
                case 6:
                    System.out.println("it's a weekend");
                    break;
                case 7:
                    System.out.println("it's a weekend");
                    break;
                default:
                    System.out.println("invalid day");







            }
        }

        public static class Task3 {
            public static void main(String[] args) {
                Scanner scan= new Scanner(System.in);
                System.out.println("Enter your grades for quiz");
                int Quiz= scan.nextInt();
                System.out.println("Please enter your grades for midterm");
                int Midterm=scan.nextInt();
                System.out.println("enter grades for final scores");
                  int Final=scan.nextInt();
                  double average= (Quiz+Midterm +Final)/3;
                  if (average>90){
                      System.out.println("A");

                  }else if(average>=70&&average<90){
                      System.out.println("B");

                  }else if(average<=50&&average<70){
                      System.out.println("C");

                  }else if(average<50){
                      System.out.println("F");
                  }



            }
        }

        public static class Task4 {
            public static void main(String[] args) {
                Scanner scan= new Scanner(System.in);
                System.out.println("Your Birth month");
                String birthMonth= scan.next();

                if(birthMonth.equals("December")||birthMonth.equals("January")||birthMonth.equals("February")){
                    System.out.println(" You were born in Winter");

                }else if(birthMonth.equals("March")||birthMonth.equals("April")||birthMonth.equals("May"))
                {
                    System.out.println(" You were born in Spring");

                }else if(birthMonth.equals("June")||birthMonth.equals("July")||birthMonth.equals("August"))
                {
                    System.out.println("You were born in Summer");

                }else{
                    System.out.println("Invalid ");
                }


            }
        }
    }
}
