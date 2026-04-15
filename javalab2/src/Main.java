//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
//click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();

    }

    static void task1() {
        int score = 83;
       //int score =40;
        //int score =73;
        //int score =65;
        //int score =100;
        if (score >= 90) {
            System.out.println("A excellent!!!");
        } else if (score >= 80) {
            System.out.println("B very good :>");
        } else if (score >= 70) {
            System.out.println("C good");
        } else if (score >= 50) {
            System.out.println("D needs improvement");
        } else if (score < 50) {
            System.out.println("F failed...");
        }
    }
        static void task2() {
            //int day=0;
        //int day=1;
            // int day=2;
            //int day=3;
            //int day=4;
            //int day=5;
        int day=6;
            //int day=7;
        switch (day){
            case 1: System.out.println("sunday"); break;
            case 2: System.out.println("mondat"); break;
            case 3: System.out.println("tuesday"); break;
            case 4: System.out.println("wednesday"); break;
            case 5: System.out.println("thursday"); break;
            case 6:
            case 7: System.out.println("weekend");break;
            default:System.out.println("invalid");
        }

    }

     static void task3() {
        int i , j ;
         for (i = 1; i <= 5; i++) {
             for (j = 1; j <= 5; j++) {
                 System.out.printf("%4d", i * j);
             }
             System.out.println();
         }}

     static void task4() {
        int i;
        for(i=1 ;i<=50;i++){
            if(i%3==0){
                System.out.println("fizz");
            }
            else if(i%5==0){
                System.out.println("buzz");
            }
            else if(i%5==0 && i%3==0){
                System.out.println("fizzbuzz");
            }
            else System.out.println(i);
        }

    }

     static void task5() {
        Scanner input=new Scanner(System.in);
        double balance=1000;
        while(true){
            System.out.println("1=check balance");
            System.out.println("2=deposit");
            System.out.println("3=withdraw");
            System.out.println("4=exit");
            int choice=input.nextInt();
            if(choice==1){
                System.out.println("your balance is  "+ balance);
            }
            else if(choice==2){
                System.out.println("enter amount ");
                double deposit=input.nextDouble();
                if(deposit>0){
                    balance+=deposit;
                }
                else System.out.println("invalid");
            } else if(choice==3) {
                System.out.println("enter amount ");
                double withdraw=input.nextDouble();
                if(withdraw>balance || withdraw<0){
                    System.out.println("invalid");
                }
                else balance-=withdraw;
            }
            else if(choice==4) {
                break;
            }
            else System.out.println("invalid");
            }
        }

    }