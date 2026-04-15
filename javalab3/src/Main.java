public class Main {
    static class MathUtils {
        static int max(int a, int b) {
            if (a > b) return a;
            else return b;
        }
        static boolean isEven(int n) {
            return n%2== 0;
        }
        static int absolute(int n) {
            if (n<0) return -n;
            else return n;
        }

        static double power(double base, int exp) {
            double result=1;
            for (int i=0;i<exp; i++) {
                result=result*base;
            }
            return result;
        }
    }
    static class StringUtils{
        static boolean isEmpty(String s) {
            return s.length()==0;
        }

        static String capitalise(String s) {
            return s.charAt(0)+s.substring(1);
        }
        static String repeat(String s, int times) {
            String result="";
            for (int i=0; i<times;i++) {
                result+=s;
            }
            return result;
        }

        static int countChar(String s, char c) {
            int count=0;
            for (int i=0;i<s.length();i++) {
                if (s.charAt(i)==c)count++;
            }
            return count;
        }
    }
    static class Calculator {
        static int add(int a,int b) {
            return a+b;
        }
        static double add(double a, double b) {
            return a+b;
        }

        static int add(int a, int b, int c) {
            return a+b+c;
        }
        static String add(String a, String b) {
            return a+b;
        }
    }
    static class BankUtils {
        static double simpleInterest(double p, double r, int t){
            return (p*r*t)/100;
        }
        static double compoundInterest(double p, double r, int t) {
            double result=p;
            for (int i=0; i<t;i++) {
                result=result*(1+r/100);
            }
            return result-p;
        }
        static String formatAmount(double amount, String currency) {
            return currency+" "+amount;}
    }
    static class NumberUtils {
        static boolean isPrime(int n){
            if (n<=1) return false;
            for (int i=2;i<n; i++){
                if (n%i==0)return false;
            }
            return true;
        }
        static boolean isPalindrome(int n) {
            int original=n;
            int reversed=0;
            while (n>0){
                reversed=reversed*10+(n%10);
                n=n/10;
            }
            return original==reversed;
        }

        static int reverseNumber(int n){
            int reversed=0;
            while (n>0){
                reversed=reversed*10+(n%10);
                n=n/10;
            }
            return reversed;
        }
        static int sumDigits(int n){
            if (n==0) return 0;
            return (n%10)+sumDigits(n/10);
        }
    }
    public static void main(String[] args) {

        System.out.println(MathUtils.max(5, 8));
        System.out.println(MathUtils.isEven(4));
        System.out.println(MathUtils.absolute(-7));
        System.out.println(MathUtils.power(2, 3));
        System.out.println(StringUtils.capitalise("malak"));
        System.out.println(StringUtils.repeat("hi", 3));
        System.out.println(StringUtils.countChar("hello",'l'));
        System.out.println(Calculator.add(2,3));
        System.out.println(Calculator.add(2.5, 3.5));
        System.out.println(Calculator.add(1, 2, 3));
        System.out.println(Calculator.add("Hi ","there"));
        System.out.println(BankUtils.simpleInterest(1000,10,2));
        System.out.println(BankUtils.compoundInterest(1000,10,2));
        System.out.println(BankUtils.formatAmount(500,"EGP"));
        System.out.println(NumberUtils.isPrime(7));
        System.out.println(NumberUtils.isPalindrome(121));
        System.out.println(NumberUtils.reverseNumber(123));
        System.out.println(NumberUtils.sumDigits(123));
    }
}