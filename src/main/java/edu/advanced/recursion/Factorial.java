package edu.advanced.recursion;

public class Factorial {

    public static int doFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            int x = n * doFactorial(n-1);
            return x;
        }
    }

    public static void main(String[] args) {
        System.out.println("Factorial: ");
        int number = 9;
        System.out.println(number + "! = " + doFactorial(number));
    }
    
}
  