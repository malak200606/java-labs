//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
    static void task1(){
        int a=15 , b=4;
        int sum, difference , product , mod ;
        float divide;
        sum=a+b;
        difference=a-b;
        product=a*b;
        mod=a%b;
        divide= (float) a /b;
        boolean isDivisible = ((a % b) == 0);
        if (isDivisible) {
            System.out.println("a is divisible by b");
        } else {
            System.out.println("a is NOT divisible by b");}
            System.out.println("sum = " + sum);
        System.out.println("difference= " + difference);
        System.out.println("product = " + product);
        System.out.println("divide = "+ divide );
        System.out.println("mod = " + mod);
        }
        static void task2(){
        int k=5;
        double m=4.6;
        char s='a';
        boolean meow=true;
        System.out.println(k);
            System.out.println(m);
            System.out.println(s);
            System.out.println(meow);
        final int MAX_SCORE=100;
        //MAX_SCORE=200;//

        }
        static void task3(){
        double price=29.99;
        int cast=(int) price;
        System.out.println(cast);
        System.out.println(price);
        int division=7/2;
        double division2=7/2.0;
        System.out.println(division);
        System.out.println(division2);
        String text = "42";
        int number = Integer.parseInt(text);
        System.out.println(number);

        }
        static void task4(){
        String name="malak mohammad mahmoud";
        System.out.println("length "+name.length());
            System.out.println("lower "+name.toLowerCase());
            System.out.println("upper "+name.toUpperCase());
            System.out.println("first "+name.charAt(0));
            System.out.println("last "+name.charAt(name.length()-1));
            System.out.println("spaces? "+name.contains(" "));

            String reverse= new StringBuilder(name).reverse().toString();
            System.out.println("reversed " +reverse);

        }
        static void task5(){
        boolean isActive=true;
        String accountholder="john";
        long accountnumber=123455666;
        double balance=99999;
        System.out.printf("account holder: %s\n", accountholder);
        System.out.printf("account number: %d\n", accountnumber);
        System.out.printf("balance: %.2f\n", balance);
        System.out.printf("active: %b\n", isActive);

        }
    }
